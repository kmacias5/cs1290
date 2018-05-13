package codinginterview;

public class Problem2_3 {
	public static void main(String[] args) {
		Node n = new Node(1);
		n.append(4);
		n.append(3);
		n.append(1);
		n.append(3);
		n.append(4);
		n.append(1);
		deleteMiddle(n);
		n.print();
	}

	static void deleteMiddle(Node t) {
		if (t == null || t.next == null) {
			return;
		}
		Node n = t.next.next;
		t.next = n;
	}
}
