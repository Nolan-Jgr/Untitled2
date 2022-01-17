//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 10
public class Rectangle
{
   double height;
   double width;
   Rectangle()
   {
      height = 1.0;
      width = 1.0;
   }
   Rectangle(double h, double w)
   {
      height = h;
      width = w;
   }
   public double getArea()
   {
      return (height * width);
   }
   public double getPerimeter()
   {
      return (2*height + 2*width);
   }
   public double getHeight()
   {
      return height;
   }
   public double getWidth()
   {
      return width;
   }
}
class TestRectangle
{
   public static void main(String[]args)
   {
      Rectangle r1 = new Rectangle();
      System.out.println("First object: ");
      System.out.println("\tHeight: " + r1.getHeight() + " units");
      System.out.println("\tWidth: " + r1.getWidth() + " units");
      System.out.println("\tArea: " + r1.getArea() + " units");
      System.out.println("\tPerimeter " + r1.getPerimeter() + " units");
      Rectangle r2 = new Rectangle(5.0,6.0);
      System.out.println("Second object: ");
      System.out.println("\tHeight: " + r2.getHeight() + " units");
      System.out.println("\tWidth: " + r2.getWidth() + " units");
      System.out.println("\tArea: " + r2.getArea() + " units");
      System.out.println("\tPerimeter " + r2.getPerimeter() + " units");
   }
}