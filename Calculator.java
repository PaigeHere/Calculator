/* 
 * Author: Paige Margaret Bartusiak
 * Assignment: 4.3b
 * Date: September 26, 2018
 * 
 * ReadMe: This code takes user input to run basic math operations.  
 */
import java.util.Scanner;

public class Calculator{
   public static void main (String [] args){
     
    Scanner reader = new Scanner(System.in); //reader used for user input
    
    //Gets user input
    System.out.println("Enter two integers: ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    
    //Gives user options of different operations to perform with the above integers. Takes user input
    System.out.println("What operation do you want to perform?(enter the number): ");
    System.out.print("1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n");
    int operation = reader.nextInt();
    
   
    
    /*Code that takes user input and calls the corresponding method. 
    The else is in place to make sure the user only inputs valid commands. */
    
    if (operation == 1)
      add(a, b);
    else if (operation == 2)
      subtract(a, b);
    else if (operation == 3)
      divide(a, b);
    else if (operation == 4)
      multiply(a, b);
    else {
      System.out.print("That was an invalid number command. Sorry, please run again.");
      }
    
  }
    //method to add the integers
    static void add(int a, int b){
     int sum = a + b;
     System.out.println( a + " + " + b + " = " + sum);
     }
    
    //method to subract the integers
    static void subtract(int a, int b){
     int difference = a - b;
     System.out.println(a + " - " + b + " = " + difference);
     }
   
    //method to divide the integers
    static void divide(int a, int b){
     int quotient = a / b;
     int remainder = a % b;
     if (a % b == 0)
       System.out.println(a + " / " + b + " = " + quotient);
     else
       System.out.println(a + " / " + b + " = " + quotient + " R" + remainder);
     }
    
    //method to multiply the integers
    static void multiply(int a, int b){
     int product = a * b;
     System.out.println(a + " * " + b + " = " + product);
   }
}
