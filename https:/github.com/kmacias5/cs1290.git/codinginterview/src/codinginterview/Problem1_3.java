package codinginterview;

public class Problem1_3 {
	public static void main(String[] args) {

		String m = "hi hi  ";
		char[] n = m.toCharArray();
		System.out.println(URLify(n, 5));
		m = "Mr John Smith    ";
		n = m.toCharArray();
		System.out.println(URLify(n, 13));
	}

	public static char[] URLify(char[] word, int l) {

		int insert = word.length;
		for (int i = l - 1; i >= 0; i--) {
			if (word[i] == ' ') {
				word[insert - 1] = '0';
				word[insert - 2] = '2';
				word[insert - 3] = '%';
				insert = insert - 3;
			} else {
				word[insert - 1] = word[i];
				insert--;
			}
		}
		return word;
	}
}
