import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void getCards() {
        Deck deck = new Deck();
        assertEquals(10, deck.getCards().size());
    }
}