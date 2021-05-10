package kodlama.io;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.set_id(1);
		instructor.set_name("Engin");
		instructor.set_lastname("Demiroğ");
		instructor.set_adress("Ankara");
		instructor.set_email("engin@gmail.com");
        instructor.set_password("a");
       
        Student student=new Student();
        student.set_id(2);
        student.set_name("Şeyma");
        student.set_lastname("Çelebi");
        student.setSchoolName("Üsküdar Üniversitesi");
        
        Student student2=new Student();
        student2.set_id(3);
        student2.set_name("Esma");
        student2.set_lastname("Çelebi");
        student2.setSchoolName("Üsküdar Üniversitesi");

		InstructorManager instructorManager=new InstructorManager();
	    instructorManager.add(instructor);	
      
       
	}

}
