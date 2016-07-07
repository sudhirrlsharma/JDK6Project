package generic;

public class Node<E> {
	E elem;
	Node<E> next;

	Node(E elem) {
		this.elem = elem;
	}
}
