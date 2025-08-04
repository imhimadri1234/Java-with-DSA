import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String args[])
    {
        //if else statements

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("adault");
        }
        else
        {
            System.out.println("not adault");
        }
        //odd even check

        int x=sc.nextInt();
        if(x%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

        //a=b,a>b

        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("equal");
        }
        else
        {
            if(a>b)
            {
                System.out.println("a is greater");
            }
            else
            {
                System.out.println("a is lesser");
            }
        }

        //else if statements

        int q=sc.nextInt();
        int w=sc.nextInt();
        if(q==w)
        {
            System.out.println("equal");
        }
        else if(q>w)
        {
            System.out.println("q is greater");
        }
        else
        {
            System.out.println("w is greater");
        }

        //switch statements

        int button=sc.nextInt();
        switch(button)
        {
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("bonjuor");
            break;
            default:System.out.println("invalid button");
        }

    }
}
