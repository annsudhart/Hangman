import java.util.Scanner;

public class Hangman {

	private static String EASY_STRING = "easy";
	private static String MED_STRING = "medium";
	private static String HARD_STRING = "hard";
	private static String[] DIFFICULTY_OPTIONS = { EASY_STRING, MED_STRING, HARD_STRING };
	
	private static String WELCOME_MESSAGE = "Welcome to Hangman!";
	private static String CHOOSE_DIFFICULTY = "Choose a difficulty: [e]asy [m]edium [h]ard";
	
	private String difficulty = MED_STRING;
	
	
	public Hangman(String difficulty) {
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String difficulty = MED_STRING;
		System.out.println(WELCOME_MESSAGE);
		// TODO: double check legal string input
		if (args.length == 1) {
			difficulty = scan.next(CHOOSE_DIFFICULTY); 
		} else {
			difficulty = args[1];
		}
		Hangman game = new Hangman(difficulty);
	}
	
}
