import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {

  @Test
  public void Card_instantiatesCorrectly_true() {
    Card myCard = new Card("Spades", "Ace");
    assertEquals(true, myCard instanceof Card);
  }
}
