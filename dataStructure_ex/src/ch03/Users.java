package ch03;

public class Users {

	class Address{
		
		class Geo{
			String lat;
			String lng;
		}
		
		String street;
		String suite;
		String city;
		String zipcode;
		Geo geo;
		
	}
	
	class Company{
		String name;
		String catchPhrase;
		String bs;
	}
	
	int id;
	String name;
	String username;
	String email;
	Address address;
	String phone;
	String website;
	Company company;
	
	
	
}
