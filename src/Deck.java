import java.util.LinkedList;
import java.util.Random;

public class Deck {

    private LinkedList<Card> cards;

    public Deck() {
        cards = new LinkedList<>();
        Random random = new Random();

        String[] names = {"attack", "defend", "heavy attack", "heal", "special attack"};

        for (int i = 0; i < 10; i++) {
            Card card = new Card();

            card.name = names[random.nextInt(names.length)];
            card.cost = random.nextInt(5) + 1;

            cards.add(card);
        }
    }

    public int getNumberOfCards() {
        int number = 0;

        for (Card card : cards) {
            number++;
        }

        return number;
    }

    public LinkedList<Card> getCards() {
        return cards;
    }
}