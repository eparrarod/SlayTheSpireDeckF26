import java.util.LinkedList;
import java.util.Random;

public class Deck {
    LinkedList<Card> cards = new LinkedList<Card>();

    public Deck() {
        for(int i = 0; i < 10; i++) {
            Card card1 = new Card();
            cards.add(card1);
        }
    }

    public LinkedList<Card> getCards() { return cards; }

    public Card getRandomCard() {
        Random rand = new Random();
        int cardIndex = rand.nextInt(cards.size());
        return cards.get(cardIndex);
    }

    public Card getOneCard() {
        Random rand = new Random();
        int cardIndex = rand.nextInt(cards.size());
        return cards.get(cardIndex);
    }
}
