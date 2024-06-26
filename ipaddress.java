package abstractclsmthd;

import java.util.*;

public class ipaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1={2,3,4,5,6,5,2,3};
		{
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=i+1;j<arr1.length;j++)
				{
					if(arr1[i]==arr1[j])
					{
						System.out.println("Duplicate elements in an array are "+arr1[j]);
					}
				}
			}
		}
	
	
			
		
		
		
	}


