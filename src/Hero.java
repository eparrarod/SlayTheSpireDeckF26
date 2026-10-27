public abstract class Hero {

    String name;
    protected Deck deck;

    public Hero() {
        deck = new Deck();
    }

    public abstract int attack();

}