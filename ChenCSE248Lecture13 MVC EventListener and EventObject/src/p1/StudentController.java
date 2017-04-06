package p1;

public class StudentController {
	private WindowView view;
	private Student model;
	
	public StudentController(WindowView view){
		this.view = view;
		
		// use anonymous class
		view.setWindowListener(new MyWindowListener() {

			@Override
			public void buttonClicked(MyWindowEvent1 ev) {
				model = ev.getStudent();
				updateView();
				System.out.println(ev.getSource());
			}

			@Override
			public void buttonClicked(MyWindowEvent2 eve) {
				model = eve.getStudent();
				updateView();
				System.out.println(eve.getSource());
			}

//			@Override
//			public void buttonClicked(MyWindowEvent1 ev) {
//				model = ev.getStudent();
//				model.setName(ev.getStudent().getName());
//				model.setId(ev.getStudent().getId());
//				updateView();
//			}
			
		});
	}
	
	private void updateView() {
		view.showStudentDetails(model.getName(), model.getId());
	}
	
}
