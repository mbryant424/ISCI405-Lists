package Lists;



/**
 * The {@code ArrayList} class implements the {@code List} interface using an array.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * @param <E>
 *            the type of elements held in the list.
 */
public class ArrayList<E> implements List<E> {

	/**
	 * An array for containing elements.
	 */
	protected E[] array;

	/**
	 * The beginning of the list in the array.
	 */
	protected int start = 0;

	/**
	 * The end of the list in the array.
	 */
	protected int end = 0;

	/**
	 * Constructs an empty list with the specified initial capacity.
	 * 
	 * @param initialCapacity
	 *            the initial capacity of this {@code ArrayList}.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity) {
		array = (E[]) new Object[initialCapacity];
	}

	@Override
	public void addFirst(E element) {
		start--;
		if (start < 0)
			start += array.length;
		array[start] = element;
	}

	@Override
	public String toString() {
		String s = "(";
		int i = start;
		while (i != end) {
			if (i == start)
				s += array[i];
			else
				s += ", " + array[i];
			i = (i + 1) % array.length;
		}
		return s + ")";
	}

}
