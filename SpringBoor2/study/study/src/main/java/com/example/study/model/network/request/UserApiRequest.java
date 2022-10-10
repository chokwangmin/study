package com.example.study.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 기본생성자
@AllArgsConstructor //생성자
@Builder
public class UserApiRequest {

    private Long id;
    private String account;
    private String password;
    private String status;
    private String email;
    private String phoneNumber;

}
