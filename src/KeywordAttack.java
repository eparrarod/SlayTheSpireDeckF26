import java.util.LinkedList;

public class KeywordAttack extends Hero {

    private int damagePerCard = 3;

    public int getDamagePerCard(){
        return damagePerCard;
    }

    public int attack(Deck deck){
        int totalDamage = 0;
        LinkedList<Card> cards = deck.getCards();

        for (Card card : cards){
            if (hasAttackName(card)){
                totalDamage += damagePerCard;
            }
        }
        return totalDamage;
    }

    private boolean hasAttackName(Card card) {
        String cardName = card.getName();
        return cardName != null && cardName.toLowerCase().contains("attack");
    }
}
