import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> cards = new LinkedList();

    public LinkedList<Card> getCards() {
        return cards;
    }
    public int length() {
        return cards.size();
    }
}
