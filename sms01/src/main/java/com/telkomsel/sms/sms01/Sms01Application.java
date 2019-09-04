package com.telkomsel.sms.sms01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sms01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sms01Application.class, args);
		System.out.print("SMS App Running");
	}

}
