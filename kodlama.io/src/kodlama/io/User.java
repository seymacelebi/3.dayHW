package kodlama.io;

public class User {
	int _id;
	private String _name;
	private String _lastname;
	private String _email;
	private String _password;
	
	public User() {
		
	}
	
	public User(int _id, String _name, String _lastname, String _email, String _password) {
		super();
		this._id = _id;
		this._name = _name;
		this._lastname = _lastname;
		this._email = _email;
		this._password = _password;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_lastname() {
		return _lastname;
	}
	public void set_lastname(String _lastname) {
		this._lastname = _lastname;
	}
	public String get_email() {
		return _email;
	}
	public void set_email(String _email) {
		this._email = _email;
	}
	public String get_password() {
		return _password;
	}
	public void set_password(String _password) {
		this._password = _password;
	}
}
