package generic;

public class LinkedList<E> {
	private Node<E> head, tail;

	public void add(E elem) {
		Node<E> node = new Node<E>(elem);
		if (head == null)
			head = tail = node;
		else
			tail = tail.next = node;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(2);
		
		Node<Integer> node = new Node<Integer>(2);
	}
}