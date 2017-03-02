package p1;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student("Adam", "111");
		StudentView view = new StudentView();
		StudentController controller = new StudentController(student, view);
		controller.updateView();
		controller.setStudentInfo("Cathy", "333");
//		controller.getStudentInfo();
		controller.updateView();
	}

}
