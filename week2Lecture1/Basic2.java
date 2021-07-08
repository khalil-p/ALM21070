package week2Lecture1;
import java.util.Scanner;
public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter the first number..");
		int a = scan.nextInt();
		System.out.println("Please Enter the second number..");
		int b = scan.nextInt();
		int c= a*b;
		System.out.println("Multiplication of a and b is .." + c);
		}

}
