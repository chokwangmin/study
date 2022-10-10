package com.example.study.controller;


import com.example.study.model.SearchParam;
import com.example.study.model.network.Header;
import org.springframework.web.bind.annotation.*;

//get 방식
@RestController
@RequestMapping("/api") //http://localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") //localhost:8080/api/getMethod get만 받아줌
    public String getRequest() {
        return "GET 안녕 스트링부트";
    }

    @GetMapping("/getParameter")  // localhost:8080/api/getParameter?id=imoon&password=1234  GET만 받아줌
    public String getParameter(@RequestParam String id, @RequestParam(name="pwd") String password){
                                                                        //이름 변경

        System.out.println("아이디 : " + id);
        System.out.println("password" + password);
        return "아이디는 :" + id + "패스워드:" + password;
    }

    //localhost:8080/api/getmultiParameter?account=abcd&email=skyjkm@tricycle.co.kr&age=36
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){

        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getAge());

        return searchParam;
          //{ "account" : " abcd ", "email" : "skyjkm@tricycle.co.kr", "age" : 36 }
    }
    @GetMapping("/header")
    public Header getHeader(){

        //{"resultCode: "OK" , "description" :"OK}
        return  Header.builder()
                .resultCode("OK")
                .description("OK").build();

    }
}
