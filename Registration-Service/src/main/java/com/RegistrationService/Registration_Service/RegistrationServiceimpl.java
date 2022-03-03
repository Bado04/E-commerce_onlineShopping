package com.RegistrationService.Registration_Service;


import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.RegistrationService.Entity.Customer;
import com.RegistrationService.Exception.CustomerException;
import com.RegistrationService.Repository.CustomerRepo;


//@Component
@Service
public class RegistrationServiceimpl implements RegistrationService {
	@Autowired
	CustomerRepo customerRepo;



	public String addCust(Customer customer) {

		Customer c1 = new Customer();
		c1.setCustId(customer.getCustId());
		c1.setCustName(customer.getCustName());
		c1.setCustEmail(customer.getCustEmail());
		c1.setCustPhoneNumber(customer.getCustPhoneNumber());
		c1.setPassword(customer.getPassword());
		c1.setConfirmPassword(customer.getConfirmPassword());
		try {
			String a = Long.toString(c1.getCustPhoneNumber());

			Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
			Matcher m = ptrn.matcher(a);
			if (!m.find()) {

				throw new CustomerException("Mobile number is not valid");
			}

			Pattern ptrn1 = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
					+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
			Matcher m1 = ptrn1.matcher(c1.getCustEmail());
			if (!m1.find()) {
				throw new CustomerException("Email id is not valid");
			}
			if (c1.getCustEmail().equals("simran@admin.com")) {
				c1.setCustType('A');
			} else
				c1.setCustType('C');

			if (!c1.getPassword().equals(c1.getConfirmPassword())) {
				throw new CustomerException("Password not match");
			}

			Customer c = customerRepo.findByCustEmail(c1.getCustEmail());
			if (c != null) {
				throw new CustomerException("Customer already exists");
			}
		
				customerRepo.saveAndFlush(c1);
				return "User successfully added";
				
			
		} catch (CustomerException e) {
			return e.getMessage();
		}

	}

	public void sendmail(Customer customer) throws MessagingException {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("simran.kkt007@gmail.com", "Simran@21");
			}
		});
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("simran.kkt007@gmail.com", false));

		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(customer.getCustEmail()));
		msg.setSubject("Link For Movie Booking");
		msg.setContent("Registration is Succesfull.... ", "text/html");
		msg.setSentDate(new Date());
		Transport.send(msg);
	}

	@Override
	public Customer custLogin(String custEmail, String password) {
	
	  Customer cust=customerRepo.findByCustEmail(custEmail);
	  if(cust.getCustEmail().equals(custEmail)&&cust.getPassword().equals(password)) {
		  return cust;
	  }
	  return null;
	}


	
	
}
