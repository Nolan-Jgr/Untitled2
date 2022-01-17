//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 5
import java.util.*;
public class CheckPoint
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the x then the y coordinate of a point");
      int x = scan.nextInt();
      int y = scan.nextInt();
      String location = "";
      if( x == 0 && y == 0)
      {
         location = "is the origin point";
      }
      else if(x == 0)
      {
         location = "is on the y-axis";
      }
      else if(y == 0)
      {
         location = "is on the x-axis";
      }
      else if(x > 0 && y > 0)
      {
         location = "is in the first quadrant";
      }
      else if(x < 0 && y > 0)
      {
         location = "is in the second quadrant";
      }
      else if(x < 0 && y < 0)
      {
         location = "is in the third quadrant";
      }
      else
      {
         location = "is in the fourth quadrant";
      }
      System.out.println("X-coordinate is " + x);
      System.out.println("Y-coordinate is " + y);
      System.out.println("(" + x + ", " + y + ") " + location);
   }
}