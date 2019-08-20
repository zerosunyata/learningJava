
// p673.stack
public class stack {
	
	public static char[] stack = new char[128];
	public static int stackPointer = 128 - 1; 
	
	public boolean push(char c) {
		
		if(stackPointer == -1)
			return false;
			
		stack[stackPointer] = c;
		stackPointer --; 
		
		return true; 
	}
	
	public char pop() {
		if(stackPointer == -1 || stackPointer == 127)
			return 0;
		
		stackPointer ++;
		return (stack[stackPointer]);
	}
}
