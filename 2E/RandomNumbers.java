//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 6
import java.util.*;
public class RandomNumbers
{
   public static void main(String[]args)
   {
      for(int i=0;i < 11;i++)
      {
         int num = (int)(Math.random() * 50 + 1);
         System.out.println(num);   
      }
      
   }  
}