public class Constructor_StateBank
{
String custName; 
int age; 
int mobile,mobile2; 
String mailID,mailid2; 
public Constructor_StateBank(String name, int age, int mob1, int mob2, String email1, String email2)
{
	custName = name;
	age = age;
	mobile =mob1;
	mobile2=mob2;
	mailID= email1;
	mailid2=email2;
}
public static void main(String[] args)
{
Constructor_StateBank sbi = new Constructor_StateBank("Kumar", 22, 1234,0,"kumar@kumar.com", null); 
Constructor_StateBank sbi2 = new Constructor_StateBank("Raja", 23, 5544, 0, null, null); 
Constructor_StateBank sbi3 = new Constructor_StateBank("Bala", 23, 6745, 9876, null, null); 
Constructor_StateBank sbi4 = new Constructor_StateBank("Bala", 23, 1234, 1235, "bala@bala.com", null); 

sbi.openAccount(); 
sbi2.openAccount();
sbi3.getLoan();
sbi4.getLoan(); 

}

public void openAccount()
{
	 System.out.println("Opening account"+custName+age+mobile+mobile2+mailID+mailid2);
}
public void getLoan()
{
	 System.out.println("getting a loan"+custName+age+mobile+mobile2+mailID+mailid2);
}
}