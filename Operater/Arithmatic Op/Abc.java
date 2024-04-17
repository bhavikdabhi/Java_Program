import java.util.Scanner;
class Abc{
				
		int a,b;
		Scanner sc=new Scanner(System.in);

			void getData()
			{
				System.out.println("Enter value of A :-");
				a=sc.nextInt();

				System.out.println("Enter value of B :-");
				b=sc.nextInt();
			}

			void show()	
			{
				System.out.println("Sum is :- "+ (a+b));
				System.out.println("Abs is :- "+ (a-b));
				
				System.out.println("Mul is :- "+ (a*b));
				System.out.println("Div is :- "+ (a/b));
			}
	

}