package gameCharacters;
public class Player extends GameCharacters {
	String response;
	
	public Player() {
		super();
		response = "";
	}
	public Player(String name, int healthPoints, String response) {
		super(name, healthPoints);
		this.response = response; 
	}
	
	public String getResponse() {
		return this.response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public void loseHealth() {
		this.healthPoints -= 25;
	}
	public void restoreHealth(int x) {
		
		this.healthPoints += x;
	}
	public void getItem() {

	}
	public void retreat() {
		
	}	
}
