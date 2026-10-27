public class AttackWord extends Hero {

    static final int DAMAGE_PER_CARD = 5;

    @Override
    public int attack() {
        int damage = 0;

        for (Card card : deck.getCards()) {
            if (card.getName().toLowerCase().contains("attack")) {
                damage += DAMAGE_PER_CARD;
            }
        }

        return damage;
    }
}

//The third has an attack method that does a fixed
//amount of damage for each card in the Deck with the
//word “attack” in it