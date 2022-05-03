
package com.Fwsa;

class UserData{
	private String email;
	private int password;
	
	public String getemail() {
	    return email;
	}
	
	public void setemail(String email){
		this.email = email;
	}
	
	public int getpassword() {
		return password;
	}
	
	public void setpassword(int password) {
		 this.password = password;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      UserData myObj = new UserData();
      
      myObj.setemail("keerthana@mail.com");
      myObj.setpassword(45678);
      
      System.out.println("email : "+ myObj.getemail());
	}

}

