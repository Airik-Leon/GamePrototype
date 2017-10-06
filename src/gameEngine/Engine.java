package gameEngine;

import java.util.Scanner;
import gameCharacters.*;
import items.Item; 

public class Engine {
	private Scanner name = new Scanner(System.in);
	private Scanner playerInput = new Scanner(System.in); 
	private Player player = new Player();
	
	public void gameStart() {
		int count = 0; 
		System.out.println("Enter your name, Coder: ");
		player.setName(name.next());
		
		System.out.print("Welcome to Reboot, " +  player.getName() + " You are stranded with broken code and you must answer questions to leave  Reboot."
				+ " There will be people to bother, harass, and maybe...help you if you can stay alive long enough. Here comes the first one!   ");
		System.out.println("\n (The questions will be true or false or open ended.)  \n");
		
		do {
			NPC tempNPC = new NPC();
			
			System.out.print(tempNPC.getName());
			tempNPC.askQuestion();
			player.setResponse(playerInput.next()); 
			if(tempNPC.answerCheck(player.getResponse())) {
				count++;
				if(count == 5) {
					System.out.println("You have braved the perils of Reboot " + player.getName() + ". May your mind find warm sands as you exit Reboot.");
					gameEnd();
				}
				
				Item tempItem= tempNPC.getItem();			
				System.out.println(tempNPC.getName().substring(0, tempNPC.getName().indexOf(':')) + " " + tempItem.getName());				
				if(tempItem.getIncreaseHealth() == 10) {
					
					player.restoreHealth(tempItem.getIncreaseHealth());
					System.out.println("Your health is: " + player.getHealthPoints());
					tempItem = null; 
					tempNPC = null;
					continue;
					
				}
				else if(tempNPC.getItem().getDamage() == 10) {
					player.poisonHealth(tempItem.getDamage());
					System.out.println(tempNPC.getName().substring(0, tempNPC.getName().indexOf(':')) + " has tricked you and your health is now:  "  +player.getHealthPoints());
					tempItem = null; 
					tempNPC = null;
					continue; 
				}
				else {
					System.out.println("You have: " + player.getHealthPoints() + " health points");
					tempItem = null; 
					tempNPC = null;
					continue;
				}
			}
			else {
				player.loseHealth();
				System.out.println("You lost some  health!!");
				System.out.println("You have: " + player.getHealthPoints() + " health points");
				if(player.getHealthPoints() <=0 || count >= 5) {
					System.out.println("You have died a most terrible death due to your lack of knowledge with Java. R.I.P in Reboot. " + player.getName());
					gameEnd();
				}
			}
			tempNPC = null;
		}while(true);
	}
	public void gameEnd() {
		System.exit(0);
	}
}
