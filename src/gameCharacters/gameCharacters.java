package gameCharacters;

public abstract class GameCharacters {
	protected String name; 
	protected int healthPoints;
	
	public GameCharacters() {
		name  = "";
		healthPoints =   100;
	}
	public GameCharacters(String name, int healthPoints) {
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
