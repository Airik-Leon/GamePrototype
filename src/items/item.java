package items;

public class Item {
	private  static String names[] = {"gave you a restore health potion", 
			"  is jealous and has  poisoned you because of your masterful java mind.", 
			" decided not to give you anything out of pettiness and distrust", 
			"  is jealous and has  poisoned you because of your masterful java mind.", 
			" decided not to give you anything out of pettiness and distrust", 
			" decided not to give you anything out of pettiness and distrust", 
			" decided not to give you anything out of pettiness and distrust",
			" decided not to give you anything out of pettiness and distrust",
			"  is jealous and has  poisoned you because of your masterful java mind.", 
			" decided not give you anything out of pettiness and distrust" };
	private String name; 
	private  int damage;
	private   int increaseHealth;
	 int randomItem;

	
	public Item() {
		randomItem = (int)(Math.random() * 9);
		if(names[randomItem].equals("gave you a restore health potion")) {
			this.damage = 0 ; 
			this.increaseHealth = 10; 
			this.name = (names[randomItem]);
		}
		else if(names[randomItem].equals("  is jealous and has  poisoned you because of your masterful java mind.")) {
			this.damage = 10;
		    this.increaseHealth = 0;
			this.name = (names[randomItem]);
		}
		else {
			this.name  =  names[randomItem];
		}
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return this.damage;
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
