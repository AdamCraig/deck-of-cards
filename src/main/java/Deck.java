import java.util.ArrayList;

public class Deck {
  private static final String[] SUIT = {"Spades", "Clubs", "Hearts", "Diamonds"};
  private static final String[] VALUE = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  private final int MAX_SIZE = 52;

  private ArrayList<Card> mCards;

  public Deck() {
    mCards = new ArrayList<Card>();

    for (String suit : SUIT) {
      for (String value : VALUE) {
        Card newCard = new Card(suit, value);
        mCards.add(newCard);
      }
    }
  }

  public ArrayList<Card> getCards() {
    return mCards;
  }
  
}
