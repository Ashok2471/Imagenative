package abstractclsmthd;

import java.util.ArrayList;
import java.util.List;

public class maximumoccurence {
	
	private int employeeid;
	private String employeename;
	private double salary;
	
	public maximumoccurence(int employeeid, String employeename, double salary)
	
	{
		this.employeeid=employeeid;
		this.employeename=employeename;
		this.salary=salary;
		
	}
	  

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			maximumoccurence mc1=new maximumoccurence(1,"Ashok",20000.00);
			maximumoccurence mc2=new maximumoccurence(2,"new",30000.00);
			maximumoccurence mc3=new maximumoccurence(3,"Nani",40000.00);
			maximumoccurence mc4=new maximumoccurence(4,"Varma",50000.00);
			
			List<maximumoccurence> maximumoccurenceList= new ArrayList<maximumoccurence>();
			
			maximumoccurenceList.add(mc1);
			maximumoccurenceList.add(mc2);
			maximumoccurenceList.add(mc3);
			maximumoccurenceList.add(mc4);
			 
			System.out.println("Name" + "\t" + "ID");
			
			maximumoccurenceList.stream().filter(emp->emp.salary>=30000.00).forEach(emp->System.out.println(emp.employeename+"\t"+emp.employeeid));
			 			
	}
}


