package com.healthmgmt.app.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        //default login
        return userid.equalsIgnoreCase("test")
                && password.equalsIgnoreCase("test");
    }

}