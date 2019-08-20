public class Warmup{
	public static int cycleLength = 0;
	public static int number(int input) {
		System.out.println(input);
		Warmup.cycleLength ++;
		if (input == 1) {
			return 1;
		}else {
			
			if (input % 2 == 1) {
				return number(3 * input + 1);
			}else {
				return number(input/2);
			}
		}
	}
	
	public static int cycle(int max, int min) {
		int len = 0;
		for (int i = min; i <= max; i++) {
			Warmup.cycleLength = 0;
			number(i);
			if  (len < Warmup.cycleLength) {
				len = Warmup.cycleLength;
			}
		}
		return len;
		
	}
	
	public static void main(String args[]) {
		int max = 10;
		int min = 1;
		System.out.println(cycle(max, min));
	}
}