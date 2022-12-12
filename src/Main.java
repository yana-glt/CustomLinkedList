
public class Main {

	public static void main(String[] args) {
		CustomLinkedList<Integer> list = new CustomLinkedList<>();
		list.insertFirst(5);
		list.insertFirst(2);
		list.insertFirst(9);
		list.insertFirst(7);
		list.insertLast(25);
		list.insert(50, 3);
		list.display();
		System.out.println(list.deleteFirst());
		list.display();
		System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.delete(2));
		list.display();
		System.out.println();
	}
}
