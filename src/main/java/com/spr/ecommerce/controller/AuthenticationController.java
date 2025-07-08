package com.spr.ecommerce.controller;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    //login
    @PostMapping("/sing-in")
    public ResponseEntity<?> singIn(@RequestParam String username, @RequestParam String password) {
        return ResponseEntity.ok().build();
    }

}
