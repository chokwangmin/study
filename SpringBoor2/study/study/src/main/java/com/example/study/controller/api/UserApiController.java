package com.example.study.controller.api;


import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.UserApiRequest;
import com.example.study.model.network.response.UserApiResponse;
import com.example.study.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/api/user")

public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {




    @Autowired
    private UserApiLogicService userApiLogicService;

    @Override
    @PostMapping("") // /api/user
    public Header<UserApiResponse> create(@RequestBody UserApiRequest userApiRequest) {
        log.info("{}", userApiRequest);
        return userApiLogicService.create(userApiRequest);
    }

    @GetMapping("")  //페이징
    public Header<List<UserApiResponse>> search(@PageableDefault(sort = "id", direction = Sort.Direction.ASC, size =10) Pageable pageable){
        log.info("{}", pageable);

        return userApiLogicService.search(pageable);
    }

    @Override
    @GetMapping("{id}")  // localhost/api/user/{id}
    public Header<UserApiResponse>  read(@PathVariable(name="id") Long id) {
        log.info("{}, id");
        return userApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<UserApiResponse>  update(@RequestBody UserApiRequest userApiRequest) {
        log.info("{}",userApiRequest);
        return userApiLogicService.update(userApiRequest);
    }

    @Override
    @DeleteMapping("{id}")
    public Header<UserApiResponse>  delete(@PathVariable Long id) {

        return userApiLogicService.delete(id);
    }
}
