public class Pra {
    public static void main(String args[])
    {
        //pattern 1
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hello");
        //pattern 2
        int a=4;
        int b=5;
        for(int k=1;k<=a;k++)
        {
            for(int l=1;l<=b;l++)
            {
                if(k==1 || l==1 || k==a || l==b)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println("Hello");

        //pattern 3
        int n=4;
        for(int m=1;m<=n;m++)
        {
            for(int o=1;o<=m;o++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hello");

        //pattern 4
        for(int p=n;p>=1;p--)
        {
            for(int q=1;q<=p;q++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hello");

        //pattern 5
        for(int r=1;r<=n;r++)
        {
            for(int s=1;s<=n-r;s++)
            {
                System.out.print(" ");
            }
            for(int s=1;s<=r;s++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("Hello");

        //pattern 6
        int c=5;
        for(int r=1;r<=c;r++)
        {
            for(int j=1;j<=r;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        System.out.println("Hello");

        //pattern 7
        
        for(int r=1;r<=c;r++)
        {
            for(int j=1;j<=c-r+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println("Hello");

        //pattern 8
        int number=1;
        for(int i=1;i<=c;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();

        }
        System.out.println("Hello");

        //pattern 9
        for(int i=1;i<=c;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1");
                } else{
                    System.out.print("0");

                }
            }
            System.out.println();
        }

    }

}
