package com.emailsender;

import com.emailsender.Service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {
	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() {
		service.sendSimpleEmail("vivekkr210194@gmail.com",
				"Java Machine Test",
				"This is Softude Second Round Java Machine Test");

	}
}
