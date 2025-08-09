public class Pattern2 {
    public static void main(String args[])
    {
        //print the Butterfly Pattern

        int n=5;
        //upper half
        for(int i=1;i<=n;i++)
        {
            //1st part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--)
        {
            //1st part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //print solid rhombus pattern
        int m=5;
        for(int i=1;i<=m;i++)
        {
            //spaces
            for(int j=1;j<=m-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //print the number pyramid
        int o=5;
        for(int i=1;i<=o;i++)
        {
            //spaces
            for(int j=1;j<=o-i;j++)
            {
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();

        }

        //print palindromic pattern
        int p=5;
        for(int i=1;i<=p;i++)
        {
            //spaces
            for(int j=1;j<=p-i;j++)
            {
                System.out.print(" ");
            }
            //1st half numbers
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            //2nd half numbers
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        //print the diamond pattern
        int q=4;
        //upper half
        for(int i=1;i<=q;i++)
        {
            //spaces
            for(int j=1;j<=q-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=q;i>=1;i--)
        {
            //spaces
            for(int j=1;j<=q-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
