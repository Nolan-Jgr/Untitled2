//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 6
import java.util.*;
public class PrintSum
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number between 1 and 100");
      int num = scan.nextInt();
      int sum = 1;
      int count = 2;
      while((count <= num)&&(num > 1 && num < 100))
      {
         
            sum += count;
            count += 1;
      }
      System.out.println("You entered: " + num);
      if(num <= 1 || num >= 100)
      {
         System.out.println("Invalid input. Try Again.");
      }
      else
      {
         System.out.println("Sum of values: " + sum);
      }
   }
}
