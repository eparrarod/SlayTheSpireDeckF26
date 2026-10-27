import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

/**
 * A deck class that holds a list of cards.
 *
 * @author Micale
 */
public class Deck {
    LinkedList<Card> deck = new LinkedList<>();
    HashMap<String, String> cardDict = new HashMap<>();

    /**
     * Constructs a deck with 10 random cards.
     * The names and descriptions of each card is based on the createCardDict method.
     */
    public Deck(){
        createCardDict();
        ArrayList<String> cardNames = new ArrayList<>();
        Random gen = new Random();
        for(String e: cardDict.keySet()){
            cardNames.add(e);
        }
        for (int i = 0; i < 10 ; i++) {
            String cardDictKey = cardNames.get(gen.nextInt(cardNames.size()));
            Card card = new Card();
            card.setName(cardDictKey);
            card.setCost(gen.nextInt(21));
            card.setDescription(cardDict.get(cardDictKey));
            deck.add(card);
        }
    }

    /**
     * Creates a hashmap of strings.
     * The key String represents the name of the card.
     * The value String represents the description of the card.
     */
    public void createCardDict(){
        cardDict.put("Golden Dawn","The Golden Dawn is considered the Kingdom's elite squad, famous for its talented and highly respected members.");
        cardDict.put("Black Bull","The Black Bulls are known as the most troublesome squad, filled with misfits and powerful outcasts. Despite their chaotic reputation, they become one of the kingdom's strongest groups through teamwork and growth.");
        cardDict.put("Silver Eagle","A prestigious squad largely made up of nobles, the Silver Eagles value dignity, tradition, and excellence.");
        cardDict.put("Blue Rose","An all-female squad that traditionally accepts only women, the Blue Rose Knights emphasize elegance, discipline, and strength.");
        cardDict.put("Crimson Lion","The Crimson Lion Kings are passionate, battle-loving knights who value strength and courage above all else.");
        cardDict.put("Green Mantis","The Green Mantis are eccentric and unpredictable fighters who use these strengths to overwhelm their opponents.");
        cardDict.put("Coral Peacock","The Coral Peacocks are a colorful and creative squad whose members often possess unusual magic abilities.");
        cardDict.put("Purple Orca", "The Purple Orcas have a reputation that suffered due to corruption within their ranks. Even so, they remain one of the kingdom's official Magic Knight squads.");
        cardDict.put("Aqua Deer","The Aqua Deer are known for nurturing talented and unconventional mages.");
    }

    /**
     * Returns the current deck of cards.
     * @return the current deck of cards
     */
    public LinkedList<Card> getCards(){
        return deck;
    }
}
