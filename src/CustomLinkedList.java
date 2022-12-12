
public class CustomLinkedList<T> {
	private Node head;
	private Node tail;
	private int size;

	public CustomLinkedList() {
		this.size = 0;
	}

	public void insertFirst(T val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size += 1;
	}

	public void insertLast(T val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}

	public void insert(T val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}
		if (index == size) {
			insertLast(val);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
	}

	public T deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}
		Node secondLast = get(size - 2);
		T val = tail.value;
		tail = secondLast;
		tail.next = null;
		return val;
	}

	public T delete(int index) {
		if (index == 0) {
			return deleteFirst();
		}
		if (index == size - 1) {
			return deleteLast();
		}
		Node prev = get(index - 1);
		T val = prev.next.value;
		prev.next = prev.next.next;
		return val;
	}

	public Node get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public T deleteFirst() {
		T val = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	private class Node {
		private T value;
		private Node next;

		public Node(T value) {
			this.value = value;
		}

		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
