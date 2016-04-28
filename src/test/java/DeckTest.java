import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DeckTest {

  @Test
  public void Deck_instantiatesCorrectly_true() {
    Deck myDeck = new Deck();
    assertEquals(true, myDeck instanceof Deck);
  }

  @Test
  public void getCards_initializesWithCardsList_true() {
    Deck myDeck = new Deck();
    assertEquals(true, myDeck.getCards() instanceof ArrayList);
  }

  @Test
  public void getCards_cardsAreInitializedWithSuitsAndValues_AceOfSpades() {
    Deck myDeck = new Deck();
    Card aceOfSpades = myDeck.getCards().get(0);
    assertEquals("Ace of Spades", aceOfSpades.name());
  }

  @Test
  public void getCards_deckContains52UniqueCards_kingOfDiamonds() {
    Deck myDeck = new Deck();
    Card kingOfDiamonds = myDeck.getCards().get(51);
    assertEquals("King of Diamonds", kingOfDiamonds.name());
  }

  @Test
  public void shuffle_deckShufflesCorrectly_randomCard() {
    Deck myDeck = new Deck();
    Card staticCard = myDeck.getCards().get(0);
    myDeck.shuffle();
    Card randomCard = myDeck.getCards().get(0);
    assertEquals(true, staticCard != randomCard);
  }

  @Test
  public void pullCard_checkThatCorrectCardIsPulledAndArrayShrinks_Card() {
    Deck myDeck = new Deck();
    Card myCard = myDeck.pullCard();
    Deck testDeck = new Deck();
    Card testCard = testDeck.getCards().get(0);
    Card twoOfSpades = myDeck.getCards().get(0);
    assertEquals(testCard.name(), myCard.name());
    assertEquals("2 of Spades", twoOfSpades.name());
  }

  @Test
  public void howManyCardsLeft_returnProperNumberOfRemainingCards_int() {
    Deck myDeck = new Deck();
    myDeck.pullCard();
    myDeck.pullCard();
    assertEquals(myDeck.MAX_SIZE - 2, myDeck.howManyCardsLeft());
  }

  @Test
  public void deckEmpty_deckRunsOut_true() {
    Deck myDeck = new Deck();
     while (myDeck.howManyCardsLeft() > 0) {
       myDeck.pullCard();
     }
     assertEquals(true, myDeck.deckEmpty());
  }

}
