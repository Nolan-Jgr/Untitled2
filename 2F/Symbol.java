//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 7
import java.util.*;
public class Symbol
{
   public static void main(String[]arg)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a symbol and a number");
      char x = scan.next().charAt(0);
      int y = scan.nextInt();
      for(int i = 0; i < y ; i++)
      {
         for(int a = 0; a < y ; a++)
         {
            System.out.print(x);
         }
         System.out.println();
      }
   }
}