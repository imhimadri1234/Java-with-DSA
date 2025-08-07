import java.util.Scanner;

public class Loops
{
    public static void main(String args[])
    {
        //for loops


        for(int counter=0;counter<3;counter=counter+1)
        {
            System.out.println("Hello World");
        }
        //coun++ --> coun=coun+1
        for(int coun=0;coun<2;coun++)
        {
            System.out.println(coun);
        }
        //print the numbers from 0 to 5
        for(int i=0;i<6;i++)
        {
            System.out.println(i);
        }

        //while loops
        int q=0;
        while(q<5)
        {
            System.out.println(q);
            q=q+1;
        }

        //do while loops
        int w=0;
        do{
            System.out.println(w);
            w=w+1;
        }while(w<7);

        //print the sum of first n natural numbers
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int e=0;e<=n;e++)
        {
            sum=sum+e;
        }
        System.out.println(sum);

        //print the table of a number input by the user
        Scanner s=new Scanner(System.in);
        int o=s.nextInt();

        for(int r=1;r<11;r++)
        {
            System.out.print(r*o+" ");
        }

    }
}