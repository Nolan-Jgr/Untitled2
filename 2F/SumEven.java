//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 7
import java.util.*;
public class SumEven
{
   public static void main(String[]args)
   {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a number between 20 and 60");
     int num = scan.nextInt();
     int temp = 0;
     int sum =0;
     while((num > 19 && num < 61) && temp <= num)
     {
         sum += temp;
         temp += 2;
     }
     System.out.println("Entered Value: " + num);
     System.out.println("Sum of even numbers between 2 and " + num + " is " + sum);
   }
}