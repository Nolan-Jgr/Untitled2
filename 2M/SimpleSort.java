//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 14
import java.util.*;
public class SimpleSort
{
   public static void main(String[]args)
   {
     int[] x = new int[50];
     for(int i = 0; i< x.length;i++)
     {
         x[i] = (int)(Math.random() * 100 + 1);
     }
     System.out.print("Array's Values: ");
     for(int i=0; i < x.length;i++)
     {
         System.out.print(x[i] + " ");
     } 
     System.out.println();
     int[] y = new int[50];
     for(int i = 0; i < y.length;i++)
     {
      y[i] = x[i];
     }
     int[] z = new int[50];
     for(int i = 0; i < z.length;i++)
     {
      z[i] = x[i];
     }
     int swap = BubbleSort(x);
     System.out.print("\nBubble Sorted values: " );
     for(int i=0; i < x.length;i++)
     {
         System.out.print(x[i] + " ");
     }
     System.out.println();
     System.out.print("Bubble Sort Swaps: " + swap);
     swap = InsertionSort(y);
     System.out.print("\n\nInsertion Sorted Values: ");
      for(int i=0; i < y.length;i++)
     {
         System.out.print(y[i] + " ");
     }
     System.out.println();
     System.out.print("Insertion Sort Swaps: " + swap);
     swap = SelectionSort(z);
     System.out.print("\n\nSelection Sorted Values: ");
      for(int i=0; i < z.length;i++)
     {
         System.out.print(z[i] + " ");
     }
     System.out.println();
     System.out.print("Selection Sort Swaps: " + swap);

     

   }
   public static int BubbleSort(int[] a)
   {
      int count  = 0;
      for(int i=0; i < a.length-1;i++)
      {
         for(int j = i+1; j < a.length; j++)
         {
            if(a[j] < a[i])
            {
               int temp = a[j];
               a[j] = a[i];
               a[i] = temp;
               count++;
            }
         }
      }
      return count;
   }
   public static int InsertionSort(int[] a)
   {
     int count = 0;
     for(int index = 1; index < a.length;index++)
     {
         int key = a[index];
         int pos = index;
         while(pos > 0 && key < a[pos-1])
         {
            a[pos] = a[pos-1];
            pos--;
            count++;
         }
         a[pos] = key;
     }
     return count; 
   }
   public static int SelectionSort(int[] a)
   {
      int count = 0;
      for(int i=0;i<a.length-1;i++)
      {
         int min = i;
         for(int j = i+1;j<a.length;j++)
         {
            if(a[j] < a[min])
               min = j;
         }
         if( i != min && min < a.length)
         {
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            count++; 
         }
      }
      return count;  
   }
}