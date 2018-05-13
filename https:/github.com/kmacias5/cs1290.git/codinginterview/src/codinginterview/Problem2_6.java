package codinginterview;

public class Problem2_6 {
	public static void main(String[] args) {
		Node n = new Node(1);
		n.append(4);
		n.append(3);
		n.append(3);
		n.append(4);
		n.append(1);
		n.print();
		System.out.println(isPalindrome(n));
	}

	static boolean isPalindrome(Node l) {
		Node h = null;
		Node a = l;
		while (a != null) {
			Node n = new Node(a.data);
			n.next = h;
			h = n;
			a = a.next;
		}

		while (l != null && h != null) {
			if (l.data != h.data) {
				return false;
			}
			l = l.next;
			h = h.next;
		}
		return true;

	}
}
