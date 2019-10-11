
public class CompoundWords {

	public static void main(String args[]) {
			
		String[] strWords = new String[] {"a","alien","born", "less", "lien", "never", "nevertheless", "new", "newborn", "the", "zebra"};
	
		for(int i = 0; i < strWords.length ; i++) {
			String strWord = strWords[i]; 
			
			boolean isCompoundWord = isCompoundWord(strWords, i);
			
			System.out.println("this word, " + strWord + ", is happy?? = " + isCompoundWord);
		}
	

	}
	
	
	public static boolean isCompoundWord(String[] words, int number) {
		
		int times = 0; 
		String strWord = words[number];
	
		for(int i = 0; i < words.length; i++) {
			String tempWord = words[i];
			if(i == number) {
				continue; 
			}
			if(findWord(strWord, tempWord) == true){
				times += 1;
			}
		}
		
		if(times == 2) {
			return true; 
		}
		
		return false;
		
	}
	
	public static boolean findWord(String word, String search) {
		 if(word.toLowerCase().indexOf(search.toLowerCase()) != -1) {
			 return true; 
		 }
		 
		 return false; 
	}
}
