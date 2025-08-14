import java.util.Scanner;
public class Strings {
    public static void main(String args[])
    {
        //string declaration
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("your name is: "+name);

        //concatenation
        String firstName="himadri";
        String lastName="das";
        String fullName=firstName +" " + lastName;
        System.out.println(fullName);

        //string length
        System.out.println(fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++)
        {
            System.out.println(fullName.charAt(i));
        }

        //compare

        String name1="tony";
        String name2="tony";
        //1 s1 > s2 :+ve value
        //2 s1 == s2 :0
        //3 s1 < s2 :-ve value
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");
        } else{
            System.out.println("strings are not equal");
        }

        //substring
        String sentence="my name is himadri";
        String nam=sentence.substring(2,sentence.length());
        System.out.println(nam);


    }
}
