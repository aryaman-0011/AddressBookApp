package com.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.addressbookapp.model.Contact;

@SpringBootApplication
public class AddressbookappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookappApplication.class, args);

		System.out.println("Welcome to Address Book");

		Contact contact = new Contact("Aryaman", "Kushwaha", "MP Nagar", "Bhopal", "Madhya Pradesh", "462001",
				"9876543210", "aryaman@email.com");

		System.out.println(contact);

	}

}
