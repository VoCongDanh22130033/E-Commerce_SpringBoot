package com.spr.ecommerce.controller;

import com.spr.ecommerce.payload.response.BaseResponse;
import com.spr.ecommerce.repository.UserRepository;
import com.spr.ecommerce.services.AuthenticationServices;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationServices authenticationServices;


    //login
    @PostMapping("/sign-in")
    public ResponseEntity<?> singIn(@RequestParam String username, @RequestParam String password) {
        boolean isSuccess = authenticationServices.authenticate(username, password);

        BaseResponse response = new BaseResponse();
        response.setData(isSuccess);
        response.setMessage(isSuccess ? "successful" : "failed");
        response.setCode(isSuccess ? 0 : 1);

        return ResponseEntity.ok(response);
    }

}
