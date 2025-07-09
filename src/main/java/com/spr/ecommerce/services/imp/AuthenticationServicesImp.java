package com.spr.ecommerce.services.imp;

import com.spr.ecommerce.entity.User;
import com.spr.ecommerce.repository.UserRepository;
import com.spr.ecommerce.services.AuthenticationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class AuthenticationServicesImp implements AuthenticationServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean authenticate(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsernameAndPassword(username, password);


        return userOptional.isPresent();
    }
}
