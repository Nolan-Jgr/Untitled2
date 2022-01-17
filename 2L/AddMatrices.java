//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 13
import java.util.*;
public class AddMatrices
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      int[][] x = new int[3][3];
      int[][] y = new int[3][3];
      System.out.println("Enter 9 values for each of the 3x3 matrices");
      System.out.println("Matrix A:");
      for(int r=0;r < x.length;r++)
      {
         for(int c=0;c < x[0].length;c++)
         {
            x[r][c] = scan.nextInt();
         }
      }
      System.out.println("Matrix B:");
      for(int r=0;r < y.length;r++)
      {
         for(int c=0;c < y[0].length;c++)
         {
            y[r][c] = scan.nextInt();
         }
      }
      System.out.println("Matrix A:");
      for(int r = 0;r < x.length;r++)
      {
         for(int c = 0;c < x[0].length;c++)
         {
            System.out.print("\t" + x[r][c] );
         }
         System.out.println();
      }
      System.out.println("Matrix B:");
      for(int r = 0;r < y.length;r++)
      {
         for(int c = 0;c < y[0].length;c++)
         {
            System.out.print("\t" + y[r][c] );
         }
         System.out.println();
      }
      int[][] z = Addition(x,y);
      System.out.println("A + B:");
      for(int r = 0;r < z.length;r++)
      {
         for(int c = 0;c < z[0].length;c++)
         {
            System.out.print("\t" + z[r][c] );
         }
         System.out.println();
      }
      
   }
   public static int[][] Addition(int[][] a, int[][] b)
   {
      int[][] c = new int[3][3];
      for(int r = 0;r < c.length;r++)
      {
         for(int col = 0; col < c[0].length;col++)
         {
            c[r][col] = a[r][col] + b[r][col];
         }
      }
      return c;
   }
}