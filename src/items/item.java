package items;

public class Item {
	private  String names[] = {"Gave you a restore health potion", "Not to give you anything", "Not to give you anything", "hurt you with a Lose Health potion", "Not to give you anything", "Not to give you anything","Not to give you anything", "Not to give you anything", "hurt you with a lose Health", "Not give you anything" };
	private String name; 
	private int damage; 
	private int increaseHealth; 
	private  int randomItem = (int) (Math.random() * 9); 
	
	public Item() {
		this.setName(names[randomItem]);
		if(names[randomItem].equals("Gave you a restore health potion")) {
			this.damage = 0 ; 
			increaseHealth = 10; 
		}
		else if(names[randomItem].equals("hurt you with a lose Health")) {
			damage = 10; 
			increaseHealth = 0; 
		}
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getIncreaseHealth() {
		return increaseHealth;
	}
	public void setIncreaseHealth(int increaseHealth) {
		this.increaseHealth = increaseHealth;
	}
	
}
