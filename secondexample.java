package abstractclsmthd;

import java.util.ArrayList;
import java.util.List;

public class secondexample {

	private int employeeid;
	private String employeename;
	private double employeesalary;
	
	public secondexample(int employeeid,String employeename,double employeesalary)
	{
		this.employeeid=employeeid;
		this.employeename=employeename;
		this.employeesalary=employeesalary;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		secondexample se=new secondexample(1,"ashok",10000.00);
		secondexample se1=new secondexample(2,"lanke",20000.00);
		secondexample se2=new secondexample(3,"varma",30000.00);
		secondexample se3=new secondexample(4,"first",40000.00);
		secondexample se4=new secondexample(5,"second",50000.00);
		secondexample se5=new secondexample(6,"third",60000.00);
		
		 
		List<secondexample> li=new ArrayList<secondexample>();
		
		li.add(se);
		li.add(se1);
		li.add(se2);
		li.add(se3);
		li.add(se4);
		li.add(se5);
		
		
		li.stream().filter(emp->emp.employeesalary==10000.00).forEach(emp->System.out.println(emp.employeeid+"\t"+emp.employeename));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
