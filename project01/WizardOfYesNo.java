package project01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WizardOfYesNo extends Application {
	
	private static final String ANSWER ="No";

	@Override
	public void start(Stage arg0) throws Exception {
		// Create the Label object
		Label label = new Label("");
		label.setText(ANSWER);
		
		// Create the Scene object and add Label object into it.
		// Add width and height for window size
		Scene root = new Scene(label, 200, 100);
		
		//Set Stage to use the Scene object
		arg0.setScene(root);
		
		arg0.show();
		
	}
	
	public static void main(String [] args) {
		Application.launch(args);
		
	}

}
