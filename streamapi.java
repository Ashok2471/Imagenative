package abstractclsmthd;

import java.util.Scanner;

public class streamapi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your String");
	String sentence=sc.nextLine();
	
	char letters[]=sentence.toCharArray();
	int alphabets=0;
	int numbers=0;
	int other=0;
	int spaces=0;
	
	for(int i=0;i<letters.length;i++)

	{
		if(Character.isLetter(letters[i]))
		{
			alphabets++;
		}else if(Character.isDigit(letters[i]))
		{
			numbers++;
		}else if(Character.isSpaceChar(letters[i]))
		{
			spaces++;
		}else
		{
			other++;
		}
	}
	
	System.out.println("Alphabets:" +alphabets);
	System.out.println("Numbers:" +numbers);
	System.out.println("Spaces:" +spaces);
	System.out.println("Special:" +other);

	sc.close();
	}

	

}
