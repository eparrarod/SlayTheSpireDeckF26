import java.util.LinkedList;
import java.util.Random;
import java.util.random.*;

public class Deck {
    
    private LinkedList<Card> cards;

    public Deck()
{
    this.cards = new LinkedList<>();
    Random rand = new Random();

    String[] names = {"attack", "Block", "KAMEHAMEHA", "Kamekaze"};
    String[] description = {"Deals 3 damage", "Succesfully blocked", "YOU CHARGE UP YOUR ULTIMATE AND GIVE IT YOUR ALL 100 DAMAGE", "You blow yourself up"};

    for(int i = 0; i < 10; i++){

        Card EmptyCard = new Card();

        EmptyCard.name = names[rand.nextInt(names.length)];
        EmptyCard.description = description[rand.nextInt(description.length)];
        EmptyCard.cost = rand.nextInt();
        EmptyCard.upgraded = rand.nextBoolean();

        this.cards.add(EmptyCard);
    }
}

public LinkedList<Card> getCards()
{
    return this.cards;
}

}
