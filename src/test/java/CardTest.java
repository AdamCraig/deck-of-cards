import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {

  @Test
  public void Card_instantiatesCorrectly_true() {
    Card myCard = new Card("Spades", "Ace");
    assertEquals(true, myCard instanceof Card);
  }

  @Test
  public void getSuitAndGetValue_returnsSuitAndValueCorrectly_String() {
    Card myCard = new Card("Hearts", "Queen");
    String testSuit = myCard.getSuit();
    String testValue = myCard.getValue();
    assertEquals("Hearts", testSuit);
    assertEquals("Queen", testValue);
  }

  @Test
  public void name_returnsAFormattedNameForCard_JackOfDiamonds() {
    Card myCard = new Card("Diamonds", "Jack");
    assertEquals("Jack of Diamonds", myCard.name());
  }
}
