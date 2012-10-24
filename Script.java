public class Script {
	public static void main(String[] args) {
		Script s = new Script();
		s.launch();
	}
	
	public void launch() {
		System.out.println( "Testing the IntegerTree..." );
		System.out.println( "Let's populate the tree with some numbers:" );

		IntegerTreeNode node1 = new IntegerTreeNode(6);
		System.out.println( "Creating first node, value: " + node1.getValue() );

		IntegerTreeNode tree = node1;

		System.out.println( "Adding second node, value: 11" );
		tree.add(11);
		System.out.println( "Adding third node, value: 4" );
		tree.add(4);
		System.out.println( "Adding fourth node, value: 9" );
		tree.add(9);
		System.out.println( "Adding fifth node, value: 1" );
		tree.add(1);
		System.out.println( "Adding sixth node, value: 7" );
		tree.add(7);
		System.out.println( "Adding seventh node, value: 24" );
		tree.add(24);
		System.out.println( "Adding eighth node, value: 10" );
		tree.add(10);
		
		System.out.println( "\nTesting the contains(n) method..." );
		if( tree.contains(24) ) {
			System.out.println( "Tree contains 24!" );
		} else {
			System.out.println( "Can't find 24!" );
		}
		if( tree.contains(2) ) {
			System.out.println( "Tree contains 2!" );
		} else {
			System.out.println( "Can't find 2!" );
		}
		
		System.out.println( "\nTesting the getMax() and getMin() methods..." );
		System.out.println( "Maximum value = " + tree.getMax() );
		System.out.println( "Minimum value = " + tree.getMin() );
		
		System.out.println( "\nTesting the toString() method..." );
		System.out.println( "tree.toString() = " + tree.toString() );
		
	}
	
}