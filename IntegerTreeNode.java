public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public int getValue() {
		return value;
	}
	
	public void add(int newNumber) {
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
		} else if(n > this.value && this.right != null) {
			return right.contains(n);
		} else if(n < this.value && this.left != null){
			return left.contains(n);
		} else {
		return false;
		}
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
	
	public String toString() {
		String result = "";
		result += "[" + value + " L";
		if(left != null) {
			result += left.toString(); 
		} else {
			result += "[]";
		}
		result += " R";
		if(right != null) {
			result += right.toString();
		} else {
			result += "[]";
		}
		result += "]";
		return result;
	}

	public String toShortString() {
		String result = "";
		result += "[" + value;
		if(left != null) {
			result += " " + left.toShortString();
		}
		if (right != null) {
			result += " " + right.toShortString();
		}
		result += "]";
		return result;
	}
	
}
