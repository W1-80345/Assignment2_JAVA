/*-------------------Assignment 2-------
                    Question No. 2
Create a class called Employee that includes three instance variables—a
first name (type String), a last name (type String) and a monthly salary
(double). Provide a constructor that initializes the three instance variables.
Provide a set and a get method for each instance variable. If the monthly
salary is not positive, do not set its value. Write a test application named
EmployeeTest that demonstrates class Employee’s capabilities. Create two
Employee objects and display each object’s yearly salary. Then give each
Employee a 10% raise and display each Employee’s yearly salary again.*/

import java.util.Scanner;

class Employee{
	String FirstName;
	String LastName;
	double Salary;
	
Employee(String FirstName, String LastName, double Salary)
{
this.FirstName=FirstName;
this.LastName=LastName;
this.Salary=Salary;	
}


public String getFirstName()
{
	return FirstName;
}


public String getLastName()
{
	return LastName;
}


public double Salary()
{
	return Salary;
}


public void setFirstName(String FirstName)
{
	this.FirstName = FirstName;
}


public void setLastName(String LastName)
{
	this.LastName = LastName;
}


public void setSalary(double Salary)
{
	this.Salary = Salary;
}



void accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Name: ");
	FirstName=sc.next();
	
    System.out.println("Enter Last Name: ");
    LastName=sc.next();
    
    System.out.println("Enter Salary: ");
    Salary=sc.nextDouble();
}


void disp()
{
	System.out.println("First Name: " +FirstName+" "+
			            "Last Name: " +LastName+" "+
			            "Salary: " + Salary);
}

void cal()
{
	double CurrentSalary= Salary*12;
	System.out.println("Yearly Salary: " +Salary*12);
	System.out.println("New Salary: " + (CurrentSalary*0.1)+Salary);
	/*Absolute Increase = (Rs. 50,000 * 10) / 100 = Rs. 5,000s
			New Salary = Rs. 50,000 + Rs. 5,000 = Rs. 55,000*/
	
	
}



}


public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Shruti", "Sawant", 80675.87);
		e1.accept();
		e1.disp();
		e1.cal();
		
		Employee e2 = new Employee("Prasad", "Chavan",90354.76 );
		e2.accept();
		e2.disp();
	    e2.cal();

	}

}

/*
-------------Output-----------------
Enter First Name: 
Shruti
Enter Last Name: 
Sawant
Enter Salary: 
50000
First Name: Shruti Last Name: Sawant Salary: 50000.0
Yearly Salary: 600000.0
New Salary: 60000.050000.0
Enter First Name: 
Prasad
Enter Last Name: 

Chavan
Enter Salary: 
70000
First Name: Prasad Last Name: Chavan Salary: 70000.0
Yearly Salary: 840000.0
New Salary: 84000.070000.0
*/
