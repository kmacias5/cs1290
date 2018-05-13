package codinginterview;

public class Problem1_6 {

	public static void main(String[] args) {
		String one = "abbmmmbbbbbbb";

		System.out.println(compress(one));
	}

	public static String compress(String a) {
		StringBuilder m = new StringBuilder();
		int count = 1;
		for (int i = 0; i < a.length(); i++) {
			if (i == a.length() - 1 || a.charAt(i) != a.charAt(i + 1)) {
				m.append(a.charAt(i));
				m.append(count);
				count = 0;
			}
			count++;
		}
		return m.toString();
	}
}
