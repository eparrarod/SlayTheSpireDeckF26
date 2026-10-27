import java.util.Random;

public class AttackFixed extends Hero {

    @Override
    public int attack() {
        Random random = new Random();

        int min = random.nextInt(10) + 1;
        int max = min + random.nextInt(10) + 1;
        int damage = random.nextInt(max - min + 1) + min;

        return damage;
    }
}

//The second has an attack method that does damage
//equal to a random number between a min and max
//(both of which are randomly set each time)