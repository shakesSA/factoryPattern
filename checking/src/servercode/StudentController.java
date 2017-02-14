package servercode;

public class StudentController {
	Student model;
	StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void updateStudentView() {
		view.studentDetails(model.getName(), model.getCourse(),
				model.getCampus());
	}

	public void setName(String name) {
		model.setName(name);
	}

	public void setCourse(String course) {
		model.setCourse(course);
	}

	public void setCampus(String campus) {
		model.setCampus(campus);
	}
}
