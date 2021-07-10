package LabBookQues_6_TO_10;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the number..");
		int num = input.nextInt();
		if(num%2 == 0) {
			System.out.println("The number is Even");
		} else {
			System.out.println("The number is Odd");
		}
	}

}
