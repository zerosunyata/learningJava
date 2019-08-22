package p10115;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class P10115Main {
	public static HashMap<String, String> rules = new HashMap<String, String>();

	public static void search(String unsolvedString) {
		Iterator<String> iter = rules.keySet().iterator();
		while (iter.hasNext()) {
			String keyv = iter.next();
			if (unsolvedString.contains(keyv)) {
				unsolvedString = unsolvedString.replace(keyv, rules.get(keyv));
			}
		}
		System.out.print(unsolvedString);
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		a.useDelimiter(Pattern.compile("\\r\\n"));
		if (a.hasNextInt()) {
			int rn = a.nextInt();
			for (int i = 0; i < rn; i++) {
				if (a.hasNext()) {
					String keyRule = a.next();
					if (a.hasNext()) {
						String valueRule = a.next();
						rules.put(keyRule, valueRule);
					}
				}
			}
		}
		System.out.println(rules.toString());
		String unsolved = a.next();
		search(unsolved);
	}
}