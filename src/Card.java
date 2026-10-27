import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Card {

    private final List<Card> listCards = new LinkedList<>();
    String name;
    int cost;
    String description;
    private boolean upgraded;

    public String getName() {
        return this.name;
    }

    public int getCost(){
        return cost;
    }

    public String getDescription(){
        return this.description;
    }

    public Boolean isUpgraded(){
        return this.upgraded;
    }

    public void setUpgrade(boolean upgraded){
        this.upgraded = upgraded;
    }

    public void setCost(int cost){
        if (cost >= 0){
            this.cost = cost;
        }else{
            System.out.println("Error: cost cannot be negative.");
        }
    }

}


