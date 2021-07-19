package week2LabBookProblems;

public class SumOfArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i : array) {
			sum+=i;
		}
		System.out.println("Sum of the elements of an array is : "+ sum);
	}

}
