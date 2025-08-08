public class Pattern
{
    public static void main(String args[])
    {
        //print the patterns rectangle
    for(int i=1;i<=4;i++)
    {
        System.out.println("*****");
        
    }
    System.out.println("hello");

    //nested loops
    //outer loop
    int j=4;
    int k=5;
    for(int l=1;l<=j;l++)
    {
        //inner loop
        for(int m=1;m<=k;m++)
        {
            System.out.print("*");
        } 
        System.out.println();
    }
    System.out.println("hello");
    //print the rectangle pattern
    int n=4;
    int o=5;
    //outer loop
    for(int p=1;p<=n;p++)
    {
        //inner loop
        for(int q=1;q<=o;q++)
        {
            if(p==1||q==1||p==n||q==o)
            {
                System.out.print("*");
            }else
            {
                System.out.print(" ");
            }

        }
        System.out.println();
    }
    System.out.println("hello");

    //print the half pyramid pattern

    int r=4;
    for(int s=1;s<=r;s++)
    {
        for(int t=1;t<=s;t++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("hello");

    //print the inverted half pyramid pattern

    int u=4;
    for(int v=u;v>=1;v--)
    {
        for(int w=1;w<=v;w++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("hello");

    //print the inverted half pyramid(rotated by 180 degree)
    
    int x=4;
    for(int y=1;y<=x;y++)
    {
        for(int z=1;z<=x-y;z++)
        {
            System.out.print(" ");
        }
        for(int z=1;z<=y;z++)
        {
            System.out.print("*");
        }

        System.out.println();
    }
    System.out.println("hello");

    //print the half pyramid with numbers pattern

    int aa=5;
    for(int bb=1;bb<=aa;bb++)
    {
        for(int cc=1;cc<=bb;cc++)
        {
            System.out.print(cc+" ");
        }
        System.out.println();
    }
    System.out.println("hello");

    //print the inverted half pyramid with numbers pattern

    int dd=5;
    for(int ee=dd;ee>=1;ee--)
    {
        for(int ff=1;ff<=ee;ff++)
        {
            System.out.print(ff+" ");
        }
        System.out.println();
    }
    System.out.println("hello");

    //print flod's triangle

    int gg=5;
    int number=1;
    for(int hh=1;hh<=gg;hh++)
    {
        for(int ii=1;ii<=hh;ii++)
        {
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
    System.out.println("hello");

    //print 0-1 triangle

    int jj=5;
    for(int kk=1;kk<=jj;kk++)
    {
        for(int ll=1;ll<=kk;ll++)
        {
            int sum=kk+ll;
            if(sum % 2==0)
            {
                System.out.print("1 ");
            }
            else
            {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
    System.out.println("hello");

}

}
