//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 4
import java.util.*;
public class WeeklyPay
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      int hours = scan.nextInt();
      int pay;
      if(hours <= 40)
      {
         pay = hours * 10;
      }
      else
      {
         pay = (hours - 40)*15 + (400);
      }
      System.out.println("You entered " + hours + " hours.");
      System.out.println("Gross earning is " + pay);
   }
}