public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		User user1 = new User("Nikolas");
		Persister persis = new Persister();
		persis.save(user);
		persis.report(user);
		persis.save(user1);
		persis.report(user1);


	}
}