import java.util.Scanner;

class BlackJack {

  // variables
  static int balance = 1000; // temp variable
  static int betAmount;
  static double newBal;
  static int playerHandSum;
  static int hitOrStand;
  
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
      int dealerHandSum = dealerCard1 + dealerCard2;

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
    playerHandSum = playerCard1 + playerCard2;
    
    winLose(playerHandSum);
      
    System.out.println("Would you like to hit (1) or stand? (2)");
    hitOrStand = myObj.nextInt();

    // hit or stand
    int playerCard3 = (int)Math.floor(Math.random()*(max-min+1)+min);
    if (hitOrStand == 1) {
    System.out.println("Your current hand is " + playerCard1 + ", " + playerCard2 + ", and " + playerCard3);
    } else if (hitOrStand == 2) {
      standWinLose(playerHandSum, dealerHandSum);
    }

    System.out.println("Would you like to hit (1) or stand? (2)");
    hitOrStand = myObj.nextInt();

    // hit or stand
    int playerCard4 = (int)Math.floor(Math.random()*(max-min+1)+min);
    if (hitOrStand == 1) {
      System.out.println("Your current hand is " + playerCard1 + ", " + playerCard2 + ", " + playerCard3 + ", and " + playerCard4);
    } else if (hitOrStand == 2) {
      standWinLose(playerHandSum, dealerHandSum);
    }

    winLose(playerHandSum);

    System.out.println("Would you like to hit (1) or stand? (2)");
    hitOrStand = myObj.nextInt();

    // hit or stand
    if (hitOrStand == 1) {
      int playerCard5 = (int)Math.floor(Math.random()*(max-min+1)+min);
      System.out.println("Your current hand is " + playerCard1 + ", " + playerCard2 + ", " + playerCard3 + ", " + playerCard4 + ", and " + playerCard5);
    } else if (hitOrStand == 2) {
      standWinLose(playerHandSum, dealerHandSum);
    }

    winLose(playerHandSum);
    
  }
  
  public static void winLose(int playerHandSum) {
    if (playerHandSum == 21) {
      System.out.println("You got a Blackjack! You win!");
      newBal = balance * 1.5;
    } else if (playerHandSum > 21) {
      System.out.println("You busted! You lose!");
      newBal = balance - betAmount;
    }
  }

  public static void standWinLose(int playerHandSum, int dealerHandSum) {
    if (playerHandSum > dealerHandSum) {
      System.out.println("You win!");
      newBal = balance + betAmount;
      System.out.println("Congratulations! Your new balance is " + newBal");   
    } else if (playerHandSum < dealerHandSum) {
      System.out.println("You lose! Hahahahaha have fun being poor");
      newBal = balance - betAmount;
    } else if (playerHandSum == dealerHandSum) {
      System.out.println("You tied! But you still lose hahahaa");
      newBal = balance - betAmount;
    }
  }
}
