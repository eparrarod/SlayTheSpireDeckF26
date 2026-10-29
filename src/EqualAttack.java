
public class EqualAttack extends Hero{

    private int damagePerCard = 2;

    public int getDamagePerCard(){
        return damagePerCard;
    }

    //damage = number of cards in the deck * fixed damage amount
    public int equalAttack(Deck deck){
        return deck.length() * damagePerCard;
    }
}
