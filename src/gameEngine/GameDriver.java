package gameEngine;

import gameCharacters.npc;
import items.item;

public class GameDriver {

	public static void main(String[] args) {
		npc  x = new npc(); 
		item y = x.giveItem(); 
		
		System.out.println(x.getName() + "  decided:  " + y.getName());
		
		
		
		

	}

}
