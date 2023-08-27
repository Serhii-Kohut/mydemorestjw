package com.serhii.restjwtproject.demo.dtos;

import lombok.Data;

import javax.persistence.Column;
@Data
public class RegistrationUserDto {
    private Long id;
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
}
