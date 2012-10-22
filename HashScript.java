public class HashScript {
	public static void main(String[] args) {
		System.out.println( "Give me a string and I will calculate its hash code" );
		String str = System.console().readLine();
		int hash = str.hashCode();
		
		System.out.println( "hash = " + hash );
	}
}