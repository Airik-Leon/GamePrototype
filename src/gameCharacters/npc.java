package gameCharacters;
import challenges.Question;
import items.Item;

public class NPC extends GameCharacters {
	private static String[] names = {"Grimlor: I am Grimlor lord of HavenCraft and I welcome you  to partake in a challenge. ", 
			"Frenken: born a crafter, andold timey sexy man. How are you? NO....don't answer I don't really care,  lets go!", 
			"Bob: I am just a regular guy to bore you. ", 
			"Calvor: See this sword? I could cut you in two, but, l would rather challenge you with a question.",
			"Alessia: I am the Queen. To get past you must answer my riddle", 
			"Morgon: Hmm, turning you into a toad would be much easier, sigh...", 
			"Peach: I don't nort normally prevent people from moving forward, but roles can change.", 
			"Croft: Challenges? I would be done already ,but, it must be hard being stupid. ", 
			"Divine: Looking for the end? It is no where in sight"};
	private Question randomQuestion = new Question(); 
	private Item randomItem = new Item(); 
	
	boolean flag; 
	
	public NPC() {
		do {
		   int randomNumber = (int )(Math.random() * 8) ;
			if(names[randomNumber] == null) {
				flag =true; 
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
		System.out.println("\n"+randomQuestion.getQuestionText());
	}
	public boolean answerCheck(String reply) {
		if(reply.equals(randomQuestion.getAnswerText())){
			System.out.println("Correct!!!");
			return true; 
		}
		else {
			System.out.println("Wrong!!! you lose some life force coder ");
		}
		return false;
	}
}