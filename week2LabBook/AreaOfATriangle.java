package week2LabBookProblems;
import java.util.Scanner;
public class AreaOfATriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height,base;
		double area;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Height");
		height = scan.nextInt();
		System.out.println("Enter Base");
		base = scan.nextInt();
		area = 0.5*(double)base*(double)height;
		System.out.printf("Area of a Triangle is : %f", area);
		
		
	}

}
