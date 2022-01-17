//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 5
import java.util.*;
public class NextMeeting
{
   public static void main(String[]arg)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter an integer value to represent today's day");
      int today = scan.nextInt();
      String day = "";
      System.out.println("Enter the number of days until the next meeting day");
      int days = scan.nextInt();
      int meeting;
      String meet = "";
      meeting = (today + days) % 7;
      switch(today)
      {
         case 0:
            day = "Sunday";
            break;
         case 1:
            day = "Monday";
            break;
         case 2:
            day = "Tuesday";
            break;
         case 3:
            day = "Wednesday";
            break;
         case 4:
            day = "Thursday";
            break;
         case 5:
            day = "Friday";
            break;
         case 6:
            day = "Saturday";
            break;
         default:
            day = "today";
            break; 
      }

      switch(meeting)
      {
         case 0:
            meet = "Sunday";
            break;
         case 1:
            meet = "Monday";
            break;
         case 2:
            meet = "Tuesday";
            break;
         case 3:
            meet = "Wednesday";
            break;
         case 4:
            meet = "Thursday";
            break;
         case 5:
            meet = "Friday";
            break;
         case 6:
            meet = "Saturday";
            break;
         default:
            meet = "today";
            break; 
      }
      System.out.println("Today is " + day);
      System.out.println("Days to the next meeting is " + days + " days");
      System.out.println("Meeting day is " + meet);
   }
}