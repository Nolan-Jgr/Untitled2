//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 4
import java.util.*;
public class GradeReport
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      int grade = scan.nextInt();
      int condition = grade/10;
      System.out.println("You entered " + grade);
      switch (condition)
      {
         case 10:
            System.out.println("That grade is a perfect score.Well Done.");
            break;
         case 9:
            System.out.println("That grade is well above average. Excellent work.");
            break;
         case 8:
            System.out.println("That grade is above average. Nice Job.");
            break;
         case 7:
            System.out.println("That grade is average work.");
            break;
         case 6:
            System.out.println("That grade is not good, you should seek help!");
            break;
         default:
            if( condition > 10)
            {
               System.out.println("That grade is a perfect score. Well done");
            }
            else
            {
               System.out.println("That grade is not passing.");
            }
            break;
                  
      }
   }
}