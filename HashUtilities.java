public class HashUtilities {
	static public int shortHash(int value) {
		int result;
		result = Math.abs(value);
		while(result>1000) {
			result = result%1000;
		}
		return result;
	}
}