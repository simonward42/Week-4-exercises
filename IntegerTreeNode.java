public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public add(int newNumber) {
		if(newNumber > this.value) {
			if(right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);	
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if(n == this.value) {
			return true;
		} else if(n > this.value) {
			return right.contains(n);
		} else {
			return left.contains(n);
		}
		return false;
	}
	
	public int getMax() {
		// Maximum value is rightmost
		if(this.right == null) {
			return value;
		} else {
			return right.getMax();
		}
	}
	
	public int getMin() {
		// Minimum value is leftmost
		if(this.left == null) {
			return value;
		} else {
			return left.getMin();
		}
	}
	
}
