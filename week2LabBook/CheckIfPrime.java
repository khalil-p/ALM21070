package week2LabBookProblems;

import java.util.Scanner;

public class CheckIfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		boolean boo = true;
		int num;
		System.out.println("Enter a number");
		num = scan.nextInt();
		scan.close();
		if(num==1) {
			System.out.println("1 is nither Prime nor Composite");
		}else if(num>1) {
			for (int i=2; i<=num/2;i++) {
				if(num%i == 0) {
					boo = false;
					break;
				}
				
			}
			if(boo) {
				System.out.println("Number is prime");
			} else {
				System.out.println("Number is Not a Prime");
			}
		}
	}

}
