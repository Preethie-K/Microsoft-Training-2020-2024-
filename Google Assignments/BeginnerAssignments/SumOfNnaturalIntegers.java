//SumofFirstNnaturalIntegers

import java.util.*;
class Main
{
	public static void main(String args[])
	{

       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sum=0;
       for(int index=1;index<=n;index++)
       {
           sum=sum+index;
       }
       System.out.println("Sum of first "+n+" natural integers is "+sum);
	}
}