public class calculator1
{
   public static void main(String[] args)
   {
      calculator1 calc = new calculator1();
	 int total =  calc.mult();
	System.out.println(total);
	  
   }
   public int mult()
   {
     int no1 = 100,no2 =4; 
	 int total = no1*no2;
	  return total;
   }
}