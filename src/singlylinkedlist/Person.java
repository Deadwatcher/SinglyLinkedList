/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author
 */
public class Person {
    private String firstname;
	private String lastname;
	private String address;
	private String fullname;
	
	public Person(String firstname, String lastname, String address) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
	}
	
	public void set_FirstName(String firstname){
            this.firstname = firstname;
	}
	
	public void set_LastName(String lastname){
            this.lastname = lastname;
	}
	
	public void set_Address(String address){
            this.address = address;
	}
	
	public String get_FirstName(){
            return firstname;
	}
	
	public String get_LastName(){
            return lastname;
	}
	
	public String get_Address(){
            return address;
	}
	
	public String get_FullName(){
            return fullname = this.firstname + ", " + this.lastname + ", " + this.address;
	}
	
}
    

