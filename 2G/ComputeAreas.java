//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 8
import java.util.*;
public class ComputeAreas
{
   public static double squareArea(double side)
   {
      double area = Math.pow(side, 2);
      return area;
   }
   public static double rectangleArea(double w, double l)
   {
      double area = l * w;
      return area;
   }
   public static double circleArea(double r)
   {
      double area = 3.14 * (Math.pow(r, 2 ));
      return area;
   }
   public static double triangleArea(double base, double h)
   {
      double area = (.5) * base * h;
      return area;
   }
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      double side = scan.nextDouble();
      System.out.println("Square side: " + side);
      System.out.println("Square area: " + squareArea(side));
      double width = scan.nextDouble();
      double length = scan.nextDouble();
      System.out.println("Rectangle width: " + width);
      System.out.println("Rectangle length: " + length);
      System.out.println("Rectangle area: " + rectangleArea(width, length));
      double radius = scan.nextDouble();
      System.out.println("Circle radius: " + radius);
      System.out.println("Circle area: " + circleArea(radius));
      double base = scan.nextDouble();
      double height = scan.nextDouble();
      System.out.println("Triangle base: " + base);
      System.out.println("Triangle height: " + height);
      System.out.println("Triangle area: " + triangleArea(base, height));
   }
}