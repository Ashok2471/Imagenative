package abstractclsmthd;

public class RevereofArray {	
public static void main(String[] args)
{
	int[] arr=new int[]{473,577,698};
	System.out.println("Original Array");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+"");
	}
	System.out.println();
	System.out.println("The reverse of  an array is:");
	for(int i=arr.length-1;i>=0;i--)
	{

	System.out.println(arr[i]+"");

	}
	}
	}
