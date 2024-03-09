package com.emailsender;

import com.emailsender.Service.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MockitoExtension.class)
class EmailSenderApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Mock
	private JavaMailSender mailSender;

	@InjectMocks
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {
		String toEmail = "recipient@example.com";
		String subject = "Test Subject";
		String body = "Test Body";

		boolean result = emailSenderService.sendSimpleEmail(toEmail, subject, body);

		assertTrue(result, "Email sending should be successful");

	}

}
