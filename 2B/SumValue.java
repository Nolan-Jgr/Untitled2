//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 3
import java.util.*;
public class SumValue
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("input three numbers");
      int x = scan.nextInt();
      int y = scan.nextInt();
      int z = scan.nextInt();
      double avg = (double)(x + y + z)/3;
      System.out.println("X = " + x);
      System.out.println("Y = " + y);
      System.out.println("Z = " + z);
      System.out.println("Average = " + avg);
   }
}