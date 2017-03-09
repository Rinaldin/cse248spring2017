package p3_button_in_controller;

import javafx.scene.control.Button;

public class StudentController {
	private Student model;
	private GUIView view;
	String[] data;
	
	public StudentController(Student model, GUIView view){
		this.model = model;
		this.view = view;
		Button okBtn = view.getOkBtn();
		okBtn.setOnAction(e -> {
			data = view.getStudentDetails();
			setStudentDetails(data);
			updateView();
		});
	}
	
	private void setStudentDetails(String[] info) {
		model.setName(info[0]);
		model.setId(info[1]);
	}
	
	private void updateView() {
		view.showStudentDetails(model.getName(), model.getId());
	}
}
