import java.util.Scanner;

class MysteryGameOne {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    int answer;
    int newBal;
    int balance;

    // introduction
    System.out.println("So you have chosen to play the Mystery Game One. The rules are simple. You will be playing trivia. Based on \n\n\n\n\n The Marvel cinematic universe.")

    // question one
    System.out.println("Question 1: What is the name of the first Avenger?" \n\n 1: The Hulk \n 2: Captain America \n 3: Iron Man \n 4: Thor");
    answer = myObj.nextInt();
    if (answer == 2) {
      System.out.println("Correct! You have earned one dollar!");
      int newBal = balance + 1;
    } else {
      System.out.println("Incorrect! You have lost 500 dollars!");
      int newBal = balance - 500;
    }

    // question two
    System.out.println("Question 2: What is 5+10? \n\n 1: 15 \n 2: 20 \n 3: 25 \n 4: 30");
    answer = myObj.nextInt();
    if (answer == 3) {
      System.out.println("Correct! You have earned 5000 dollars!");
      int newBal = balance + 5000;
    } else {
      System.out.println("No you're a loser! You have lost 500 dollars!");
      int newBal = balance - 500;
  }

    // question three
    System.out.println("Question 3: What is the name of the first Avenger? \n\n 1: The Hulk \n 2: Captain America \n 3: Iron Man \n 4: Ria Kala");
    answer = myObj.nextInt();
    if (answer == 2) {
      System.out.println("Correct! You have lost 300 dollars!");
      int newBal = balance - 300;
    } else {
      System.out.println("Incorrect! You have lost 500 dollars!");
      int newBal = balance - 500;
    }
}
