public class DelayedText {
	static String programText;
	
	public static void updateText(String newText) {
		programText = newText;
	}
	
	public static void delayedText() throws InterruptedException {
		int idx = 0;
		for (int i = 0; i < programText.length(); i++) {
			System.out.print("" + programText.charAt(idx));
			Thread.sleep(50);
			idx = ++idx % programText.length();
		}
	}
}
