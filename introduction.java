// write a code in java to take input of user name and age from the user 

import java.util.Scanner;

public class introduction 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        // Taking a string input of name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking an integer input of age 
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // output statements 
        System.out.println("Following are your details : ");
        System.out.println("Name : " + name); 
        System.out.println("Age : " + age); 

        sc.close(); // Close the scanner 
    }
}
