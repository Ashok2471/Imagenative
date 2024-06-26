package abstractclsmthd;

public class Findminimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int temp,size;
		int[] array= {10,20,30,40,50,90};
		size=array.length;
		{
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(array[i]>array[j])
					{
						temp=array[j];
						array[i]=array[j];
						temp=array[j];
					}
				}
			}
				
				System.out.println("Third Largest Element is" +array[size-3]);
				
					}
				}
				
}

	