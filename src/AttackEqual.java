public class AttackEqual extends Hero {

    static final int DAMAGE_PER_CARD = 5;

    public int attack() {
        return deck.getNumberOfCards() * DAMAGE_PER_CARD;
    }
}

//The first has an attack method that does damage equal
//to # cards in deck * a fixed damage amount