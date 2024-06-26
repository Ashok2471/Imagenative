package abstractclsmthd;

import java.util.*;

public class Permutations {

public static void main(String[] args)
{
		permutationwithRepeation("abc");
}

public static void permutationwithRepeation(String input)
{
	
	System.out.println("The given string is: ABC");
	System.out.println("The permuted strings are:");
	showPermutation(input,"");
}
private static void showPermutation(String input,String NewStringToPrint)
{
if(NewStringToPrint.length()==input.length()) {
	System.out.println(NewStringToPrint);
	return;
}
for(int i=0;i<input.length();i++)
{
showPermutation(input, NewStringToPrint + input.charAt(i));	

}
}
}