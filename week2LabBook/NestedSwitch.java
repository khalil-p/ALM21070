package week2LabBookProblems;

public class NestedSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tech =2, course=1;
		switch(tech)
		{
		case 1:
		{
			System.out.println("Python");
			break;
		}
		case 2:
		{
			switch(course)
			{
			case 1:
			{
				System.out.println("J2EE");
				break;
			}
			case 2:
			{
				System.out.println("Advance Java");
			}
			}		
		}
		}
}
}
