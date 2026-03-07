package com.addressbookapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.addressbookapp.model.Contact;

public class ContactTest {

	@Test
	void testCreateContact() {

		Contact person = new Contact("Aryaman", "Kushwaha", "MP Nagar", "Bhopal", "MP", "462001", "9876543210",
				"aryaman@email.com");

		assertEquals("Aryaman", person.getFirstName());
		assertEquals("Kushwaha", person.getLastName());
		assertEquals("MP Nagar", person.getAddress());
		assertEquals("Bhopal", person.getCity());
		assertEquals("MP", person.getState());
		assertEquals("462001", person.getZip());
		assertEquals("9876543210", person.getPhoneNumber());
		assertEquals("aryaman@email.com", person.getEmail());
	}

}
