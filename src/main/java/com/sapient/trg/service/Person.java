package com.sapient.trg.service;

public class Person {
	    private Integer personId;
        private String lastName;
        private String firstName;
        private Long mobile;
        public Person() {
        	
        }
        public Person(Integer personId, String firstName, String lastName, Long mobile) {
			super();
			if(firstName==null && lastName==null)
				throw new IllegalArgumentException("null arguments");
			this.personId = personId;
			this.lastName = lastName;
			this.firstName = firstName;
			this.mobile = mobile;
		}
		public Integer getPersonId() {
			return personId;
		}
		public void setPersonId(Integer personId) {
			this.personId = personId;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public Long getMobile() {
			return mobile;
		}
		public void setMobile(Long mobile) {
			this.mobile = mobile;
		}
		
        
}
