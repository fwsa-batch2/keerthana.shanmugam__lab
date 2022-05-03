package com.testFile;

class grandFather{
	String grandpa = "I am oldest";
}
class father extends grandFather{
	String appa = "I am second oldest";
}
class son extends father{
	String child = "I am youngest";
}
public class inheritFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      son family = new son();
      System.out.println(family.grandpa);
      System.out.println(family.appa);
	}

}
