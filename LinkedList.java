package Lists;



/**
 * The {@code LinkedList} class implements the {@code List} interface using a linked list.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * @param <E>
 *            the type of elements held in the list.
 */
public class LinkedList<E> implements List<E> {

	/**
	 * The Node class implements nodes used in linked lists.
	 * 
	 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
	 */
	protected class Node {

		/**
		 * The element held in this Node.
		 */
		public E element;

		/**
		 * A reference to the next Node.
		 */
		public Node next;

		/**
		 * Constructs a Node.
		 * 
		 * @param element
		 *            the element held in the Node.
		 * @param next
		 *            the next Node in the list.
		 */
		Node(E element, Node next) {
			this.element = element;
			this.next = next;
		}
	}

	/**
	 * A reference to the first element in the list.
	 */
	protected Node start = null;

	@Override
	public void addFirst(E element) {
		start = new Node(element, start);
	}

	@Override
	public String toString() {
		Node n = start;
		String s = "(";
		while (n != null) {
			if (n == start)
				s += n.element;
			else
				s += ", " + n.element;
			n = n.next;
		}
		return s + ")";
	}

}
