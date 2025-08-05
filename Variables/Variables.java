import java.util.Scanner;

public class Variables{
    public static void main(String args[])
    {
        System.out.println("Hello World");

        //variables
        String name="Himadri Das";
        int age=25;
        double price=25.24;
        int a=25;
        int b=10;

        b=20;
        name="ironman";
        int sum=a+b;
        int diff=a-b;

        System.out.println(name);
        System.out.println(sum);
        System.out.println(diff);

        //Input
        Scanner sc=new Scanner(System.in);
        String name2=sc.nextLine();
        System.out.println("Hello :"+ name2);


        //take two variables and sum them

        Scanner sh=new Scanner(System.in);
        int c=sh.nextInt();
        int d=sh.nextInt();
        int summ=c+d;
        System.out.println(summ);
    }
}