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

}
