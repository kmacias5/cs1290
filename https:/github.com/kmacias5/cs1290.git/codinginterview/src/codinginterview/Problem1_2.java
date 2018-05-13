package codinginterview;

import java.util.Arrays;

public class Problem1_2 {
	public static void main(String[] args) {
		String one = "hey";
		String two = "yeh";
		System.out.println("string " + one + " and string " + two + " are permutations: " + isPermutation(one, two));

	}

	public static Boolean isPermutation(String string1, String string2) {
		// if strings are not equal in length, it means that they have different
		// letters
		if (string1.length() != string2.length()) {
			return false;
		}
		// convert both string to character arrays and then use the sort method
		// of Arrays library
		// If both strings are equal when sorted, this means that both have same
		// letters
		char[] temp1 = string1.toCharArray();
		Arrays.sort(temp1);
		char[] temp2 = string2.toCharArray();
		Arrays.sort(temp2);
		return (new String(temp1).equals(new String(temp2)));

	}
}
