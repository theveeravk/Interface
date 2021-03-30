public class Calculator
{
public static void main(String[] args)
{
 
Calculator myCalculator = new Calculator(); 

  
myCalculator.add(100); //100 - parameter
myCalculator.add(100,200); 
myCalculator.add(12.34f); 
}


public void add(float no) // argument
{
System.out.println(no+12.3); 
}
public void add(int no) // argument
{
System.out.println(no+123); 
}
public void add(int no,int no2) // argument
{
System.out.println(no+no2); 
}


}
