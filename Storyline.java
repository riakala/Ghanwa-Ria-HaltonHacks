import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
	static Scanner s = new Scanner(System.in);
	public static void intro() throws InterruptedException {
		Title.line();
		System.out.println(Variables.black);
		DelayedText.updateText(" Welcome to the Slot Machine!\r\n");
		DelayedText.delayedText();
		DelayedText.updateText(" You need $20 to play. \r\nYou must match all three symbols to win.\n");
		DelayedText.delayedText();
		
		DelayedText.updateText("\n You currently have $" + Variables.money + "\n \r\n");
		DelayedText.delayedText();
		
		determineState();
	}
	
	public static void determineState() throws InterruptedException {
		if(Variables.money > 20) {
			Title.line();
			System.out.println(Variables.black);
			DelayedText.updateText("[1] to spin \n[2] to exit\n");
			DelayedText.delayedText();
			Variables.gameState = s.nextInt();
			
			if(Variables.gameState == 1){
				spin();
			}
			
			if(Variables.gameState == 2) {
				Variables.numExits++;
				if(Variables.numExits == 2) {
					Storyline.story(2);
					Storyline.menu2();
				} else if (Variables.numExits > 2) {
					Storyline.menu2();
				} else if (Variables.numExits < 2) {
					Storyline.menu1();
				}
			}
		} else if (Variables.money < 20) {
			System.out.println(Variables.black);
			DelayedText.updateText(" You have insufficient funds \n[E] to exit\n");
			DelayedText.delayedText();

		}
		
	}
	public static void spin() throws InterruptedException {
		Variables.money = Variables.money - 20;
		
		char[] slots = new char[3];
		Random r = new Random();
		
		//theoretical spin
		for(int i = 0; i < 3; i++) {
			slots[i] = Variables.symbols[r.nextInt(Variables.symbols.length)];
		}
		
		//display the slots
		System.out.println(Variables.red+"------------    ------------    ------------\r\n"
						 + "|          |    |          |    |          |\r\n"
						 + "|    " +Variables.black + slots[0] +Variables.red+ "     |    |    "+ Variables.black + slots[1]+ Variables.red + "     |    " + "|    " + Variables.black + slots[2] + Variables.red + "     |\r\n"
						 + "|          |    |          |    |          |\r\n"
						 + "------------    ------------    ------------\n");
		
		//determine how much you won
		if(slots[0] == slots[1] && slots[1] == slots[2]) {
			int amountWin = determineCash(slots[0]);
			Variables.money += amountWin;
			Title.line();
			System.out.println(Variables.black);
			DelayedText.updateText(" Congratulations!\r\n" + "You won $" + amountWin);
			DelayedText.delayedText();
		} else {
			System.out.println(Variables.black);
			DelayedText.updateText(" Ha! Ha! You Lose!\r\n");
			DelayedText.delayedText();
			DelayedText.updateText(" your new balance is " + Variables.money +"\r\n");
			DelayedText.delayedText();
		}
		
		//change game state
		determineState();
	}
	
	public static int determineCash(char s) {
		//assigns money value for symbols
		if(s == 'A') {
			return 20;
		} else if (s == 'B') {
			return 30;
		} else if (s == 'C') {
			return 40;
		} else if (s == 'D') {
			return 50;
		} else if (s == '$') {
			return 100;
		} else {
			return 0;
		}
	}
}
