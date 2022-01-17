//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 12
import java.util.*;
public class ArrayMethods
{
   public static void main(String[]args)
   {
      int[] x = new int[5];
      for(int i = 0; i < x.length;i++)
      {
         x[i] = (int)(Math.random()*100+1);
      }
      System.out.print("Original array: ");
      for(int i = 0; i < x.length-1;i++)
      {
         System.out.print(x[i] + ", ");
      }  
      System.out.println(x[x.length-1]);
      System.out.println("Max value: " + arrayMax(x));
      System.out.println("Min value: " + arrayMin(x));
      System.out.print("Squared array: ");
      arraySquared(x);
      for(int i = 0; i < x.length-1;i++)
      {
         System.out.print(x[i] + ", ");
      } 
      System.out.println(x[x.length-1]);
      System.out.print("Reversed array: ");
      arrayReverse(x);
      for(int i = 0; i < x.length-1;i++)
      {
         System.out.print(x[i] + ", ");
      } 
      System.out.println(x[x.length-1]);
   }
   public static int arrayMax(int[] arr)
   {
      int max = arr[0];
      for(int i: arr)
      {
         if(i > max)
            max = i;
      }
      return max;
   }
   public static int arrayMin(int[] arr)
   {
      int min = arr[0];
      for(int i: arr)
      {
         if(i < min)
            min = i;
      }
      return min;
   }
   public static void arraySquared(int[] arr)
   {
      for(int i = 0; i < arr.length;i++)
      {
         arr[i] = (int)Math.pow(arr[i],2);
      }
   } 
   public static void arrayReverse(int[] arr)
   {
      for(int i = arr.length-1; i >= 0; i--)
      {
         int temp = arr[i];
         int x = 0;
         arr[i] = arr[x];
         arr[x] = temp;
         x++; 
      }
   } 
}