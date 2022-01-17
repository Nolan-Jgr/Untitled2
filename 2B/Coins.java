//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 3
import java.util.*;
public class Coins
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number of quarters:");
      int q = scan.nextInt();
      System.out.println("Enter number of dimes:");
      int d  = scan.nextInt();
      System.out.println("Enter number of nickels:");
      int n = scan.nextInt();
      System.out.println("Enter number of pennies:");
      int p = scan.nextInt();
      System.out.println("You entered "+q+" quarters");
      System.out.println("You entered "+d+" dimes");
      System.out.println("You entered "+n+" nickels");
      System.out.println("You entered "+p+" pennies");
      double total = (0.25 * q ) + (0.10 * d) + (0.05 * n) + (0.01 * p);
      int dollar = (int)total;
      int cents = (int)((total - dollar) * 100);
      System.out.println("Your total is "+dollar+" dollars and "+cents+" cents");
   }
}