package week2LabBookProblems;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double width, length, area;
		System.out.println("Enter width");
		width = scan.nextDouble();
		System.out.println("Enter Length");
		length = scan.nextDouble();
		area = width*length;
		System.out.println("Area of rectangle: " + area);
	}

}
