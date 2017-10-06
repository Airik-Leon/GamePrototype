package gameCharacters;
import challenges.Question;
import items.Item;

public class NPC extends GameCharacters {
	private static String[] names = {"Grimlor", "Frenken", "Bob", "Calvor", "Alessia", "Morgon", "Peach", "Croft", "Divine"};
			
	private Question randomQuestion = new Question(); 
	private Item randomItem = new Item(); 
	
	boolean flag; 
	
	public NPC() {
		do {
		   int randomNumber = (int )(Math.random() * 9) ;
			if(names[randomNumber] == null) {
				flag =true; 
				System.out.println(randomNumber);
			}
			else {
				this.name = names[randomNumber]; 
				flag = false; 
				names[randomNumber] = null; 
			}
		}while(flag); 
	}
	public Item getItem() {
		return this.randomItem; 
	}
	public void askQuestion() {
		System.out.println(randomQuestion.getQuestionText());
	}
	public boolean answerCheck(String reply) {
		if(reply.equals(randomQuestion.getAnswerText())){
			System.out.println("Correct!!!");
			return true; 
		}
		else {
			System.out.println("Wrong!!! you lose some life force ");
		}
		return false;
	}
}