/**
 * This is a class that tests the Card class.
 */
public class CardTester //Main
{

  /**
   * The main method in this class checks the Card operations for consistency.
   * 
   * @param args is not used.
   */
  public static void main(String[] args) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    Card c1 = new Card("King", "Hearts", 10);
    Card c2 = new Card("Ace", "Spades", 1);
    Card c3 = new Card("Jack", "Clubs", 10);

    System.out.println("Card 1 rank: " + c1.rank());
    System.out.println("Card 2 rank: " + c2.rank());
    System.out.println("Card 3 rank: " + c3.rank());

    System.out.print("\n");

    System.out.println("Card 1 suit: " + c1.suit());
    System.out.println("Card 2 suit: " + c2.suit());
    System.out.println("Card 3 suit: " + c3.suit());

    System.out.print("\n");

    System.out.println("Card 1 point value: " + c1.pointValue());
    System.out.println("Card 2 point value: " + c2.pointValue());
    System.out.println("Card 3 point value: " + c3.pointValue());

    System.out.print("\n");

    System.out.println("Card 1 matches Card 2: " + c1.matches(c2));
    System.out.println("Card 2 matches Card 3: " + c2.matches(c3));
    System.out.println("Card 3 matches Card 1: " + c3.matches(c1));

    System.out.print("\n");

    System.out.println("Card 1: " + c1.toString());
    System.out.println("Card 2: " + c2.toString());
    System.out.println("Card 3: " + c3.toString());

  }
}
