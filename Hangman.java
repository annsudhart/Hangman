import java.util.Scanner;

public class Hangman {

	private static String EASY_STRING = "easy";
	private static String MED_STRING = "medium";
	private static String HARD_STRING = "hard";
	private static String[] DIFFICULTY_OPTIONS = { EASY_STRING, MED_STRING, HARD_STRING };
	
	private static String WELCOME_MESSAGE = "Welcome to Hangman!";
	private static String CHOOSE_DIFFICULTY = "Choose a difficulty: [e]asy [m]edium [h]ard";
	
	private String ILLEGAL_DIFFICULTY_EXCEPTION = "Error: Illegal difficulty inputted. Inputs: [e]asy [m]edium [h]ard";
	
	private String difficulty = MED_STRING;
	private String hangmanWord = "";
	
	
	public Hangman(String difficulty) {
		this.difficulty = difficulty;
		pickWord();
	}
	
	private void pickWord() {
		// if easy, choose from list of  <= 6 words
		// if medium, choose from list of 6 <= x <= 12
		// if hard, choose from list of x >= 12
		int minLength;
		int maxLength;
		switch(difficulty) {
			case EASY_STRING:
				minLength = -1;
				maxLength = 6;
				break;
			case MED_STRING:
				minLength = 6;
				maxLength = 12;
				break;
			case HARD_STRING:
				minLength = 12;
				maxLength = -1;
				break;
			default:
				System.out.println(ILLEGAL_DIFFICULTY_EXCEPTION);
		}
		// TODO: parse enable1.txt for a word
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
