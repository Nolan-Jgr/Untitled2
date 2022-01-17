//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 8
import java.util.*;
public class PalindromeInteger
{
   public static int reverse(int number)
   {
      int rev = 0;
      while(number > 0)
      {
         rev += number % 10;
         number /= 10;
         if(number > 0)
         {
            rev *= 10;
         }
      } 
      return rev;

   }
   public static String isPalindrome(int number)
   {
      if(number == reverse(number))
         return "Palindrome";
      else
         return "Not palindrome";
   }
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      System.out.println("Entered value: " + num);
      System.out.println("Judgement: " + isPalindrome(num));
   }
}