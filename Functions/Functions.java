import java.util.Scanner;

public class Functions {
    //print a given name in a function

    // public static void printMyName(String name)
    // {
    //     System.out.println(name);
    //     return;

    // }


    // // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     String name=sc.next();
    //     printMyName(name);
    // }

    // //make a function to add 2 numbers and return the sum
    
    // public static int calculateSum(int a,int b)
    // {
    //     int sum=a+b;
    //     return sum;
    // }
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int a =sc.nextInt();
    //     int b=sc.nextInt();
    //     int sum=calculateSum(a,b);
    //     System.out.println("sum of two numbers:" +sum);
    // }

    // //make a function to multiply 2 numbers and return the product
    
    // public static int calculateProduct(int c, int d)
    // {
    //     int mult=c*d;
    //     return mult;
    // }
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int c=sc.nextInt();
    //     int d=sc.nextInt();
    //     int mult=calculateProduct(c,d);
    //     System.out.println("multiplication of two numbers:"+mult);
    // }
    
    // find the factorial of a number

    public static void printFactorial(int n)
    {
        //loop
        if(n<0)
        {
            System.out.println("invalid number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);

    }
}
