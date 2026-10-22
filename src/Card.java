public class Card {
    String name;
    int cost;
    String description;
    boolean upgraded;


String getName(){
    return name;
}

int getCost(){
    return cost;
}

String getDescription(){
    return description;
}

boolean isUpgraded(){
    return upgraded;
}

void upgradeCard(){
    upgraded = true;
    }
void setCost(int newCost){
    cost = newCost;
    }
}