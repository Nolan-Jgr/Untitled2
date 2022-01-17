//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 8
import java.util.*;
public class MinMaxAvg
{
      public static int max(int x, int y, int z)
      {
         int max = x;
         if(y >= max)
         {
            max = y;
         }
         if(z >= max)
         {
            max = z;
         }
         return max;
      }
      public static int min(int X, int y, int z)
      {
         int min = X;
         if(y <= min)
         {
            min = y;
         }
         if(z <= min)
         {
            min = z;
         }
         return min;
      }
      public static int average(int x, int y, int z)
      {
         int avg = (x + y + z)/3;
         return avg;
      }
         public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter three integer values");
      int x = scan.nextInt();
      int y = scan.nextInt();
      int z = scan.nextInt();
      System.out.println("You entered: " + x + ", " + y + ", " + z);
      System.out.println("Max value: " + max(x, y, z));
      System.out.println("Min value: " + min(x, y, z));
      System.out.println("Average value: " + average(x, y, z));
   }
}