//area

import java.util.*;
class Main
{
	public static void main(String args[])
	{
           Scanner sc=new Scanner(System.in);
           Double rad=sc.nextDouble();
           double area=(Math.PI)*rad*rad;
           System.out.printf("%.2f",area);
	}
}