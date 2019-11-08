package Lists;



/**
 * The {@code ListTest} class tests the {@code LinkedList} and {@code ArrayList} classes.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class ListTest {

	/**
	 * The main method of {@code ListTest}.
	 * 
	 * @param args
	 *            the program arguments.
	 */
	public static void main(String[] args) {
		test(new LinkedList<Integer>());
		test(new ArrayList<Integer>(6));
	}

	/**
	 * Tests the specified list.
	 * 
	 * @param list
	 *            the list to test.
	 */
	protected static void test(List<Integer> list) {
		for (int i = 4; i >= 0; i--)
			list.addFirst(i);
		System.out.println(list);
	}

}
