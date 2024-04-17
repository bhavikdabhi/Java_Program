import java.util.Scanner;
class main
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		int u,v,a,s;
	
			System.out.println("Enter number u:-");
			u=sc.nextInt();
			
			System.out.println("Enter number v:-");
			v=sc.nextInt();

			System.out.println("Enter number a:-");
			a=sc.nextInt();

			System.out.println("Enter number s :-");
			s=sc.nextInt();

            int sum;
		    sum = (v*v-u*u)/(2*a*s);
			System.out.println(sum);
		
	}
}