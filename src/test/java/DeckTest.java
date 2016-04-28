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

}
