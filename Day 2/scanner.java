package javatraining;

import java.util.Scanner;

public class Biodata {
public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = sc.nextLine();

    System.out.println("Enter your age:");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter your college name:");
    String college = sc.nextLine();

    System.out.println("Enter your department:");
    String dept = sc.nextLine();

    System.out.println("Enter your city:");
    String city = sc.nextLine();

    System.out.println("BIODATA ");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("College: " + college);
    System.out.println("Department: " + dept);
    System.out.println("City: " + city);

    sc.close();
}

}
