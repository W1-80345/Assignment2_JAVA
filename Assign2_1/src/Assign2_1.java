/*
ASSIGNMENT N0. 2
Question No.1
 1.Create a class called Invoice that a hardware store might use to represent
an invoice for an item sold at the store. An Invoice should include four
pieces of information as instance variables—a part number (type String), a
part description (type String), a quantity of the item being purchased (type
int) and a price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method
for each instance variable. calculates the invoice amount (i.e. multiplies the
quantity by the price per item), then returns the amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s
capabilities.
 */

import java.util.Scanner;

class Invoice{
	String PartNumber;
	String PartDescription;
	int Quantity;
	double Price;
	
	
Invoice(String PartNumber, String PartDescription, int Quantity, double Price)
{
	this.PartNumber=PartNumber;
	this.PartDescription=PartDescription;
	this.Quantity=Quantity;
	this.Price=Price;
	

}
	

public String getPartNumber() {
	return PartNumber;
}


public void setPartNumber(String PartNumber) {
	this.PartNumber = PartNumber;
}

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
public String getPartDescription() {
	return PartDescription;
}

public void setPartDescription(String PartDescription) {
	this.PartDescription = PartDescription;
}
	
public int getQuantity() {
	return Quantity;
}

public void setQuantity(int Quantity) {
	if(Quantity<=0)  //If the quantity is not positive, it should be set to 0.
	{
		this.Quantity=0;
		System.out.println("Not valid");
	}
	else {
		
	  // this.Quantity = Quantity;
	}	
	
}

public double getPrice() {
	return Price;
}

public void setPrice(double Item) {
	//If the price per item is not positive, it should be set to 0.0.
	if(Price<0)
	{
		this.Price = 0.0;
	} 
	else {
		//this.Price = Price;
	}	
	

	
}




void accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the PartNumber: ");
	PartNumber=sc.next();
	
	//Scanner sc = new Scanner(System.in);
	System.out.println("Enter the PartDescription: ");
	PartDescription=sc.next();
	
	//Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Quantity: ");
	this.Quantity=sc.nextInt();
	
	//Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Price of the Item: ");
	this.Price = sc.nextDouble();
}


void disp() {
	System.out.println("PartNumber: "+this.PartNumber+" "+
			           "PartDescription: " +this.PartDescription+" "+
			           "Quantity: "+this.Quantity+" "+
			           "Price: "+this.Price);
	
}


//Calculate the total amount by multiplying price and quantity
void cal(){
	
	System.out.println("Invoice Total Amount" + Price*Quantity);
	
}

}



public class Assign2_1 {

	public static void main(String[] args) {
		
		Invoice i = new Invoice("thddsbva", "Printer", 1, 50000.00 );
		
		
		i.accept();
		i.disp();
		i.cal();
		
		//System.out.println("i"+i);	

	}

}
