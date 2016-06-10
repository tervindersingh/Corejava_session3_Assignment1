import java.util.Scanner;
public class Number
{	double a,sq,sc;
	public void CalOperation(double b)
	{
		a=b;
		sq=Math.sqrt(a);
		sc=Math.cbrt(a);
		System.out.println("Square root of the Number is :"+sq);
		System.out.println("Cube root of the Number is: "+sc);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		double n=sc.nextDouble();
		Number N1=new Number();
		N1.CalOperation(n);
	}
}