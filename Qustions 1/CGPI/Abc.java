import java.util.Scanner;

class Abc{

			float s1,s2,s3;
			Scanner sc = new Scanner(System.in);
			void getData()
			{
			System.out.println("Enter Value of Subject 1 :-");
			s1=sc.nextFloat();

			System.out.println("Enter Value of Subject 2 :-");
			s2=sc.nextFloat();

			System.out.println("Enter Value of Subject 3 :-");
			s3=sc.nextFloat();

			}

				void Add(){
					float sum;
					sum=(s1+s2+s3)/30;
					System.out.println("Your CGPI is :- "+ sum );
					}


}