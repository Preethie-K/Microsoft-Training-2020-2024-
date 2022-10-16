//Factorial

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int index=1;index<=n;index++)
		{
            fact=fact*index;
		}
		System.out.println("Factorial of given number is "+fact);

	}
}