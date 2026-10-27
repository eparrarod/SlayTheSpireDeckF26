public class Card {
    String name;
    int cost;
    String description;
    boolean upgraded;

    Card(String name, int cost, String Description, boolean upgraded) {
        this.name = name;
        this.cost = cost;
        this.description = Description ;
        this.upgraded = upgraded;
    }
    Card(String name, int cost, String Description) {
        this.name = name;
        this.cost = cost;
        this.description = Description ;
        this.upgraded = false;
    }
    Card(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.description = "";
        this.upgraded = false;
    }
    Card() {
        this.name = "";
        this.cost = 0;
        this.description = "";
        this.upgraded = false;
    }

}
