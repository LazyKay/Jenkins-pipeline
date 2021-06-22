package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PersonTest {
	private Person person = null;
	@BeforeEach
	void setUp() throws Exception {
		person = new Person(1,"Chand","Kishor",8171170097L);
	}

	@AfterEach
	void tearDown() throws Exception {
		person = null;
	}

	@Disabled
	@Test
	void testAllArgConstructor() {
		Person person = new Person(1,null,null,null);
		assertThrows(IllegalArgumentException.class,()->person.getClass());
	}



	@Test
	void testGetPersonId() {
		assertEquals(1,person.getPersonId());
	}

	@Test
	void testSetPersonId() {
		person.setPersonId(2);
		assertEquals(2,person.getPersonId());
	}

	@Test
	void TestSetPersonFirstName() {
		person.setFirstName("Goku");
		assertEquals("Goku",person.getFirstName());
	}
}
