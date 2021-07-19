package week2LabBookProblems;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		int reversenum =0;
		System.out.println("Please Enter The Number:...");
		num = scan.nextInt();
		while(num!=0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + (num%10);
			num = num/10;
		}
		System.out.printf("The Reversed number is: %d", reversenum);
		
		
	}

}
