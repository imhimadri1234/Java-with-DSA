import java.util.Scanner;

public class TwoDArrays {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][]numbers=new int[rows][cols];

        //input
        //rows
        for(int i=0;i<rows;i++)
        {
            //column
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();
            }

        }
        //output
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        //take a matrix as input from the user.search for a given number x and print the indices at which it occur.

        Scanner ab=new Scanner(System.in);
        int row=ab.nextInt();
        int col=ab.nextInt();

        int[][]number=new int[row][col];

        //input
        //rows
        for(int k=0;k<row;k++)
        {
            //column
            for(int l=0;l<col;l++)
            {
                number[k][l]=ab.nextInt();
            }

        }
        int x=ab.nextInt();
        for(int k=0;k<row;k++)
        {
            for(int l=0;l<col;l++)
            {
                if(number[k][l]==x)
                {
                    System.out.println("z is found at location("+k+","+l+")");
                }
            }
        }
    }
    
}
