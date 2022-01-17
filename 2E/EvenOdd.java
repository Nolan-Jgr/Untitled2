//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 6
import java.util.*;
public class EvenOdd
{
   public static void main(String[]args)
   {
      int num = 50;
      String x = "";
      while(num <= 100)
      {
         if(num % 2 == 0)
         {
            x = x + num + ", ";
         }
         num += 1;
      }
      num = 51;
      String y = "";
      while(num <= 100)
      {
         if(num % 2==1)
         {
            y = y + num + ", ";
         }
         num += 1;
      }
      System.out.println(x);
      System.out.println(y);
      
   }
}