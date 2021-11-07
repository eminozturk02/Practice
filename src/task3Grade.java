import java.util.Scanner;

public class task3Grade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your Grade");
		char grade = scan.next().charAt(0);
		String explanation=null;

		switch (grade) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
			break;
		}

		if (!explanation.equals("Not Acceptable")) {
			System.out.println("Grade " + grade +" is "+ explanation);
		} else {
			System.out.println("Please enter another grade");
		}
	}

}



