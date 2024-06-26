package abstractclsmthd;
import java.util.*;
public class mygamingcode{
	
public static void main(String[]args) {

	System.out.println("Please Enter Number");
	 Scanner sc =new Scanner(System.in);
	 sc.nextInt();
	
 class Instructor {

	 int ex1;
	 String ex2;
	 public void Instructor1()
	 {
		 
	 }
	 public void Instructor2() {
		 
	 }
	 
}	
		
 class  Students
 {
	 int id;
	 String name;
	 String course;
	 
	 public void Student1() {
		 
	 }
	 public void Student2() {
		 
	 }
	 public void Student3() {
		 
	 }
	 
 }
	
 class course extends Students{
	 
	 
	 int period;
	 
	 public void Courses1(int period) {
		 
		if(period==1)
		{
		for(period=0;period<10;period++)
		{
			System.out.println("it will allow maximum Students"+period);
		}
		}
	 }
	 public void Courses2() {
		 if(period==2)
		 {
		for(period=0;period<2;period++)
		{
			System.out.println("it will allow maximum students upto 2"+period);
		}
		 }
	 }
	 public void Courses3() {
		if(period==1) {
			for(period=1;period<5;period++)
			{
				System.out.println("It will allow maximum Students upto 5");
			}
		}
	 }
	 
 }
}
 	 
 
}