package week2LabBookProblems;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Side Length");
		double side = scan.nextDouble();
		double area = side*side;
		System.out.println("Area of Square is : " + area);
		
	}

}
