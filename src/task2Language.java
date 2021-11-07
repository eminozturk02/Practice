import java.util.Scanner;
public class task2Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter country name");
		String count=scan.next();
	    String lang=null;
	    
	    
	    switch (count.toLowerCase()) {
	    	case "turkey":
	    		lang="Turkish";
	    		break;
	    		default:
	    			lang = "Unknown";
	    }
	    System.out.println("If your country is " +count+(" your language is ")+lang);
	}

}