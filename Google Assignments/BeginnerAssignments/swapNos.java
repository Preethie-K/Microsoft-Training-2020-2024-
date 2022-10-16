//swap

import java.util.*;
class Main
{
	public static void main(String args[])
	{
           Scanner sc=new Scanner(System.in);
           int x=sc.nextInt();
           int y=sc.nextInt();
           int z;
           z=x+y;
           x=z-x;
           y=z-y;
           System.out.println("Numbers after swapping "+x+" "+y);
	}
}