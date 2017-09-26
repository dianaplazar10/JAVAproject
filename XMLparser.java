package com.soap.xmlParse;
/*
<?xml version="1.0" encoding="UTF-8"?>
<Employees>
     <Employee ID="1">
          <Firstname>Lebron</Firstname >
          <Lastname>James</Lastname>
          <Age>30</Age>
          <Salary>2500</Salary>
     </Employee>
     <Employee ID="2">
          <Firstname>Anthony</Firstname>
          <Lastname>Davis</Lastname>
          <Age>22</Age>
          <Salary>1500</Salary>
     </Employee>
     <Employee ID="3">
          <Firstname>Paul</Firstname>
          <Lastname>George</Lastname>
          <Age>24</Age>
          <Salary>2000</Salary>
     </Employee>
     <Employee ID="4">
          <Firstname>Blake</Firstname>
          <Lastname>Griffin</Lastname>
          <Age>25</Age>
          <Salary>2250</Salary>
     </Employee>
</Employees>
*/

//reference: https://examples.javacodegeeks.com/core-java/xml/java-xml-parser-tutorial/

//XML parsing can be done in 3 ways in java
//1)DOM parser
//2)SAX Parser
//3)STAX parser, a median between DOM and SAX

class XMLparser{
	
	public static void main(String[] args) {
		
	}
}

class Employee {

    private String ID;
    private String Firstname;
    private String Lastname;
    private int age;
    private double salary;

    public Employee(String ID, String Firstname, String Lastname, int age, double salary) {
         this.ID = ID;
         this.Firstname = Firstname;
         this.Lastname = Lastname;
         this.age = age;
         this.salary = salary;
    }
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}

    @Override
    public String toString() {
         return "<" + ID + ", " + Firstname + ", " + Lastname + ", " + age + ", "
                                  + salary + ">";
    }

	public void setID(String attributeValue) {
		this.ID = attributeValue;		
	}

	public void setFirstname(String firstName) {
		this.Firstname = firstName;
	}

	public void setLastname(String lastName) {
		this.Lastname = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double parseDouble) {
		this.salary =parseDouble;		
	}
	
	
}