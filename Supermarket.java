public class Supermarket
{
	 int price;
	 int discount;
  public static void main(String[] args)
  {
    Supermarket rice = new Supermarket();
	 Supermarket dates = new Supermarket();
	  Supermarket wheat = new Supermarket();
	  
	  rice.price = 40;
	  rice.discount =50;
	   dates.price = 60;
	  dates.discount =70;
	  wheat.price = 80;
	  wheat.discount =90;
	  System.out.println(rice.price);
	  System.out.println(rice.discount);
	  System.out.println(dates.price);
	  System.out.println(dates.discount);
	  System.out.println(wheat.price);
	  System.out.println(wheat.discount);
	 rice.buy();
	 dates.buy();
	 wheat.buy();
	  
  }
  
     public void buy()
	 {
		 
		 System.out.println("am a buying asrice"+ price);
		 System.out.println("am a buying asrice"+ discount);
	 }
}