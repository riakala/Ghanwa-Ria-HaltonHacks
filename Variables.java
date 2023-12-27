
public class Variables {
	public static int money = 1000;
	public static String red = "\u001B[31m";
	public static String black = "\033[30;49m";
	public static char[] symbols = {'A','B','C','D','$'}; //a = $20, b = $30, c = $40, d = $50, $ = $100 (jackpot)
	public static String screen;
	public static int gameState;
	public static int numExits = 0;
	
	
	//blackjack
	static int balance = money; // temp variable
	static int betAmount;
	static double newBal;
	static int playerHandSum;
	static int hitOrStand;
	static boolean active;
}
