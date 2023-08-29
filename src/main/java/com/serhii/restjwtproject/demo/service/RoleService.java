package com.serhii.restjwtproject.demo.service;

import com.serhii.restjwtproject.demo.entities.Role;
import com.serhii.restjwtproject.demo.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole(){
        return roleRepository.findByName("ROLE_USER").get();
    }
}
