//area

import java.util.*;
class Main
{
    static void area(double [] x, double [] y)
	{
		double area=Math.abs(x[0]*(y[1]-y[2]) + x[1]*(y[2]-y[0]) + x[2]*(y[0]-y[1]))/2;
		System.out.println(area);
	}
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
        double [] x={2,3,4};
        double [] y={4,2,6};
        area(x,y);
	}
}