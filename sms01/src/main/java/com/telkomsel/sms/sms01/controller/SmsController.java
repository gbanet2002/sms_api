package com.telkomsel.sms.sms01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telkomsel.sms.sms01.model.sendSms;

@Controller
public class SmsController {
	
	@Autowired
	sendSms sm;
	
	@RequestMapping(value="/SMS-API", method = RequestMethod.GET)
	@ResponseBody
	public String APISMS(@RequestParam String sender, @RequestParam String msisdn, @RequestParam String text) {
		String resp = sm.send(sender, msisdn, text);
		return resp;
	}
}
