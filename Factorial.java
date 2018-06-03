package Tiya;
public class Factorial
{
	public int fact(int a)
	{
		if(a==1)
			return 1;
		else
			return a*fact(a-1);
	}
	public static void main(String args[])
	{
		int a=5;
		Factorial obj=new Factorial();
		System.out.println("The factorial of "+a+" is "+obj.fact(a));
	}
} 