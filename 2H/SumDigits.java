//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 9
import java.util.*;
public class SumDigits
{
   public static int sumDigits(int num)
   {
      int sum = 0;
      while(num > 0)
      {
        sum += num % 10;
        num = num/10; 
      }
      return sum;
   }
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter an integer number");
      int num = scan.nextInt();
      System.out.println("You Entered: " + num);
      System.out.println("Sum of digits: " + sumDigits(num));
   }
}