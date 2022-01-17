//Class: CSE 1321L
//Section: 04
//Term: Spring
//Instructor: 
//Name: Nolan Jaeger
//Lab#: 10
public class Stock
{
   String Symbol,Name;
   double previousClosingPrice,currentPrice;
   Stock(String s,String n)
   {
      Symbol = s;
      Name = n;
   }
   public String getName()
   {
      return Name;
   }
   public String getSymbol()
   {
      return Symbol;
   }
   public void setClosingPrice(double pcp)
   {
      previousClosingPrice = pcp;
   }
   public void setCurrentPrice(double cp)
   {
      currentPrice = cp;
   }
   public double getClosingPrice()
   {
      return previousClosingPrice;
   }
   public double getCurrentPrice()
   {
      return currentPrice;
   }
   public double getChangePercent()
   {
      return (currentPrice - previousClosingPrice)/currentPrice * 100;
   }
   public String toString()
   {
      return ("\t" + Name + " stock closing price is $" + currentPrice);
   }  
}
class TestStock
{
   public static void main(String[]args)
   {
      Stock x = new Stock("GOG", "Google");
      System.out.println(x.getName() + " stock: ");
      System.out.println("\tSymbol: " + x.getSymbol());
      x.setClosingPrice(134.67);
      x.setCurrentPrice(131.98);
      System.out.println("\tClosing price: " + x.getClosingPrice());
      System.out.println("\tCurrent price: " + x.getCurrentPrice());
      System.out.println("\tChange percent: " + x.getChangePercent() + "%");
      System.out.println(x);
      Stock y = new Stock("MSF", "Microsoft");
      System.out.println(y.getName() + " stock: ");
      System.out.println("\tSymbol: " + y.getSymbol());
      y.setClosingPrice(156.52);
      y.setCurrentPrice(161.22);
      System.out.println("\tClosing price: " + y.getClosingPrice());
      System.out.println("\tCurrent price: " + y.getCurrentPrice());
      System.out.println("\tChange percent: " + y.getChangePercent() + "%");
      System.out.println(y);
   }
}