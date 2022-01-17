//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 11
import java.util.*;
public class Radio
{
   private int station,volume;
   private boolean on;
   public Radio()
   {
      station = 1;
      volume = 1;
      on = false;
   }
   public int getStation()
   {
      if(station>=10)
      {
         station = 10; 
      }
   
      return station;
   }
   public int getVolume()
   {
      if(volume>10)
      {
         volume = 10;
      }
      return volume;
   
   }
   public void turnOn()
   {
      on = true;
   }
   public void turnOff()
   {
      on = false;
   }
   public void stationUp()
   {
      if(on)
         station++;
   }
   public void stationDown()
   {
      if(on)
         station--;
   }
   public void volumeUp()
   {
      if(on)
         volume++;
   }
   public void volumeDown()
   {
      if(on)
         volume--;
   }
   public String toString()
   {
      if(on)
         return "The radio station is " + getStation() + " and the volume level is " + getVolume();
      else
         return "The radio is off";
   }
}
class TestRadio
{
   public static void main(String[]args)
   {
      Radio x = new Radio();
      x.turnOn();
      System.out.println("Turn radio on:");
      System.out.println("\t" + x);
      System.out.println("Turn volume up by 13:");
      for(int i = 0; i <=11; i++)
      {
         x.volumeUp();
      }
      System.out.println("\t" + x);
      for(int i = 0; i <= 14;i++)
      {
         x.stationUp();
      }
      System.out.println("Turn station up by 15:");
      System.out.println("\t" + x);
      x.volumeDown();
      System.out.println("Turn down volume by 1:");
      System.out.println("\t" + x);
      for(int i = 0; i <= 2; i++)
      {
         x.stationUp();
      }
      System.out.println("Turn station up by 1:");
      System.out.println("\t" + x);
      x.turnOff();
      System.out.println("Turn the radio off:");
      System.out.println("\t" + x);
      for(int i = 0; i <= 1;i++)
      {
         x.volumeUp();
      }
      System.out.println("Turn volume up by 2:");
      System.out.println("\t" + x);
      for(int i = 0; i <= 1;i++)
      {
         x.stationDown();
      }
      System.out.println("Turn station down by 2:");
      System.out.println("\t" + x);
   }
}