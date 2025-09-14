// write a code in java to convert area and perimeter of the rectangle 

import java.util.Scanner; 

public class rectangle 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

double length , width , perimeter , area ; 

System.out.print("Enter the length of the triangle : "); 
length = sc.nextDouble();

System.out.print("Enter the width of the triangle : "); 
width = sc.nextDouble(); 

perimeter = 2*(length+width); 
area = length*width ; 

System.out.println("AREA of the triangle is : " + area);
System.out.println("PERIMETER of the triangle : " + perimeter); 

sc.close(); 
}    
}
