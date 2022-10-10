package com.example.study.service;


import com.example.study.ifs.CrudInterface;
import com.example.study.model.entity.User;
import com.example.study.model.network.Header;
import com.example.study.model.network.Pagination;
import com.example.study.model.network.request.UserApiRequest;
import com.example.study.model.network.response.UserApiResponse;
import com.example.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserApiLogicService implements CrudInterface<UserApiRequest, UserApiResponse> {

   @Autowired
   private UserRepository userRepository;


    //1. request user data 받음
    //2. user 생성-> db
    //3. 생성된 데이터 user respons 로 리턴 + Header 정보 붙여서
    @Override
    public Header<UserApiResponse> create(UserApiRequest request) {
        //새로운유저 셋팅
        User user = new User();
        user.setAccount(request.getAccount());
        user.setPassword(request.getPassword());
        user.setStatus("REGISTERED");
        user.setPhoneNumber(request.getPhoneNumber());
        user.setEmail(request.getEmail());
        user.setCreatedAt(LocalDateTime.now());

       User newUser = userRepository.save(user);

        return response(newUser);
    }

    @Override
    public Header<UserApiResponse> read(Long id) {

        //id -> repository getOne byId
         Optional<User> optUser = userRepository.findById(id);

        return  optUser
                 .map(user -> response(user))
                 .orElseGet(() ->Header.ERROR("데이터없음")
                 );
    }

    @Override
    public Header<UserApiResponse> update(UserApiRequest request) {

        Optional<User> optUser = userRepository.findById(request.getId());

        return optUser.map(user -> {

            user.setAccount(request.getAccount());
            user.setPassword(request.getPassword());
            user.setEmail(request.getEmail());
            user.setStatus(request.getStatus());
            user.setPhoneNumber(request.getPhoneNumber());
            user.setUpdateAt(LocalDateTime.now());

            return userRepository.save(user);


        })
                .map(upUser -> response(upUser))
                .orElseGet(() ->Header.ERROR("데이터 없음"));

    }

    @Override
    public Header<UserApiResponse> delete(Long id) {

        //id user 가져오기
        Optional<User> optUser = userRepository.findById(id);

        //1. user 로 삭제
        return optUser
                .map(user ->{
                    userRepository.delete(user);
                    return response(user);
                }).orElseGet(() -> Header.ERROR("해당 데이터 없음"));

    }

    private Header<UserApiResponse> response(User user){
        UserApiResponse userApiResponse = new UserApiResponse();

        userApiResponse.setId(user.getId());
        userApiResponse.setAccount(user.getAccount());
        userApiResponse.setPassword(user.getPassword());
        userApiResponse.setEmail(user.getEmail());
        userApiResponse.setPhoneNumber(user.getPhoneNumber());
        userApiResponse.setStatus(user.getStatus());
        userApiResponse.setReqisterAt(user.getRegisteredAt());
        userApiResponse.setUnreqisterAt(user.getUnregisteredAt());

            return Header.OK(userApiResponse);

    }

    private UserApiResponse response2(User user){
        // user -> userApiResponse

        UserApiResponse userApiResponse = UserApiResponse.builder()
                .id(user.getId())
                .account(user.getAccount())
                .password(user.getPassword()) // todo 암호화, 길이
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .status(user.getStatus())
                .reqisterAt(user.getRegisteredAt())
                .unreqisterAt(user.getUnregisteredAt())
                .build();

        return userApiResponse;
    }
    public Header<List<UserApiResponse>> search(Pageable pageable) {
        Page<User> users =  userRepository.findAll(pageable);

        List<UserApiResponse> userApiResponseList = users.stream()
                .map(user -> response2(user))
                .collect(Collectors.toList());

        Pagination pagination = new  Pagination();
        pagination.setTotalPages(users.getTotalPages());
        pagination.setTotalElements(users.getTotalElements());
        pagination.setCurrentPage(users.getNumber());
        pagination.setCurrentElements(users.getNumberOfElements());


        return Header.OK(userApiResponseList, pagination);

    }
}
