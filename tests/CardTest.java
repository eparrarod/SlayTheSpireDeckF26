import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void cardTest(){
        Card newCard = new Card();
        assertNotNull(newCard);
        // TODO: complete
    }

    @Test
    public void cardCostTest(){
        Card newCard = new Card();
        assertEquals(0, newCard.getCost());
        newCard.setCost(-5);
        assertEquals(0, newCard.getCost());
        newCard.setCost(2);
        assertEquals(2, newCard.getCost());
        newCard.setCost(4);
        assertEquals(4, newCard.getCost());
    }
}