package abstractclsmthd;

public class Streams {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		
		int[] arr= {10,20,30,40,50,60,70};
		int temp,size;
		size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
					
			System.out.println("The Largest Element of an array is"+arr[size-1]);
		
	
	}
}
