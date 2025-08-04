import java.util.Scanner;

public class Arrays
{
    public static void main(String args[])
    {
        //arrays
        int[] marks=new int[3];
        marks[0]=97;//physics
        marks[1]=98;//chemistry
        marks[2]=95;//english
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
        }



        //input from users
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        //input
        for(int j=0;j<size;j++)
        {
            numbers[j]=sc.nextInt();
        }
        //output
        for(int j=0;j<size;j++)
        {
            System.out.println(numbers[j]);
        }

        //take an array as input from the user.search for a given number x and print the index at which it occurs.

        Scanner ab=new Scanner(System.in);
        int a=ab.nextInt();
        int b[]=new int[a];
        for(int c=0;c<a;c++)
        {
            b[c]=ab.nextInt();
        }
        int d=ab.nextInt();
        for(int c=0;c<=b.length;c++)
        {
            if(b[c]==d)
            {
                System.out.println("d is found at index:"+c);
            }
        }






    }
}