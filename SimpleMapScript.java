public class SimpleMapScript {
	public static void main(String[] args) {
		SimpleMapScript script = new SimpleMapScript;
		script.launch();
	}
	
	public void lauch() {
		SimpleMap map = new SimpleMapImp();
		testMap(map);
	}
	
	public void testMap(SimpleMap map) {
		System.out.println( "Testing simple map..." );
		if( map.isEmpty() ) {
			map.put(1, "Hello");
			map.put(99, "End");
			map.put(500, "Bobbins");

		}
	}
}