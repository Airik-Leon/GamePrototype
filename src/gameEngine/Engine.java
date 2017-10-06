package gameEngine;

import java.util.Scanner;
import gameCharacters.*;
import items.Item; 

public class Engine {
	private Scanner name = new Scanner(System.in);
	private Scanner playerInput = new Scanner(System.in); 
	private Player player = new Player();
	private String tempQuestion; 
	
	public void gameStart() {
		int count = 0; 
		System.out.println("Enter your name, Coder: ");
		player.setName(name.next());
		
		System.out.print("Welcome to Reboot, " +  player.getName() + " You are stranded with broken code and you must answer questions to leave  Reboot."
				+ " There will be people to bother, harass, and maybe...help you if you can stay alive long enough. Here comes the first one!   ");
		System.out.println("\n (The questions will be in  multiple choice format. Enter the corresponding number.)  ");
		
		do {
			NPC tempNPC = new NPC();
			
			System.out.print(tempNPC.getName() + ": ");
			tempNPC.askQuestion();
			player.setResponse(playerInput.next()); 
			if(tempNPC.answerCheck(player.getResponse())) {
				count++;
				if(count == 5) {
					System.out.println("You have braved the perils of Reboot. May your mind find warm sands.");
					gameEnd();
				}
				Item tempItem= tempNPC.getItem();			
				System.out.println(tempNPC.getName() + " decided to " + tempItem.getName());

				if(tempItem.getIncreaseHealth() == 10) {
					
					System.out.println( tempItem.getName());
					player.restoreHealth(tempItem.getIncreaseHealth());
					System.out.println("Your health is: " + player.getHealthPoints());
					tempItem = null; 
					tempNPC = null;
					continue;
					
				}
				else if(tempItem.getDamage()==10) {
					tempItem = null; 
					tempNPC = null;
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
				System.out.println("You lose health!!");
				System.out.println("You have: " + player.getHealthPoints() + " health points");
				if(player.getHealthPoints() <=0 || count >= 5) {
					gameEnd();
				}
			}
			tempNPC = null;
		}while(true);
	}
	public void gameEnd() {
		System.out.println("You have died a most terrible death. R.I.P in Reboot. " + player.getName());
		System.exit(0);
	}
}
