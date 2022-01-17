//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 14
import java.util.*;
public class LinearBinarySearch
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 10 integer values");
      int[] x = new int[10];
      for(int i = 0; i < x.length;i++)
      {
         x[i] = scan.nextInt();
      }
      System.out.print("Arrays Values: ");
      for(int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + " ");
      }
      System.out.println();
      System.out.println("Target Value: ");
      int target = scan.nextInt();
      System.out.println("Linear Search Comparisons: " + LinearSearch(x, target));
      System.out.println("Binary Search Comparisons: " + BinarySearch(x, target));
   }
   public static int LinearSearch(int[] a, int target)
   {
      int count = 0;
      for(int i = 0;i < a.length; i++)
      {
         if(a[i] == target)
         {
            count++;
            break;
         }
         count++;
      }
      return count;
   }
   public static int BinarySearch(int[] a, int target)
   {
     Arrays.sort(a);
     int low = 0, mid = 0, high = a.length, count = 0, len = a.length;
     boolean found  = false;
     while(!found && len > 0)
     {
         mid = (low + high)/2;
         if(target == a[mid])
         {
           count++;
           found = true; 
         }
         else if(target < a[mid])
         {
            high = mid;
            count++;
         }
         else
         {
            low = mid;
            count++;
         }
         if(low >= high-1)
         {
            found = false;
         }
         len = len/2;
     } 
     return count;
   }
}