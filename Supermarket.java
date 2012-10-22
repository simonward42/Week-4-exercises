public class Supermarket {
	private PersonQueueImp queue;
	
	public Supermarket sm() {
		queue = new PersonQueueImp();
	}
	
	public void addPerson(Person p) {
		queue.add(p);
	}
	
	public Person servePerson() {
		queue.retrieve();
	}
}