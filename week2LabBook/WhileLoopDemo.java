package week2LabBookProblems;
import java.util.Scanner;
public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner (System.in);
//		int number, sum=0;
//		System.out.println("Please Enter any value below or equal 10..");
//		number = scan.nextInt();
//		while(number<=100) {
//			sum = sum+number;
//			number++;
//		
//			
//		}
//		System.out.println("");
//		System.out.format("Sum of Numbers From the while Loop is : %d", sum);
		
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any integer Value below 10: ");
		number = sc.nextInt();
		while (number <= 10) {
		sum = sum + number;
		number++;
		}
		System.out.format(" Sum of the Numbers From the While Loop is: %d ",sum);
	}

}
