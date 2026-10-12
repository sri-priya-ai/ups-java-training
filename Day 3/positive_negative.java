package javatraining1;
import java.util.Scanner;
public class positive_negative 
{
	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result=(n>0) ? "positive" : (n<0) ? "negative" : "zero";
		System.out.println(result);
		sc.close();
	}
}
