import java.util.Scanner;

public class HappyNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = 0; 
		
		System.out.println("how many numbers do you want to input");
		if(input.hasNext()) {
			N = input.nextInt();
		}
		

		for(int i = 0; i < N ; i++) {
			int S = 0; 
			System.out.println("input number");
			if(input.hasNext()) {
				S = input.nextInt();
			}
			
			boolean isHappy = isHappy(S, S, false);
			
			System.out.println("this number, " + S + ", is happy?? = " + isHappy);
		}
		
	}
	
	public static boolean isHappy(int original, int number, boolean notFirstTime) {
			
		if(number == 1 && notFirstTime == true) {
			return true;
		}else if(number == original && notFirstTime == true) {
			return false; 
		}else {
			int newNumber = getNewNumber(number); 
			return(isHappy(original, newNumber, true));
		}
		
			
	}
	
	public static int getNewNumber(int number) {
		
		int singleDigit = 0;
		int newNumber = 0; 
		
		for(int i = 0; i < String.valueOf(number).length(); i++) {
			singleDigit = Integer.parseInt(Integer.toString(number).substring(i, i + 1));
			newNumber += (int)(Math.pow(singleDigit, 2));
		}
		
		return newNumber;
		
	}
}