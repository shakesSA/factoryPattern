package servercode;

public class StudentControllerTest {
	public StudentControllerTest() {

	}

	public static void main(String[] args) {

		Student model = setStudent();
		StudentView view = new StudentView();
		StudentController studentController = new StudentController(model, view);

		studentController.updateStudentView();
		studentController.setName("John");
		studentController.setCampus("TOKAI");
		studentController.setCourse("HR");
		studentController.updateStudentView();
	}

	public static Student setStudent() {
		Student student = new Student();
		student.setName("Moenieb");
		student.setCourse("IT");
		student.setCampus("CBD");
		return student;
	}

}
