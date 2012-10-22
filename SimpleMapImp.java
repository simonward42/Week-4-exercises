public class SimpleMapImp implements SimpleMap {
	private String[] names;
	private static MAP_SIZE=100;
	
	public SimpleMapImp() {
		names = new String[MAP_SIZE];
	}
	
	public void put(int key, String name) {
		int hashKey = HashUtilities.shorterHash(key);
		names[hashKey] = name;
	}
	
	public String get(int key) {
		int hashKey = HashUtilities.shorterHash(key);
		return names[hashKey];
	}
	
	public void remove(int key) {
		int hashKey = HashUtilities.shorterHash(key);
		String result = names[hashKey];
		names[hashKey] = null;
		return result;
	}
	
	/**
	 * Returns true if there are no workers in the map,
	 * false otherwise
	 */
	public boolean isEmpty() {
		for(int i=0; i<MAP_SIZE; i++) {
			if( names[i]!=null ) {
				return false;
			}
		}
		return true;
	}
	
}