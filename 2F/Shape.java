//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 7
import java.util.*;
public class Shape
{
   public static void main(String[]args)
   {
      for(int y = 1; y < 9;y++)
      {
         for(int z=0; z< 8-y;z++)
         {
            System.out.print(" ");
         }
         for(int x=1; x <= 2*y-1;x++)
         {
            System.out.print("*");
         }
         System.out.println();
      }

   }
}