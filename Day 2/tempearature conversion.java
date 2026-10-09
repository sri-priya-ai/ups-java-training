package javatraining;
import java.util.Scanner;


public class temperature {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature in celcius");
		float celcius=sc.nextFloat();
		float f=(celcius*9/5)+32;
		System.out.println(f);
		
	}
	
	

}
