package javatraining;
import java.util.Scanner;

public class RectangleArea {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		int length=sc.nextInt();
		System.out.println("enter the breadth of the rectangle");
		int breadth=sc.nextInt();
		int area=length*breadth;
		System.out.println(area);
		
		
		
	}

}
