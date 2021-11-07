package ReviewclassArrays;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a java program to print the first ten numbers of Fibonacci series
		//0 11 23 58 13 21 34
		int previousNumber=0;
		int currentNumber=1;
		int sum=0;
		int numbersToPrint=10;
		System.out.println(previousNumber+" ");
		System.out.println(currentNumber+" ");
		 for(int i=0;i<numbersToPrint-2;i++){
			 
			 sum=currentNumber+previousNumber;
			 System.out.println(sum+" ");
			 previousNumber=currentNumber;
			 currentNumber=sum;
		 }		
	}

}
