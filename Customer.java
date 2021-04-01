public class Customer
{
 public static void main(String[] args)
 {
	 Bank rep = new Bank();
	 rep.openAccount();
	 rep.getLoan();
	 rep.calculateInterest();
	 System.out.println(rep.interest);
	 //rep.training();
	 System.out.println(rep.salary);
	 
 }
}