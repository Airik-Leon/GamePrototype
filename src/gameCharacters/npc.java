package gameCharacters;
import challenges.question;
import items.item;

public class npc extends gameCharacters {
	private static String[] names = {"Grimlor", "Frenken", "Bob", "Calvor", "Alessia", "Morgon", "Peach", "Croft", "Divine"};
	private static int randomNumber = (int )Math.random() *9 ;
	
	question randomQuestion;
	
	public npc() {
		super(names[randomNumber], 100);
		this.randomQuestion = null;
	}
	
	public void giveItem() {
		
	}
	public void askQuestion() {
		System.out.println(randomQuestion);
	}
}
