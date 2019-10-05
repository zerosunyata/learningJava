public class Compoundwords{
	static int count = 0;
	static String correct = "";
	public static int Compound(int x, int y) {
		String [] words = {"a", "lien", "alien", "born", "new", "newborn"};
		String compound;
		compound = words[x] + words[y];
		for (int i = 0; i <= words.length - 1; i ++) {
			if (compound.equals(words[i])) {
				correct += compound + " ";
				count += 1;
			}
		}
		if (y != words.length - 1 && x != words.length - 1) {
			return Compound(x, y + 1);
		}else if (y == words.length - 1 && x != words.length - 1) {
			return Compound(x + 1, 0);
		}else;
			return (count);
	}
	public static void main(String args[]) {
		int x = Compound(0, 1);
		System.out.println(x);
		System.out.println(correct);
		}
	}
