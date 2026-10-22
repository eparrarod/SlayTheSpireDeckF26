public class Card {
    private String name;
    private int cost;
    private String description;
    private boolean upgraded;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    public boolean isUpgraded() {
        return upgraded;
    }

    public void setUpgraded(boolean upgraded) {
        this.upgraded = upgraded;
    }

    public void setCost(int cost) {
        if(cost >= 0)
            this.cost = cost;
    }
}
