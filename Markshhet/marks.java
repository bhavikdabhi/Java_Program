import java.util.Scanner;

class A{

            public static void main(String[] args)
           {
                int s1,s2,s3,s4,s5;

                Scanner sc=new Scanner(System.in);

                System.out.println("Enter Subject 1 Marks :-");
                s1=sc.nextInt();

                System.out.println("Enter Subject 2 Marks :-");
                s2=sc.nextInt();

                System.out.println("Enter Subject 3 Marks :-");
                s3=sc.nextInt();

                System.out.println("Enter Subject 4 Marks :-");
                s4=sc.nextInt();

                System.out.println("Enter Subject 5 Marks :-");
                s5=sc.nextInt();

                int sum;

                sum=s1+s2+s3+s4+s5;

                float avg;

                avg=(sum*100)/500;

                 System.out.println("\n"+ sum);


                System.out.println("\n"+ avg);




           } 






}