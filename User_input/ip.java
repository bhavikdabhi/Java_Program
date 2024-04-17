import java.util.Scanner;

class A{
    public static void main(String[] args){

            int a,b;
            float c,d;
                
            Scanner sc =new Scanner(System.in);

            System.out.println("Enter First Number :- ");
            a=sc.nextInt();
            

            System.out.println("Enter Second Number :-");
            b=sc.nextInt();

            System.out.println("Sum of Integer Number is :-");

            System.out.println((a+b));

            System.out.println("Enter Third Number :-");
            c=sc.nextFloat();

            System.out.println("Enter Fourth Number :-");
            d=sc.nextFloat();

            System.out.println("Sum of Float Number is :- ");
            
            System.out.println((c+d));

            String str = sc.nextLine();
            System.out.println(str);



}
}