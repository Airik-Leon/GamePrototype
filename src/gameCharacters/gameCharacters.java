package gameCharacters;

public class gameCharacters {
	private String name; 
	private int healthPoints;
	
	public gameCharacters() {
		name  = "";
		healthPoints =   100;
	}
	public gameCharacters(String name, int healthPoints) {
		this.name = name; 
		this.healthPoints = healthPoints; 
	}
	public String getName() {
		return this.name;
	}
	public int getHealthPoints() {
		return this.healthPoints;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
}
