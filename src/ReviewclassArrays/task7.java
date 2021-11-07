package ReviewclassArrays;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a java program to check whether a given number is prime or not?
		int number=-15;
		boolean isPrime=true;
		if(number>1) {
			for(int i=2; i <number; i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
			
			
			
		}else {
			isPrime=false;
		}
		if(isPrime) {
			System.out.println(number+" is prime ");
		}else {
			System.out.println(number+ " is not prime ");
		}
	}

}
