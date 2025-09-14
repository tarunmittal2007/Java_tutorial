// write a code to convert temperature from celsius to fahrenheit 

import java.util.Scanner;

public class celsiustofahrenheit 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 

double fahrenheit ;

System.out.print("Enter the temperature in celsius : "); 
double celsius = sc.nextDouble(); 

fahrenheit = (celsius*1.8) + 32 ; 

System.out.println("Temperature in fahrenheit is : " + fahrenheit); 

sc.close(); 

}    
}
