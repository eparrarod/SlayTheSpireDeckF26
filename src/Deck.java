import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Deck {

    private LinkedList<Card> cards = new LinkedList<Card>();
    private static final ArrayList<String> names = new ArrayList<String>();
    private static final ArrayList<String> descriptions = new ArrayList<String>();

    public Deck(){
        Random rand = new Random();
        fillNames();
        fillDescriptions();

        for(int i = 0; i < 10; i++){
            cards.add(new Card(names.get(rand.nextInt(names.size())),rand.nextInt(),
                    descriptions.get(rand.nextInt(names.size())), even(rand.nextInt())));
        }
    }

    private boolean even(int number){
        return number % 2 == 0;
    }

    private void fillNames(){
        names.add("Ace");
        names.add("Defense");
        names.add("Spades");
        names.add("Clubs");
        names.add("Hearts");
        names.add("Diamonds");
        names.add("Diomande");
        names.add("Guler");
        names.add("Mbappe");
        names.add("Bellingham");
        names.add("Cucurella");
        names.add("Dumfries");
        names.add("Alexander-Arnold");
        names.add("Konate");
        names.add("Hujisen");
        names.add("Militao");
        names.add("Mendy");
        names.add("Careras");
        names.add("Endrick");
        names.add("Rodrygo");
        names.add("Espi");
        names.add("Silva");
        names.add("Tchouameni");
        names.add("Valverde");
        names.add("Camavinga");
        names.add("Courtios");
        names.add("Palmer");
        names.add("Pedro");
        names.add("Rodgers");
        names.add("Caicedo");
    }

    private void fillDescriptions(){
        descriptions.add("It is up your sleeve");
        descriptions.add("Take your heart");
        descriptions.add("Rest Easy");
        descriptions.add("River in a dry land");
        descriptions.add("Hala Madrid");
        descriptions.add("Go Blues");
        descriptions.add("Up the Chels");
        descriptions.add("Vamos");
        descriptions.add("The important thing is not how long you live... Its what " +
                "you accomplish with your life.");
        descriptions.add("While I live, I want to shine. I want to prove that I exist.");
        descriptions.add("If I could do something really important... That would " +
                "definitely carry on into the future");
        descriptions.add("Take care [Player]. I was lucky to have known you. Though the" +
                "parting hurts... the rest is in your hands");
        descriptions.add("Regret is proof that you've grown. The fact that you" +
                " wish you had already done better mean you are already someone who would");
        descriptions.add("Luck only helps the ones who came prepared");
        descriptions.add("Even if we don't understand each other, that's not a reason" +
                "to reject each other. There are two sides to any argument. Is there one right answer? " +
                "I think not.");
        descriptions.add("Our actions alone are not enough to weave our history. We must also inherit" +
                "the thoughts and feelings of those who went before us, and pass them on to those" +
                "who follow");
        descriptions.add("The Arcana is the means bu which all is revealed... The moment man devoured" +
                "the fruit of knowledge, he sealed his fate... Entrusting his future to the cards," +
                "he clings to a him hope.");
        descriptions.add("A world where everyone can be happy... Is that really such a bad thing?");
        descriptions.add("The meaning of life or death is a personal discovery, not something that can" +
                "be taught. Making one's own decisions is a difficult process, but it is the only way to " +
                "move forward");
    }

    public LinkedList<Card> getCards(){
        return cards;
    }
}
