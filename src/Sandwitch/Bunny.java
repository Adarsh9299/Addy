package Sandwitch;

public class Bunny 
{
	public void Karma ()
	{
		int a = 20;
		System.out.println("The value of A="+a);
		int b = 25;
		System.out.println("The value of B="+b);
		int Sum = a+b;
		System.out.println("Total="+Sum);
	}
	public void Work ()
	{
		int a = 10;
		System.out.println("The value of A="+a);
		int b = 15;
		System.out.println("The value of B="+b);
		int Sum = a-b;
		System.out.println("Total="+Sum);
	}
	public static void main(String[]args)
	{
		Bunny k =new Bunny();
		k.Karma();
		k.Work();
	}
		
}
