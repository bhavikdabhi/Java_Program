import java.util.Scanner;
class Abc
{
		int a,b;
	void getData()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of A :- ");
		a=sc.nextInt();
		System.out.println("Enter Valur of B :- ");
		b=sc.nextInt();
	}
	void showData()
	{	
		System.out.println("a=b");
		System.out.println(a=b);

		
		System.out.println("a +=b");
		System.out.println(a +=b);

		
		System.out.println("a -=b");
		System.out.println(a -=b);

		
		System.out.println("a *=b");
		System.out.println(a *=b);
	}
}