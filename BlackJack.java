import java.util.Scanner;
public class Blackjack {
	static Scanner myObj = new Scanner(System.in); 
	
	public static void BJ() throws InterruptedException {


	    //random number generator
	    Math.random();
	    int min = 1;
	    int max = 11;
	      // player hand
	      int playerCard1 = (int)Math.floor(Math.random()*(max-min+1)+min);
	      int playerCard2 = (int)Math.floor(Math.random()*(max-min+1)+min);
	      int playerCard3 = (int)Math.floor(Math.random()*(max-min+1)+min);
	      int playerCard4 = (int)Math.floor(Math.random()*(max-min+1)+min);
	      int playerCard5 = (int)Math.floor(Math.random()*(max-min+1)+min);
	      // initial dealer hand
	      int dealerCard1 = (int)Math.floor(Math.random()*(max-min+1)+min);
	      int dealerCard2 = (int)Math.floor(Math.random()*(max-min+1)+min);
	      int dealerHandSum = dealerCard1 + dealerCard2;

	    // intro
	      DelayedText.updateText(" Welcome to Blackjack\r\n Your current balance is " + Variables.balance
				  				+"\r\n How much would you like to bet? ");
	      DelayedText.delayedText();

	      Variables.betAmount = myObj.nextInt();

	      DelayedText.updateText(" Betting $" + Variables.betAmount + " I see. You better hope this goes your way.");
	      DelayedText.delayedText();

		    
	    // start of the game
	    Variables.active = true;
	    System.out.println("\r\n Your cards are " + playerCard1 + " and " + playerCard2);
	    System.out.println(" The dealer's cards are " + dealerCard1 + " and an unknown card");
	    Variables.playerHandSum = playerCard1 + playerCard2;
	    
	    winLose(Variables.playerHandSum);
	    
	    if (Variables.active == true) {
	    	System.out.println(" Would you like to hit (1) or stand? (2)");
	    	Variables.hitOrStand = myObj.nextInt();
	 
	    	if (Variables.hitOrStand == 1) {
	    		System.out.println(" Your current hand is " + playerCard1 + ", " + playerCard2 + ", and " + playerCard3);
	    		Variables.playerHandSum = playerCard1 + playerCard2 + playerCard3;
	    	} else if (Variables.hitOrStand == 2) {
	    		standWinLose(Variables.playerHandSum, dealerHandSum);
	    		Variables.active = false;
	    	}
	    }
	    
	    // winLose(Variables.playerHandSum);

	    if (Variables.active == true) {
	    	winLose(Variables.playerHandSum);
	    	System.out.println(" Would you like to hit (1) or stand? (2)");
	    	Variables.hitOrStand = myObj.nextInt();
	    
	    	if (Variables.hitOrStand == 1) {
	    		System.out.println(" Your current hand is " + playerCard1 + ", " + playerCard2 + ", " + playerCard3 + ", and " + playerCard4);
	    		Variables.playerHandSum = playerCard1 + playerCard2 + playerCard3 + playerCard4;
	    	} else if (Variables.hitOrStand == 2) {
	    		standWinLose(Variables.playerHandSum, dealerHandSum);
	    		Variables.active = false;
	    	}
	    }
	    
	   //winLose(Variables.playerHandSum);
	    
	    if (Variables.active == true) {
	 	    winLose(Variables.playerHandSum);
	    	System.out.println(" Would you like to hit (1) or stand? (2)");
	    	Variables.hitOrStand = myObj.nextInt();

	    	if (Variables.hitOrStand == 1) {
	    		System.out.println(" Your current hand is " + playerCard1 + ", " + playerCard2 + ", " + playerCard3 + ", " + playerCard4 + ", and " + playerCard5);
	    		Variables.playerHandSum = playerCard1 + playerCard2 + playerCard3 + playerCard4 + playerCard5;
	    	} else if (Variables.hitOrStand == 2) {
	    		standWinLose(Variables.playerHandSum, dealerHandSum);
	    		Variables.active = false;
	    	}
	    	winLose(Variables.playerHandSum);
	    }
	    
	   // winLose(Variables.playerHandSum);
	  }
	  
	  public static void winLose(int playerHandSum) throws InterruptedException {
		  if (playerHandSum == 21) {
		      System.out.println(" You got a Blackjack! You win!");
		      Variables.newBal = Variables.balance * 1.5;
		      Variables.active = false;
		      System.out.println(" Your new balance is " + Variables.newBal);
		      determineState();
		      
		    } else if (playerHandSum > 21) {
		      System.out.println(" You busted! You lose! Hahhaahahah Poor.");
		      Variables.newBal = Variables.balance - Variables.betAmount;
		      Variables.active = false;
		      System.out.println(" YOUR NEW BROKE BALANCE IS " + Variables.newBal);
		      determineState();
		    }
	  }
	 

	  public static void standWinLose(int playerHandSum, int dealerHandSum) throws InterruptedException {
		   if (playerHandSum > dealerHandSum) {
		      System.out.println(" You win!");
		      Variables.newBal = Variables.balance + Variables.betAmount;
		      System.out.println(" Congratulations! Your new balance is " + Variables.newBal);
		      Variables.active = false;
		      determineState();
		    } else if (playerHandSum < dealerHandSum) {
		      System.out.println(" You lose! Hahahahaha have fun being poor");
		      Variables.newBal = Variables.balance - Variables.betAmount;
		      Variables.active = false;
		      System.out.println(" YOUR NEW BROKE BALANCE IS " + Variables.newBal);
		      determineState();
		    } else if (playerHandSum == dealerHandSum) {
		      System.out.println(" You tied! But you still lose hahahaa");
		      Variables.newBal = Variables.balance - Variables.betAmount;
		      Variables.active = false;
		      System.out.println(" YOUR NEW BROKE BALANCE IS " + Variables.newBal);
		      determineState();
		    }
	  }
	  
	  
	  public static void determineState() throws InterruptedException {
			if(Variables.balance > 0) {
				Title.line();
				System.out.println(Variables.black);
				DelayedText.updateText("[1] to play again \n[2] to exit\n");
				DelayedText.delayedText();
				Variables.gameState = myObj.nextInt();
				
				if(Variables.gameState == 1){
					BJ();
				} else if(Variables.gameState == 2) {
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
			} else if (Variables.money < 0) {
				System.out.println(Variables.black);
				DelayedText.updateText(" You have insufficient funds \n[2] to exit\n");
				DelayedText.delayedText();

			}
			Variables.active = false;
			
		}

}
