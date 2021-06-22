package com.sapient.trg.pl;

import com.sapient.trg.service.Person;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
           Person person = new Person(1,"Kishor","Chand",8171170097L);
           System.out.println(person.getFirstName());
           System.out.println(person.getLastName());
	}
}
