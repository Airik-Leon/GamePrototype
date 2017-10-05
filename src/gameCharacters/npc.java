package gameCharacters;
import challenges.question;
import items.item;

public class npc extends gameCharacters {
	private static String[] names = {"Grimlor", "Frenken", "Bob", "Calvor", "Alessia", "Morgon", "Peach", "Croft", "Divine"};
	private static int randomNumber = (int )(Math.random() * 9) ;
	private item randomItem = new item(); 
	private question randomQuestion =  new question(); 
	
	public npc() {
		super(names[randomNumber], 100);
	}
	public item giveItem() {
		return randomItem; 
	}
	public void askQuestion() {
		System.out.println(randomQuestion);
	}
}
