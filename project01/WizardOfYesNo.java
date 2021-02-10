package project01;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class WizardOfYesNo extends Application {
	
	private static final String[] ANSWER = {
			"Yes.",
			"Go for it!",
			 "Yes, definitely.",
			 "For sure!",
			 "I would say yes.",
			 "Most likely yes.",
			 "No.",
			 "I wouldn't.",
			 "In my opinion, no.",
			 "Definitely not!",
			 "Probably not.",
			 "It is very doubtful."
	};
	
	@Override
	public void start(Stage arg0) throws Exception {
		Random rand = new Random();
		int numberOfAnswers = ANSWER.length;
		int pick = rand.nextInt(numberOfAnswers);
		String answer = ANSWER[pick];
		
		Label label = new Label();
		label.setText(answer);
		
		//This font is set to 
		//Times New Roman font family 
		//FontWeight to NORMAL
		//Size to 32
		Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC , 32);
		label.setFont(font);
		
		// Create the Scene object and add Label object into it.
		// Add width and height for window size
		Scene root = new Scene(label);
		
		//Set Stage to use the Scene object
		arg0.setScene(root);
		arg0.sizeToScene();
		arg0.setResizable(false);
		arg0.setTitle("Wizard of Yes/No");
		arg0.show();
		
	}
	
	public static void main(String [] args) {
		Application.launch(args);
		
	}

}
