package Homework;

import java.util.Scanner;

public class ÝkinciDerecedenDenklemKökBulmaÖdevi {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);

double a , b , c ,x1 ,x2 , delta;
 
// a,b,c degerlrini tanmlıyoruz		
		
System.out.println("a degerini girin : ");
a = input.nextDouble();

System.out.println("b degerini girin : ");
b = input.nextDouble();

System.out.println("c degerini girin : ");
c = input.nextDouble();

// Deltayı tanımladık		
		
delta = b * b - 4*(a*c);

if (delta == 0) {
	x1 = -b / (2*a);
	
	System.out.println("Kökler  birbirine esittir ve x1 = x2 " + x1);
}

else if(delta > 0) {
	x1 = (-b + Math.sqrt(delta))/ 2*a ;
	x2 = (-b - Math.sqrt(delta))/ 2*a ;
	
	System.out.println(" 2 tane reel kökü vardır x1 = " + x2 );
	
}
	
else 
	System.out.println(" Reel  kökü yoktur.");


	}

}
