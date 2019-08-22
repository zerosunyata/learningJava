package owoWhatsThis;

public class Stack {
	private static char stack[] = new char[128];
	private static int sp = 127;

	public static boolean push(char c) {
		if (sp == -1)
			return false;
		stack[sp] = c;
		sp--;
		return true;
	}

	public static char pop() {
		if (sp == -1 || sp == 127)
			return 0;
		sp++;
		char leftH = stack[sp];
		return leftH;
	}
}
