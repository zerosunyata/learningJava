public class p673 {

	public static void main(String args[]) {

		String characters = "([])";
		boolean correct = false;

//		String characters = "abcde";
		stack stackCharacters = new stack();
		for (int i = 0; i < characters.length(); i++) {
			char c = characters.charAt(i);
			if (c == '(' || c == '[')
				stackCharacters.push(c);
			else {
				char pop = stackCharacters.pop();
				if (c == ')') {
					if (pop == '(') {
						correct = true;
					}else
						correct = false;
				} else {
					if (pop == '[') {
						correct = true;
					}else
						correct = false;
					}
				}
			}

		if (correct == true)
			System.out.println("Yes");
		else
			System.out.println("No");
		}
	}