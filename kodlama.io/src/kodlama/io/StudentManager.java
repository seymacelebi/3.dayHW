package kodlama.io;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.get_name() +  " "+  user.get_lastname() + " student added" );	
}
	
	}
