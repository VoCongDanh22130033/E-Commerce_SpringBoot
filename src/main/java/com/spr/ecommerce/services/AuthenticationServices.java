package com.spr.ecommerce.services;

public interface AuthenticationServices {
    //check login
    boolean authenticate(String username, String password);

}
