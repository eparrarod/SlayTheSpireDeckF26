public class Card {
    String name;
    int cost;
    String description;
    boolean upgraded;

        public String getName() {
            return this.name;
        }

        public int getCost() {
            return this.cost;
        }

        public String getDescription() {
            return this.description;
        }

        public boolean isUpgraded() {
            return this.upgraded;
        }

        public void upgrade() {
            this.upgraded = true;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }