package com.in28minutes.springboot.web.nbs03.service;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//Spring bean
@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		//gbanet2002, Keysha909
		return userid.equalsIgnoreCase("gbanet2002") && password.equalsIgnoreCase("Keysha909");
	}
}
