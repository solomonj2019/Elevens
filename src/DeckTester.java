/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		
		System.out.println("---- Deck ONE Test ----");
		
		String[] ranks1 = {"one","two","three","queen","king"};
		String[] suits1 = {"blue", "green", "red"};
		int[] points1 = {1,2,3,10,11};
		Deck one = new Deck(ranks1, suits1, points1);
		System.out.println("Deck 1 toSring: ");
		System.out.println("Deck1 is Empty: " + one.isEmpty());
		System.out.println(one);
		
		System.out.println("/////////////////////////////////////\n");
		
		System.out.println("--- DECK TWO TEST ----");

		String[] ranks2 = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King"};
		String[] suits2 = {" Spades", " Hearts", " Clubs", " Diamonds"};
		int[] points2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck two = new Deck (ranks2, suits2, points2);
		
		System.out.println("Deck 2 toSring: ");
		System.out.println("Deck2 is Empty: " + two.isEmpty());
		System.out.println(two);
		
	
		System.out.println("/////////////////////////////////////\n");
		System.out.println("----DECK THREE TEST----");
		Deck three = new Deck(ranks2, suits2, points2);
		System.out.println("Deck3 is Empty: " + three.isEmpty());
		System.out.println("\n");
		System.out.println("__Dealing Cards__");
		System.out.println("\n");
		while(!three.isEmpty())
			System.out.println(three.deal());
		System.out.println("Deck 3 isEmpty: " + three.isEmpty());
	
		}
	}


