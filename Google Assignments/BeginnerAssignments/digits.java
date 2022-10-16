//digits

import java.util.*;
class Main
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b;
        System.out.print("The digits of a number ");
        while(n!=0)
        {
         b=n%10;
         System.out.print(b+" ");
         n=n/10;
        }

	}
}