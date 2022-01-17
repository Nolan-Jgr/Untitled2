//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 9
import java.util.*;
public class PrintCharacters
{
   public static String printChars(char ch1, char ch2)
   {
      String x = "";
      for(int i = 1; ch1 <= ch2; i++, ch1++)
      {
         x += ch1 + " ";
         if(i % 5 == 0)
         {
            x += "\n";
         }
      }
      x += "\n";
      return x;
   }
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      char x;
      char y;
      System.out.println("what is the starting character?");
      x = scan.next().charAt(0);
      System.out.println("what is the ending character?");
      y = scan.next().charAt(0);
      if(x > y)
      {
         System.out.println("start and end characters are out of order. Try again.");
      }
      System.out.println("Output: \n" + printChars(x, y));
   }
}