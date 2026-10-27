public class Card {

    String name;
    int cost;
    String description;
    boolean upgraded;

    public Card() {
        name = "Attack";
        cost = 1;
        description = "Basic attack card";
        upgraded = false;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public boolean isUpgraded() {
        return upgraded;
    }

    public void upgrade() {
        upgraded = true;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}