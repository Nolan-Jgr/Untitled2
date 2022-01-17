//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 11
import java.util.*;
public class Circle
{
   private double radius;
   public Circle()
   {
      radius = 1;
   }  
   public Circle(double x)
   {
      radius = x;
   }
   public double getRadius()
   {
      return radius;
   }
   public void setRadius(double x)
   {
      radius = x;
   }
   public double getArea()
   {
      return 3.14*(Math.pow(radius,2));
   }
   public double getPerimeter()
   {
      return 2*3.14*radius;
   }
   public String toString()
   {
      return "the circle has radius " + radius;
   }
}
class TestCircle
{
   public static void main(String[]args)
   {
      Circle x = new Circle();
      System.out.println("The radius is " + x.getRadius());
      System.out.println("The area is " + x.getArea());
      System.out.println("The perimeter is " + x.getPerimeter());
      x.setRadius(10);
      System.out.println(x);
      System.out.println("The area is " + x.getArea());
      System.out.println("The perimeter is " + x.getPerimeter());
   }
}