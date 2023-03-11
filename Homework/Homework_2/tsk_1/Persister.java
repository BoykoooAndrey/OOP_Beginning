import java.util.ArrayList;
import java.util.List;

public class Persister{
	List <User> base = new ArrayList<>();
	
	

	public Persister(){
		
	}
	
	public void save(User user){
		base.add(user);
		System.out.println("Save user: " + user.getName());
	}

	public void report(User user){
		System.out.println("Report for user: " + user.getName());
	}

	public List<User> getBase() {
		return base;
	}
}