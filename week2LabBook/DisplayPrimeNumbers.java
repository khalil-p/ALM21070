package week2LabBookProblems;

public class DisplayPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		int i;
		for(i=2; i<=array.length; i++) {
			if(i%2==0 || i%3==0)
				continue;
		System.out.println(i + " ");
		}
	}

}
