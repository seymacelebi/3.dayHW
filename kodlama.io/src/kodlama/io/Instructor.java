package kodlama.io;

public class Instructor extends User {
 private String _resume;
 private String _adress;
 public Instructor() {
	 
 }
public Instructor(String _resume, String _adress) {
	super();
	this._resume = _resume;
	this._adress = _adress;
}
public String get_resume() {
	return _resume;
}
public void set_resume(String _resume) {
	this._resume = _resume;
}
public String get_adress() {
	return _adress;
}
public void set_adress(String _adress) {
	this._adress = _adress;
}
}
