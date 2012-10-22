public class SupermarketScript {
	public static void main(String[] args) {
		SupermarketScript script = new SupermarketScript();
		script.launch();
	}
	
	public void launch() {
		Supermarket Morrisons = new Supermarket();
		script.testSupermarket(Morrisons);
	}
	
	public void testSupermarket(Supermarket sm) {
		System.out.println( "Testing the Supermarket, and the PersonQueue..." );		
		Person p1 = new Person("Bill", 34);
		Person p2 = new Person("Sarah", 28);
		Person p3 = new Person("Kenneth", 65);
		sm.addPerson(p1);
		sm.addPerson(p2);
		sm.addPerson(p3);
		
		System.out.println( "Added three people to the supermarket queue. Let's serve some..." );
		Person firstPersonServed = sm.servePerson();
		System.out.println( "First person served is: " + firstPersonServed.name() );
		Person secondPersonServed = sm.servePerson();
		System.out.println( "Second person served is: " + secondPersonServed.name() );
	}
}