package com.serhii.restjwtproject.demo.dtos;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;

}
