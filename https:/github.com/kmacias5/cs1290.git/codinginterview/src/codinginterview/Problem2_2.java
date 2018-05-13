package codinginterview;

public class Problem2_2 {
	public static void main(String[] args) {
		Node n = new Node(2);
		n.append(4);
		n.append(3);
		n.append(1);
		n.append(3);
		printKthToLast(n, 2);
		printKthToLast(n, 3);
	}

	public static void printKthToLast(Node c, int k) {

		int count = 0;
		while (c != null) {
			if (count >= k) {
				System.out.println(c.data);
			}
			c = c.next;
			count++;
		}
	}
}
