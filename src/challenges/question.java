
package challenges;

import java.util.Random;

public class Question {

	Random random = new Random();
	
	private String questionText;
	private String answerText;
	
	private boolean answerCheck(String reply) {
		if (this.getAnswerText().contains(reply)) {
			return true;
		}
		return false;
	}
	
	public Question getEasyQuestion() {
		return easy[random.nextInt(easy.length -1)];
	}
	
	public Question getMediumQuestion() {
		return medium[random.nextInt(medium.length -1)];
	}
	
	public Question getHardQuestion() {
		return hard[random.nextInt(hard.length -1)];
	}
	
	public Question(String questionText, String answerText) {
		this.questionText = questionText;
		this.answerText = answerText;
	}
	
	
	private Question[] easy = {
			new Question("True or false: we can compare an int variable with a boolean variable.", "false"),
			new Question("What is the default value of a short?", "0"),
			new Question("What is the extension of an uncompiled Java class?", "java"),
			new Question("What is the default value of a boolean?", "false"),
			new Question("True or false: \"=\" is the assignment operator.", "false"),
			
			
			
	};
	
	private Question[] medium = {
			new Question("What is the size (in bytes) of a float?", "4"),
			new Question("What is the size (in bytes) of a double?", "8"),
			new Question("What is the method used to check if two Strings contain the same value?", "equals"),
			
	};
	
	private Question[] hard = {
			new Question("What is the maximum value of an int?", "2147483647"),
			new Question("What is the size (in bits) of a double?", "64"),
			
	};
	
	public String getQuestionText() {
		return questionText;
	}
	
	
	public String getAnswerText() {
		return answerText;
	}
	
	
}
