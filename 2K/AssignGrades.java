//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 12
import java.util.*;
public class AssignGrades
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the class size");
      int x = scan.nextInt();
      int[] grades = new int[x];
      System.out.println("enter a valid integer score(0-100) for each student");
      for(int i =0; i < grades.length;i++)
      {
         grades[i] = scan.nextInt();
      }
      System.out.println("Class size: " + x);
      System.out.print("Entered grades: ");
      for(int i = 0; i < grades.length-1;i++)
      {
         System.out.print(grades[i] + ", ");
      }
      System.out.println(grades[grades.length-1]);
      System.out.println(printGrades(grades)); 
      
   }
   public static String printGrades(int[] a )
   {
      String score = "";
      String z = "";
      int y = 0;
      for(int i: a)
      {
         if(i >= 90 && i <= 100)
         {
            score = "grade is A";
         }
         else if(i >= 80 && i <= 89)
         {
            score = "grade is B";
         }
         else if(i >= 70 && i <= 79)
         {
            score = "grade is C";
         }
         else if(i >= 60 && i <= 69)
         {
            score = "grade is D";
         }
         else
         {
            score = "grade is F";
         }
         z += "Student " + y + " score is " + i + " and " + score + "\n";
         y++;
      }
      return z;
   }
}