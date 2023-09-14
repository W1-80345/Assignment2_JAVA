/*Create a class called Date that includes three instance variables—a
month (type int), a day (type int) and a year (type int). Provide a constructor
that initializes the three instance variables and assumes that the values
provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and
year separated by forward slashes (/). Write a test application named
DateTest that demonstrates class Date’s capabilities*/

import java.util.Scanner;
class DateMain{
	int Month;
	int Day;
	int Year;
	
	
	
DateMain(int Month, int Day, int Year)
{
	this.Month=Month;
	this.Day=Day;
	this.Year=Year;
}


public int getMonth()
{
	return Month;
}



public int getDay()
{
	return Day;
}


public int getYear()
{
	return Year;
}

public void setDay(int Day)
{
	this.Day = Day;
}

public void setMonth(int Month)
{
	this.Month = Month;
}

public void setYear(int year)
{
	this.Year = Year;
}



void disp()
	{
		System.out.println("Date: "+ Day +"/"+
				           + Month +"/"+
				           + Year );
	}

void accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Day: ");
	Day=sc.nextInt();
	
    System.out.println("Enter Month: ");
    Month=sc.nextInt();
    
    System.out.println("Enter Year: ");
    Year=sc.nextInt();
}
}
public class Assign2_3 {

	public static void main(String[] args) {
	
		DateMain d1= new DateMain(14, 11, 2023);
		d1.disp();
		d1.accept();
		d1.disp();
		

	}

}

/*
Date: 11/14/2023
Enter Day: 
19
Enter Month: 
08
Enter Year: 
2000
Date: 19/8/2000
*/
