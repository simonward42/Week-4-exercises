public class IntList {
	private int number;
	private IntList nextInt;
	
	public IntList(int number) {
		this.number = number;
		this.nextInt = null;
	}
	
	public void addInt(IntList newInt) {
		if( this.nextInt == null ) {
			this.nextInt = newInt;
		} else {
			this.nextInt.addInt(newInt);
		}
	}
	
	public IntList next() {
		return this.nextInt;
	}
	
	public int number() {
		return this.number;
	}

}