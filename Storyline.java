import java.util.Scanner;

public class Storyline {
	static Scanner s = new Scanner(System.in); 
	 public static void story(int type) throws InterruptedException {
		 if(type == 1) {
			    DelayedText.updateText(" You and James met in kindergarden. "
			    		+ "You knew everything about him and his life, or so you thought.\r\n"
			    		+ " One day you receive a phone call from him. Not expecting anything different from your usual conversation, you respond"
			    		+ "\r\n the phone with “HEY MAN!”. "
			    		+ "He frantically responds with: "
			    		+ "\n\n Hey man. Things aren't going so great. "
			    		+ "I need your help. And I need it fast."
			    		+ "\n\n Not knowing what to say you ask whats up "
			    		+ "\n\n I got busted. I was caught embezzling money from my company and I need you to help get me out of here. Just of bit "
			    		+ "\r\n of money would mean the world\n\n You decide to comply. After all, he is your kindergarden best friend. You make your "
			    		+ "way over to the casino hoping"
			    		+ "\r\n to make some money. \n\n\n *at the casino*\n\n You walk into the casino, having no previous gambling experience but your "
			    		+ "friends fate depends on this. \n\n You see a plethora of games to play. You can choose from the following: \n");
			    DelayedText.delayedText();
			    Title.line();
			    menu1();
		 }
		 
		 if (type == 2) {
			 Title.line();
			 DelayedText.updateText(" So you've begun your attempt to break your friend free from jail. \r\n Everything seems to be going well. Soon your friend"
			 		+ " will be with you again. \r\n *ring ring* \r\n That's suspicious. A phone call from an unknown number. You choose to pick it up. \r\n "
			 		+ "Hello sir. This is the Russian Mafia calling. We know what you're up to. \r\n *call abruptly ends* \r\n You're slightly terrified as you "
			 		+ "know nothing of what your friend has concerned himself with however, \r\n you made it your goal to break him free and you're not stopping "
			 		+ "now. \r\n One last mystery game awaits you to determine his fate. \r\n Would you like to play?\r\n");
			 	DelayedText.delayedText();
			 	Title.line();
			    menu2();
		 }
		 
		 //conclusion
		 if(type == 3) {
			 System.out.println(Variables.black);
			 DelayedText.updateText(" Unfortunately the Russian Mafia has closed in on you.\r\n"
			 		+ " You’ve played all the games you possibly could at the casino and it’s time to see if you were able to save your friends fate.\r\n"
			 		+ " You check your balance and you see $0.\r\n"
			 		+ " You think to yourself how this could be possible after going through all the efforts to play those extremely rigged games.\r\n"
			 		+ " You realize its finished and you’re not going to be able to save James.\r\n"
			 		+ " The Mafia grant you one last phone call to him.\n\n"
			 		+ " James....is that you?\n\n"
			 		+ " Yes. I’ve heard from the mafia that you were unable to save me. I guess that’s what I get for embezzling money.\n\n"
			 		+ " I’m sorry James\n\n"
			 		+ " You tried your hardest I’ll always be gratef -\n\n"
			 		+ " *gunshot fires in the background*\n\n"
			 		+ " JAMES?? JAMES ARE YOU OKAY\n\n"
			 		+ " _______\n\n"
			 		+ " JAMES PLEASE\n\n"
			 		+ " *James responds faintly*\n\n"
			 		+ " I will always love you\n\n"
			 		+ " *silence*\n\n"
			 		+ " NOOOOOOOO\n\n"
			 		+ " *everyone dies and the world blows up*\n\n\n"
			 		+ " THE END.");
			 DelayedText.delayedText();
		 }
	 }
	 
	 public static void menu1() throws InterruptedException{
		 System.out.println(Variables.red);
		 Title.line();
		 DelayedText.updateText("==== Menu ====\r\n");
		 DelayedText.delayedText();
		 
		 System.out.println(Variables.black + "[1] Blackjack\r\n" + "[2] Slot Machine");
		 Variables.gameState = s.nextInt();
		 
		 if(Variables.gameState == 1) {
			 Blackjack.BJ();
		 } else if (Variables.gameState == 2) {
			 SlotMachine.intro();
		 }
	 }
	 
	 public static void menu2() throws InterruptedException {
		 System.out.println(Variables.red);
		 Title.line();
		 DelayedText.updateText("==== Menu ====\r\n");
		 DelayedText.delayedText();
		 
		 System.out.println(Variables.black + "[1] Blackjack\r\n" + "[2] Slot Machine\r\n" + "[3] Mystery Game");
		 Variables.gameState = s.nextInt();
		 
		 if(Variables.gameState == 1) {
			 Blackjack.BJ();
		 } else if (Variables.gameState == 2) {
			 SlotMachine.intro();
		 } else if(Variables.gameState == 3) {
			 MysteryGame.mGame();
		 } 
	 }
}
