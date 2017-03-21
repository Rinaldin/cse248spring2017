package p1;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowView {
	private Label nameLbl;
	private Label idLbl;
	private Label nameLblOut;
	private Label idLblOut;

	private TextField nameField;
	private TextField idField;
	private TextField nameFieldOut;
	private TextField idFieldOut;

	private Button okBtn1;
	private Button okBtn2;

	private HBox paneTop;
	private HBox paneMiddle;
	private HBox paneBottom;
	private VBox root;

	private String[] info = new String[2];
	
	private MyWindowListener windowListener;

	public WindowView(Stage stage) {
		// paneTop
		idLbl = new Label("ID: ");
		nameLbl = new Label("Name: ");
		idField = new TextField();
		nameField = new TextField();
		paneTop = new HBox(20);
		paneTop.setAlignment(Pos.CENTER);
		paneTop.getChildren().addAll(nameLbl, nameField, idLbl, idField);

		// paneMiddle
		okBtn1 = new Button("OK1");
		okBtn2 = new Button("OK2");
		
		paneMiddle = new HBox(20);
		paneMiddle.setAlignment(Pos.CENTER);
		paneMiddle.getChildren().addAll(okBtn1, okBtn2);

		okBtn1.setOnAction(e -> {
			info = getStudentDetails();
			MyWindowEvent1 ev = new MyWindowEvent1(this, new Student(info[0], info[1]));
			if(windowListener != null) {
				windowListener.buttonClicked(ev);
			}
		});
		
		okBtn2.setOnAction( e -> {
			info = getStudentDetails();
			MyWindowEvent2 eve = new MyWindowEvent2(this, new Student("John", "Doe"));
			if(windowListener != null) {
				windowListener.buttonClicked(eve);
			}
		});
		
		// paneBottom
		nameLblOut = new Label("Name: ");
		idLblOut = new Label("ID: ");
		nameFieldOut = new TextField();
		idFieldOut = new TextField();
		paneBottom = new HBox(20);
		paneBottom.setAlignment(Pos.CENTER);
		paneBottom.getChildren().addAll(nameLblOut, nameFieldOut, idLblOut, idFieldOut);

		// root pane
		root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(paneTop, paneMiddle, paneBottom);

		// scene and stage
		Scene scene = new Scene(root, 600, 250);
		stage.setScene(scene);
		stage.show();
	}

	public String[] getStudentDetails() {
		info[0] = nameField.getText();
		info[1] = idField.getText();
		nameField.clear();
		idField.clear();
		return info;
	}

	public void showStudentDetails(String n, String id) {
		nameFieldOut.setText(n);
		idFieldOut.setText(id);
	}
	
	public void setWindowListener(MyWindowListener windowListener) {
		this.windowListener = windowListener;
	}

}
