import java.util.LinkedList;
import java.util.Random;

public class Deck {

    //stores the cards in the deck
    private LinkedList<Card> cards;

    public Deck(){
        cards = new LinkedList<Card>();
        Random random = new Random();

        for(int i=0; i<10; i++){
            Card newCard = new Card(); //makes new card
            newCard.cost = random.nextInt(5) + 1; //adds random cost between 1 and 5
            cards.add(newCard); //adds card to deck
        }
    }

    //returns cards
    public LinkedList<Card> getCards(){
        return cards;
    }
}
