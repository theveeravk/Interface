public class Citizen extends Father implements ElectionRules,TrafficRules
{
public static void main(String[] args)
{
	//TrafficRules tr = new TrafficRules();
TrafficRules police = new Citizen(); 
police.wearHelmet(); 
police.bringLicense();

ElectionRules officer = new Citizen();
officer.takeIDCard();
officer.wearMask();
  Citizen c = new Citizen();
 c.wearMask();
  c.takeIDCard();
  c. work();
  c.grow();
  c.wearHelmet();
  c.bringLicense();
  System.out.println(c.traffic_fine);
 
  System.out.println(TrafficRules.traffic_fine);
}
public void work()
{
	System.out.println(" Going to work");
}
public void wearMask()
{
	System.out.println(" Wearing mask");
}

public void takeIDCard()
{
	System.out.println(" Show id card");
}
public void wearHelmet()
{
	System.out.println(" wear helmet");
}
public void  bringLicense()
{
	System.out.println(" bring license");
}





}