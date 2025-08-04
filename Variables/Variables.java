import java.util.Scanner;

public class Variables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Move Scanner inside main

        int a = 10;
        int b = 20;
        int sum = a + b;
        int mul=a*b;
        System.out.println("Sum: " + sum);
        System.out.println("mul: " + mul);

        // Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Corrected nextLine()
        System.out.println("Hello, " + name);
 //print the pattern
    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    System.out.println("****");
    }

}
