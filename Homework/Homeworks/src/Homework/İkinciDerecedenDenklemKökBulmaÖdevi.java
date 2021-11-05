package Homework;

import java.util.Scanner;

public class ÝkinciDerecedenDenklemKökBulmaÖdevi {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);

double a , b , c ,x1 ,x2 , delta;

System.out.println("a : ");
a = input.nextDouble();

System.out.println("b : ");
b = input.nextDouble();

System.out.println("c : ");
c = input.nextDouble();

delta = b * b - 4*(a*c);

if (delta == 0) {
	x1 = -b / (2*a);
	
	System.out.println("Kökler esittir ve x1 = x2 " + x1);
}

else if(delta > 0) {
	x1 = (-b + Math.sqrt(delta))/ 2*a ;
	x2 = (-b - Math.sqrt(delta))/ 2*a ;
	
	System.out.println(" 2 tane gercek kökü vardýr x1 = " + x2 );
	
}
	
else 
	System.out.println(" Gercek kökü yoktur.");


	}

}
