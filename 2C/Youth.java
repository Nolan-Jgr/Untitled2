//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 4
import java.util.*;
public class Youth
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      int age = scan.nextInt();
      System.out.println("You entered: " + age);
      if( age <= 21)
      {
         System.out.println("Youth is a wonderful thing. Enjoy.");
      }
      System.out.println("Age is a state of mind");
      
   }
}