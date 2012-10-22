/**
 * Implementation of interface PersonQueue using a 
 * queue of Person objects. 
 */
public class PersonQueueImp implements PersonQueue {
	/**
	 * The head of the queue: first in line
	 */
	private Person head;
	
	public PersonQueueImp() {
		head = null;
	}
	
    public void insert(Person person) {
		// See if any Person is already in the queue:
		if(head == null) {
			// Noone in queue, person goes to head
			head = person;
		} else {
			head.addPerson(person);
		}
	}
	
	public Person retrieve() {
		Person result = head;
		head = head.nextPerson;
		return head;
	}
}