import java.util.Random;

public class RandomAttack extends Hero {

    private Random random = new Random();

    // damage = random number between a min and a max,
    // and the min and max are picked randomly every attack
    public int attack(Deck deck) {
        int min = random.nextInt(10) + 1;      // min is 1 to 10
        int max = min + random.nextInt(11);    // max is min to min + 10
        return random.nextInt(max - min + 1) + min;
    }
}
