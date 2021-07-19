package week2LabBookProblems;

import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Radius");
		double radius = scan.nextDouble();
		double area = Math.PI * (radius*radius);
		System.out.println("Area of a Circle is : "+ area);
		double circumference = 2 * Math.PI * radius;
		System.out.println("Circumference of a circle is : "+ circumference);
	}

}
