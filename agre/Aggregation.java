package com.agre;
class Address{
	String city,state,country;
	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country =country;
	}
}

public class Aggregation {
	int id;
	   String name;
	   Address address;
	   
	   
	   public Aggregation(int id, String name, Address address) {
		   this.id = id;
		   this.name = name;
		   this.address = address;
	   }
	   
	   void display() {
		   System.out.println("10"+id +"Name "+name);
		   System.out.println(address.city+" "+address.state+" "+address.country);// print the address of employee
		   	
	   }
   public static void main(String[] args) {
	   String country = "india";
	String city = "indore";
	String state = "Madhaya Pradesh";
	Address add1 = new Address(city,state,country);
	   Aggregation emp1 = new Aggregation(1,"aaru",add1);
	    emp1.display();
	   
   }
}
