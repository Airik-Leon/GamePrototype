
package challenges;

import java.util.Random;

public class Question {
	Random random = new Random();
	private static String []easy = { 
					"   True or false: we can compare an int variable with a boolean variable.",  
					"   What is the default value of a short?", "What is the extension of an uncompiled Java class?",
					"   What is the default value of a boolean?", 
					"   True or false: \"==\" is the assignment operator.", 
					"	True or false: Fields defined as static are instance fields.",
					"	True or false: the + unary operator makes numbers positive. ", 
					"	True or false: \"brake\" is a keyword reserved by Java. " ,
					"	True or false: \"assert\" is a keyword reserved by Java. ",
					"	What is the result of 10 % 3 ?",
					"	If int a = 0, what is the value of b where b = a++?"
					}; 
	private String[] easyAnswers = {"false", "0", "java", "false", "false","false", "false", "false","true","1", "0"}; 
	private String question; 
	private String easyAnswer; 	
	String check; 
	
	public Question() {
		boolean flag = false; 
		do {
			int randomNumber = random.nextInt(5 ); 
			this.question = easy[randomNumber] ; 
			this.easyAnswer = easyAnswers[randomNumber]; 
			
			if(easy[randomNumber] == null) {
				
				flag = true; 
			}
			else {
				flag = false; 
				easy[randomNumber] = null; 
				easyAnswers[randomNumber] = null; 
			}
		}while(flag); 

		
	}
	public String getEasyQuestion() {
		return this.question; 
	}
	
	public String getQuestionText() {
		return this.question;
	}
	
	public String getAnswerText() {
		return this.easyAnswer; 
	}
	public  boolean allQuestionsAnswered() {
		
		return false; 
	}	
}
