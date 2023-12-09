package multipleCatchBook; 
import java.util.Scanner;
public class MultipleCatchBook 
{
public static void main(String[] args) 
{ 
   int x, y; 
// Creating a scanner object.
   Scanner sc = new Scanner(System.in); 

// Applying try-catch block.
   try 
   { 
     System.out.println("Enter your first number"); 
     x = Integer.parseInt(sc.nextLine()); 
     System.out.println("Enter your second number"); 
     y = Integer.parseInt(sc.nextLine()); 

     int z = x / y; 
     System.out.println("z = " +z); 
   } 
   catch(ArithmeticException ae) 
   { 
     System.out.println("A number cannot be divided by 0, Illegal operation in Java"); 
     System.out.println("Exception thrown: " +ae); 
   } 
   catch(NumberFormatException nfe) 
   { 
     System.out.println("Invalid data types are entered, number must be an integer."); 
     System.out.println("Exception thrown: " +nfe); 
   } 
   catch(RuntimeException re) 
   { 
     System.out.println("Exception thrown: " +re); 
   } 
   System.out.println("Out of try-catch block"); 
 } 
}