package com.example.study.controller;
//GET : 조회 ( SELECT) /user/{id}
//POST : 생성 (CRAET) /user
//PUT /PATCH : 수정 (UPDATE)
//DELETE : 삭제(DELETE) /user/{1}
import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    //HTML <from>
    //ajax 콜
    //http post body -> data
    //@RequestMapping(method = RequestMethod.POST,path = "/postMethod")
    @PostMapping("/postMethod")  //localhost:8080/api/postMethod
    public SearchParam PostMethod(@RequestBody SearchParam searchParam){
                                  // html body로 설정
        return searchParam;

    }
    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping ("/patchMethod")
    public void patch(){

    }
}
