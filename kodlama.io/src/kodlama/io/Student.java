package kodlama.io;

public class Student extends User {
 private int _age;
 private String _creditCardNumber;
 private String SchoolName;
 public Student() {
	 
 }
 
public Student(int _age, String _creditCardNumber, String schoolName) {
	super();
	this._age = _age;
	this._creditCardNumber = _creditCardNumber;
	SchoolName = schoolName;
}
public int get_age() {
	return _age;
}
public void set_age(int _age) {
	this._age = _age;
}
public String get_creditCardNumber() {
	return _creditCardNumber;
}
public void set_creditCardNumber(String _creditCardNumber) {
	this._creditCardNumber = _creditCardNumber;
}
public String getSchoolName() {
	return SchoolName;
}
public void setSchoolName(String schoolName) {
	SchoolName = schoolName;
}
}
