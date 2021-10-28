package com.AnthonyServera.handson5;

public class HandsOn {

	public static void main(String[] args) {
		  
		  	System.out.println("CREATE PARAMETER 1");
		  	Person p1 = new Person();
		  	System.out.println("Parmeter 1 (no paramaters) age = " + p1.getAge());
		  	
	    
	        System.out.println("CREATE PARAMETER 2");
	        Person p2 = new Person("Billy");
	        System.out.println("Parameter2 (1 parameter) age = " + p2.getAge());

	        
	        
	        System.out.println("CREATE PARAMETER 3");
	        Person p3 = new Person("Sally", "Smith");
	        System.out.println("Parameter 3 (2 parameters) age = " + p3.getAge());

	        
	        System.out.println("CREATE PARAMETER 4");
	        Person p4 = new Person("Sofia", "Gonzalez", 24);
	        System.out.println("Parameter 4 (all parameters) age = " + p4.getAge());

	       
	        System.out.println("CREATE PARAMETER 5");
	        Person p5 = new Person("Bad", "Age", -10);
	        System.out.println("Parameter 5 (all parameters bad age) age = " + p5.getAge());

	
	        System.out.println("SET INVALID AGE");
	        p4.setAge(-2);
	        System.out.println("Set Parameter 4 age = " + p4.getAge());

	}

}



 class Person{


	private String firstName;
	private String lastName;
	private int age;
	
    // constructor
    public Person(){
        firstName = "";
        lastName = "";
        age = 0;
    }

    // overloaded constructor
    
    public Person(String firstName)
    {
    	this.firstName = firstName;
    	lastName = "";
    	age = 0;
    }
    
    public Person(String firstName, String lastName)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	age = 0;
    }
    
    
    public Person(String firstName, String lastName, int age)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.age = age;
    	ValidateAge();
    }
    
    
   private void ValidateAge()
   {
	   
	   if (age < 0)
	   {
		   age = 0;
		   System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead.");
	   }
	   
   }
    
    
    // getter method
    public String getFirstName(){
        return firstName;
    }

    // setter method
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    
    
    
    // getter method
    public String getLastName(){
        return lastName;
    }

    // setter method
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

   
    
    // getter method
    public int getAge(){
        return age;
    }

    // setter method
    public void setAge(int age){
        this.age = age;
        ValidateAge();
    }




	
 
	
	
}

