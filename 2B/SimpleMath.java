//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 3
import java.util.*;
public class SimpleMath
{
   public static void main(String[]args)
   {
     Scanner scan = new Scanner(System.in);
     System.out.println("input two float-point numbers");
     float R = scan.nextFloat();
     float T = scan.nextFloat();
     double sum,dif,product;
     sum = R + T;
     dif = R - T;
     product = R * T;
     System.out.println("R = " + R + "\nT = " + T + "\nR + T = " + sum + "\nR - T = " + dif + "\nR * T = " + product);
   }
}