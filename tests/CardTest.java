import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void cardTest(){
        Card newCard = new Card("Cardy", 10, "Card", true);
        assertNotNull(newCard);
        // TODO: complete
    }

}