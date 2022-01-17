//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 12
import java.util.*;
public class CompareArrays
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the array size");
      int x = scan.nextInt();
      int[] a = new int[x];
      int[] b = new int[x];
      System.out.println("initialize the first array");
      for(int i = 0; i < a.length;i++)
      {
         a[i] = scan.nextInt();
      }
      System.out.println("initialize the second array");
      for(int i = 0; i < b.length;i++)
      {
         b[i] = scan.nextInt();
      }
      System.out.println("Array size: " + x);
      System.out.print("First Array: ");
      for(int i = 0; i < a.length-1;i++)
      {
         System.out.print(a[i] + ",");
      }
      System.out.println(a[a.length-1]);
      System.out.print("Second Array: ");
      for(int i = 0; i < b.length-1;i++)
      {
         System.out.print(b[i] + ",");
      }
      System.out.println(b[b.length-1]);
      if(Compare(a,b))
         System.out.println("Judgement: The arrays are identical");
      else
         System.out.println("Judgement: The arrays are not identical");
   }
   public static boolean Compare(int[] x, int[] y)
   {
      boolean judge = false;
      for(int i = 0; i < x.length;i++)
      {
        if(x[i] == y[i])
        {
            judge  = true;
        } 
        else
        {
            judge = false;
            break;
        }
      }
      return judge;
   }
}