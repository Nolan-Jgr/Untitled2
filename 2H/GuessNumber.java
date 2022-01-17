//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 9
import java.util.*;
public class GuessNumber
{
   public static int rand()
   {
      return (int)(Math.random()*20+1);
   }
   public static int guess()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is your guess of the random number?(between 1 and 20)");
      int x = scan.nextInt();
      return x;
   }
   public static String judgement(int x , int y)
   {
      if(x==y)
      {
         return "correct";
      }
      else if(y > x)
      {
         return "too high. Try again";
      }
      else
      {
         return "too low. Try again";
      }
   }
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Would you like to play? 1 for yes 0 for no");
      int play = scan.nextInt();
      while(play == 1)
      {
         int x = rand();
         int y = guess();
         while(!judgement(x,y).equals("correct"))
         {
            System.out.println(judgement(x,y));
            y = guess();
         }
         System.out.println("correct");
         System.out.println("would you like to play again? 1 for yes 0 for no");
         play = scan.nextInt();
      }
   }
}