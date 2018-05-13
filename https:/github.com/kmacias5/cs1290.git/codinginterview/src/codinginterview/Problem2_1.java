package codinginterview;

public class Problem2_1 {
	public static void main(String[] args) {
		Node n = new Node(1);
		n.append(4);
		n.append(3);
		n.append(1);
		n.append(3);
		n.append(4);
		n.append(1);
		n = deleteDuplicates(n);
		n.print();
	}

	static Node deleteDuplicates(Node t) {
		Node c = t;
		while (c != null) {
			Node temp = c;
			while (temp.next != null) {
				if (temp.next.data == c.data) {
					temp.next = temp.next.next;
				} else {
					temp = temp.next;
				}
			}
			c = c.next;
		}
		return t;
	}
}

class Node {
	Node next = null;
	int data;

	public Node(int n) {
		this.data = n;
	}

	void print() {
		Node n = this;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	void append(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

}
