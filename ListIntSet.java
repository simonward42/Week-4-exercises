public class ListIntSet implements IntSet {
	private IntList root;
	
	public ListIntSet() {
		root = null;
	}

	public void add(int newNumber) {
		if( root == null) {
			IntList firstElement = new IntList(newNumber);
			root = firstElement;
		} else if( !root.contains(newNumber) ) {
			root.addInt(newNumber);
		}
	}
	
	public boolean contains(int n) {
		return root.contains(n);
	}
	
	public boolean containsVerbose(int n) {
		return root.containsVerbose(n);
	}
	
	public String toString() {
		return root.toString();
	}
}