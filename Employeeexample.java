package abstractclsmthd;

import java.util.ArrayList;
import java.util.List;

class Employeeexample
		{
		private int employeeid;
		private String employeename;
		private double salary;
		public Employeeexample(int employeeid,String employeename,double salary)
		{
		this.employeeid=employeeid;
		this.employeename=employeename;
		this.salary=salary;
		}
		public static void main(String[] args)
		{
		Employeeexample obj1=new Employeeexample(1,"Ashok",20000.00);
		Employeeexample obj2=new Employeeexample(2,"Lanke",30000.00);
		Employeeexample obj3=new Employeeexample(3,"Nani",40000.00);
		Employeeexample obj4=new Employeeexample(4,"Varma",5000.00);
		Employeeexample obj5=new Employeeexample(5,"Renew",10000.00);

		List<Employeeexample> employeelist= new ArrayList<Employeeexample>();
		employeelist.add(obj1);
		employeelist.add(obj2);
		employeelist.add(obj3);
		employeelist.add(obj4);
		employeelist.add(obj5);
		
		
		
		employeelist.stream().filter(emp->emp.salary>20000.00).forEach(emp->System.out.println(emp.employeename+"\t"+emp.employeeid));


		}
		}
		