package week2LabBookProblems;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum =0;
		int array[] = new int[10];
		System.out.println("Please Enter The Elements");
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
		}
		for(int num : array) {
			sum += num;
		}
		System.out.printf("The sum of an array is : %d",sum);
	}
	

}
