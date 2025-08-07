import java.util.Scanner;
public class Practice {
    public static void main(String args[])
    {
        //Loops

        //print numbers from 1 to 100 using a loop
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
        }

        //print the multiplication table of a given number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<11;j++)
        {
            System.out.println(j*n);
        }

        //count the number of digits in a number
        Scanner scc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=scc.nextInt();
        if(number<0){
            number=-number;
        }
        int count;
        if(number==0){
            count=1;
        } else{
            count=0;
            for(;number>0;number=number/10){
                count++;
            }
        }
        System.out.println("Number of digits:" + count);

        //print the sum of all even numbers from 1 to n
        Scanner sccc=new Scanner(System.in);
        int o=sccc.nextInt();
        int sum=0;
        for(int k=1;k<=o;k++)
        {
            if(k%2==0)
            {
                sum+=k;
            }
        }
        System.out.println("sum of even numbers from 1 to " +o+" is:" +sum);

        //find a factorial of a number using a loop
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int p=s.nextInt();
        long factorial=1;
        if(p<0){
            System.out.println("factorial is not defined for negative numbers.");
        } else{
            for(int l=1;l<=p;l++){
                factorial*=l;
            }
            System.out.println("factorial of "+p+" is:" + factorial);
        }


    }
}
