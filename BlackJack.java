import java.util.Scanner;

class BlackJack {

  // variables
  static int balance = 1000; // temp variable
  static int betAmount;
  static double newBal;
  static int handSum;
  
  public static void main(String[] args) {

    // variables
    Scanner myObj = new Scanner(System.in); 
   
    //random number generator
    Math.random();
    int min = 1;
    int max = 11;
      // inital player hand
      int playerCard1 = (int)Math.floor(Math.random()*(max-min+1)+min);
      int playerCard2 = (int)Math.floor(Math.random()*(max-min+1)+min);
      // initial dealer hand
      int dealerCard1 = (int)Math.floor(Math.random()*(max-min+1)+min);
      int dealerCard2 = (int)Math.floor(Math.random()*(max-min+1)+min);

    // intro
    System.out.println("Welcome to Blackjack");
    System.out.println("Your current balance is " + balance);
    System.out.println("How much would you like to bet?");
    betAmount = myObj.nextInt();
    System.out.println("Betting $" + betAmount + " I see. You better hope this goes your way.");
    newBal = balance - betAmount;

    // start of the game
    System.out.println("Your cards are " + playerCard1 + " and " + playerCard2);
    System.out.println("The dealer's cards are " + dealerCard1 + " and an unknown card");
    handSum = playerCard1 + playerCard2;
    
    winLose(handSum);
      
    System.out.println("Would you like to hit (1) or stand? (2)");
    int hitOrStand = myObj.nextInt();

    // hit or stand
    int playerCard3 = (int)Math.floor(Math.random()*(max-min+1)+min);
    if (hitOrStand == 1) {
    System.out.println("Your current hand is " + playerCard1 + ", " + playerCard2 + ", and " + playerCard3);
    }

    System.out.println("Would you like to hit (1) or stand? (2)");
    hitOrStand = myObj.nextInt();

    // hit or stand
    int playerCard4 = (int)Math.floor(Math.random()*(max-min+1)+min);
    if (hitOrStand == 1) {
      System.out.println("Your current hand is " + playerCard1 + ", " + playerCard2 + ", " + playerCard3 + ", and " + playerCard4);
    }

    winLose(handSum);

    System.out.println("Would you like to hit (1) or stand? (2)");
    hitOrStand = myObj.nextInt();

    // hit or stand
    if (hitOrStand == 1) {
      int playerCard5 = (int)Math.floor(Math.random()*(max-min+1)+min);
      System.out.println("Your current hand is " + playerCard1 + ", " + playerCard2 + ", " + playerCard3 + ", " + playerCard4 + ", and " + playerCard5);
    }  

    winLose(handSum);
    
  }
  
  public static void winLose(int handSum) {
    if (handSum == 21) {
      System.out.println("You got a Blackjack! You win!");
      newBal = balance * 1.5;
    } else if (handSum > 21) {
      System.out.println("You busted! You lose!");
      newBal = balance - betAmount;
    }
  }
}
