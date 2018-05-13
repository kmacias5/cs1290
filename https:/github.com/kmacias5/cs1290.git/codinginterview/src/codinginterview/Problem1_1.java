package codinginterview;

import java.util.Arrays;

public class Problem1_1 {
	public static void main(String[] args) {
		String one = "asfghjk32";
		String two = "atghkt";
		System.out.println("string " + one + " is unique:" + isUnique(one));
		System.out.println("string " + two + " is unique:" + isUnique(two));
	}

	public static Boolean isUnique(String s) {
		// convert string to character array in order to sort it
		char[] temp = s.toCharArray();
		// When the array is sorted, we check if next character is the same as
		// current one if
		// true then we have a duplicate so it's not unique, otherwise continue
		// to check others
		Arrays.sort(temp);
		for (int i = 0; i < temp.length - 1; i++) {
			if (temp[i] == temp[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
