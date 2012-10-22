public class StringList {
	private String str;
	private StringList nextString;
	
	public StringList(String str) {
		this.str = str;
		this.nextString = null;
	}
	
	public void addStr(StringList newString) {
		if( this.nextString == null ) {
			this.nextString = newString;
		} else {
			this.nextString.addStr(newString);
		}
	}
	
	public StringList next() {
		return this.nextString;
	}
	
	public int str() {
		return this.str;
	}

}