package problem4;

import java.util.Scanner;

public class MathsEquation {
	public static void main(String ar[])
	{
	int a,b,c,d;
	Scanner s=new Scanner(System.in);
	System.out.print(" please enter values \na = ");
	a=s.nextInt();
	System.out.print("b = "+"\n");
	b=s.nextInt();
	System.out.print("c= "+"\n");
	c=s.nextInt();
	System.out.println("The quadratic equation you entered is "+a+"+x2+"+b+"+x+"+c+"=0");
	System.out.print("real and imaginary roots are");
	d=(b*b)-4*(a*c);
	if(d>0)
	{
	System.out.println("Real and distinct");
	double rt1=(-b+Math.sqrt(d))/(2*a);
	double rt2=(-b-Math.sqrt(d))/(2*a);
	System.out.print("Roots are "+rt1 +" "+rt2);
	}
	else if(d==0)
	{
	System.out.println("Real and equal");
	double rt1=(-b)/(2*a);
	double rt2=(-b)/(2*a);
	System.out.print("Roots are "+rt1 +" "+rt2);
	}
	else if(d<0)
	{
	System.out.println("Imaginary");
	}
	}

}
