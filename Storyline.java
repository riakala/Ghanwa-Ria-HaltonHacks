import java.util.Scanner;

class Storyline {
  public static void main(String[] args) {
    // variables
    Scanner myObj = new Scanner(System.in); 
    int gameChoice;

    // introduction
    System.out.println("You and James met in kindergarden. You knew everything about him and his life, or so you thought. One day you receive a phone call from him. Not expecting anything different from your usual conversation, you respond the phone with “HEY MAN!”. He frantically responds with: \n\n Hey man. Things aren't going so great. I need your help. And I need it fast.\n\n Not knowing what to say you ask whats up \n\n I got busted. I was caught embezzling money from my company and I need you to help get me out of here. Just of bit of money would mean the world\n\n You decide to comply. After all, he is your kindergarden best friend. You make your way over to the casino hoping to make some money. \n\n\n *at the casino*\n\n You walk into the casino, having no previous gambling experience but your friends fate depends on this. \n\n You see a plethora of games to play. You can choose from the following:\n\n BlackJack (1) or Slot Machine (2)");
    gameChoice = myObj.nextInt();

    if (gameChoice == 1) {
      // take to blackjack
    } else if (gameChoice == 2) {
      // take to slot machine
    }
  }
}
