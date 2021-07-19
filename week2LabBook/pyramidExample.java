package week2LabBookProblems;
import java.util.Scanner;
public class pyramidExample{
	public static void main (String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		System.out.println();
		int term = 5;
		for(int i=1; i<=term;i++) {
			for(int j=term; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		
		
		}
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int input = scan.nextInt(), number=1;
		System.out.println("Floyd's Triangle");
		System.out.println("****************");
		for (int i=1; i<=input;i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(number+ "  ");
				number++;
			}
			System.out.println();
		}
		
	
	}


	}

		
		
	



