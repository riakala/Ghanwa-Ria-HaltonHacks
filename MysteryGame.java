import java.util.Scanner;

class MysteryGame {
	static Scanner myObj = new Scanner(System.in);
	static int answer;
	static int newBal;
	static int balance;

	public static void mGame() throws InterruptedException {
		Title.line();
		
		// introduction
		DelayedText.updateText(
				" So you have chosen to play the Mystery Game. The rules are simple. You will be playing trivia. Based on... \n\n\n The Marvel cinematic universe. \n");
		DelayedText.delayedText();
		
		// question one
		System.out.println(
				" Question 1: What is the name of the first Avenger? \n\n 1: The Hulk \n 2: Captain America \n 3: Iron Man \n 4: Thor\n ");
		answer = myObj.nextInt();
		if (answer == 2) {
			System.out.println(" Correct! You have earned one dollar!");
			int newBal = balance + 1;
		} else {
			System.out.println(" Incorrect! You have lost 500 dollars!");
			int newBal = balance - 500;
		}

		// question two
		System.out.println(" Question 2: What is 5+10? \n\n 1: 15 \n 2: 20 \n 3: 25 \n 4: 30\n ");
		answer = myObj.nextInt();
		if (answer == 3) {
			System.out.println(" Correct! You have earned 5000 dollars!");
			int newBal = balance + 5000;
		} else {
			System.out.println(" No you're a loser! You have lost 500 dollars!");
			int newBal = balance - 500;
		}

		// question three
		System.out.println(
				" Question 3: What is the name of the Tony Stark's AI in his suit? \n\n 1: Jarvis \n 2: Friday \n 3: Dum-E \n ");
		answer = myObj.nextInt();
		if (answer == 1) {
			System.out.println(" Correct! You have earned 300 dollars!");
			int newBal = balance - 300;
		} else {
			System.out.println(" Incorrect! You have lost 500 dollars!");
			int newBal = balance - 500;
		}
		
		//question four
		System.out.println(
				" Question 3: Which actor plays Loki? \n\n 1: Benedict Cumberbatch \n 2: Robert Downey Jr. \n 3: Chris Pratt \n 4: Tom Hiddleston\n ");
		answer = myObj.nextInt();
		if (answer == 4) {
			System.out.println(" Correct! You have earned 200 dollars!");
			int newBal = balance - 300;
		} else {
			System.out.println(" Incorrect! You have lost 500 dollars!");
			int newBal = balance - 500;
		}

		// conclusion
		System.out.println(" Congratulations! You have completed Mystery Game . Your final balance is " + newBal
				+ " dollars! That is really unfortunate\r\n for your friend!\n ");
		
		Storyline.story(3);
	}
}
