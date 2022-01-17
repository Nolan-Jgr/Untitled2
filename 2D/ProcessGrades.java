//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 5
import java.util.*;
public class ProcessGrades
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter four integer values between 0 and 100");
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      int num3 = scan.nextInt();
      int num4 = scan.nextInt();
      int min = num1;
      int max = num1;
      if(num2 < min)
      {
         min = num2;
      }
      if(num3 < min)
      {
         min = num3;
      }
      if(num4 < min)
      {
         min = num4;
      }
       if(num2 > max)
      {
         max = num2;
      }
      if(num3 > max)
      {
         max = num3;
      }
      if(num4 > max)
      {
         max = num4;
      }
      double avg = ((double)(num1 + num2 + num3 + num4)/4.0);
      System.out.println("you entered: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
      System.out.println("Highest number: " + max);
      System.out.println("Lowest number: " + min);
      System.out.println("Average grade: " + avg);
      
   }
}