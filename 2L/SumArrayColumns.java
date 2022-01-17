//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 13
import java.util.*;
public class SumArrayColumns
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter 12 values for a 3x4 array");
      int[][] x = new int[3][4];
      for(int r = 0;r < x.length;r++)
      {
         for(int c = 0;c < x[0].length;c++)
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
      int[] z = sumColumn(x);
      System.out.println("Sum of column 0 is " + z[0]);
      System.out.println("Sum of column 1 is " + z[1]);
      System.out.println("Sum of column 2 is " + z[2]);
      System.out.println("Sum of column 3 is " + z[3]);
   }
   public static int[] sumColumn(int[][] a)
   {
      int[] y = new int[a[0].length];
      for(int c = 0;c < a[0].length;c++)
      {
         int sum = 0;
         for(int r = 0;r < a.length;r++)
         {
            sum += a[r][c];
         }
         y[c] = sum;
      }
      return y;
      
   }
}