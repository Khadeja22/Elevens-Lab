/**
 * This is a class that tests the Deck class.
 */
public class Main //DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    String[] r1 = {"Ace", "Jack", "King"};
		String[] s1 = {"Hearts", "Spades", "Diamonds"};
		int[] v1 = {1, 11, 13};
	  Deck d1 = new Deck(r1, s1, v1);
	  System.out.println("The first deck's size: " + d1.size());
    System.out.println("The first deck is empty: " + d1.isEmpty());
    System.out.println("The first deck's dealt card is: " + d1.deal());
    System.out.println("\n");
	    
	  String[] r2 = {"7", "9", "Queen"};
	  String[] s2 = {"Hearts", "Clubs", "Spades"};
	  int[] v2 = {7, 9, 12};
	  Deck d2 = new Deck(r2, s2, v2);
    System.out.println("The second deck's size: " + d2.size());
    System.out.println("The second deck's dealt card is: " + d2.deal());
	  System.out.println("The second deck is empty: " + d2.isEmpty());
    System.out.println("\n");
	    
	  String[] r3 = {"4", "8", "3"};
	  String[] s3 = {"Diamonds", "Spades", "Hearts"};
	  int[] v3 = {4, 8, 3};
	  Deck d3 = new Deck(r3, s3, v3);
	  System.out.println("The third deck's size: " + d3.size());
    System.out.println("The third deck's dealt card is: " + d3.deal());
	  System.out.println("The third deck is empty: " + d3.isEmpty());
	}
}
