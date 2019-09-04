package com.telkomsel.nbs02.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("gbanet2002")
                && password.equalsIgnoreCase("Keysha909");
    }
}
