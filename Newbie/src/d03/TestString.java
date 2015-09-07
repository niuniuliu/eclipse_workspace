package d03;

public class TestString {
	public static void main(String[] args) {
		int n = findWord("cabcedabcdddabcc", "abc");
		int m = toFindWord("cabcedabcdddabcc", "abc");
		System.out.println(n);
		System.out.println(m);
		print("aaabbbcccddd");
	}

	public static int findWord(String target, String word) {
		String str = target;
		int n = 0;
		int index = 0;
		while ((index = str.indexOf(word, index)) != -1) {
			n++;
			index += word.length();

		}
		return n;
	}

	public static int toFindWord(String target, String word) {
		int n = 0;
		int index = 0;
		String loopWord = word;

		while (target.indexOf(loopWord) != -1) {
			n++;
			index = target.indexOf(loopWord) + loopWord.length();
			target = target.substring(index);
		}
		return n;
	}

	public static void print(String str) {
		char c = str.charAt(0);
		int n = 1;
		for (int i = 1; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				n++;
			} else {
				if (n > 1) {
					System.out.println(i - n + ", " + c + ", " + n);
					n = 1;
				}
				c = str.charAt(i);
			}
		}

		/*
		 * if(n>1){ System.out.println(str.length()-n + "," + c + "," + n); }
		 */
	}
}