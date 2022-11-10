package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender sendemail;
	
	@Override
	public String sendSimpleMail(String to, String sub, String email) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setSubject(sub);
		mailMessage.setText(email);
		
		sendemail.send(mailMessage);
		return null;
	}

}
