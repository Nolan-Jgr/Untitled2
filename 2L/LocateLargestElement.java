//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 13
import java.util.*;
public class LocateLargestElement
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 12 values for a 3x4 array");
      int[][] x = new int[3][4];
      for(int r=0;r < x.length;r++)
      {
         for(int c=0;c < x[0].length;c++)
         {
            x[r][c] = scan.nextInt();
         }
      }
      System.out.println("The entered matrix:");
      for(int r = 0;r < x.length;r++)
      {
         for(int c = 0;c < x[0].length;c++)
         {
            System.out.print("\t" + x[r][c] );
         }
         System.out.println();
      }
      locateLargest(x);
   }
   public static void locateLargest(int[][] a)
   {
      int max  = a[0][0];
      int row = 0;
      int col = 0;
      for(int r = 0;r < a.length; r++)
      {
         for(int c = 0;c < a[0].length;c++)
         {
            if(a[r][c] > max)
            {
               max = a[r][c];
               row = r;
               col = c;
            }
         }
      }
      System.out.println("First largest value is located at row " + row + " and column " + col);
      
   }
}