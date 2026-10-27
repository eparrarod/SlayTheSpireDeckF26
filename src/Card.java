public class Card {
    private String name;
    private int cost;
    private String description;
    private boolean upgraded;

    public Card(String name, int cost, String description, Boolean upgraded){
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.upgraded = upgraded;
    }
}
