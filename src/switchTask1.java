import java.util.Scanner;
public class switchTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter country name");
		String count=scan.next();
	    String food=null;
	    
	    
	    switch (count.toLowerCase()) {
	    	case "turkey":
	    		food="Gyro";
	    		break;
	    		default:
	    			food = "Unknown";
	    }
	    System.out.println("If your country is " +count+(" your favorite food is ")+food);
	}

}
