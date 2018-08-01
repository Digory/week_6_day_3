import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        hand = new ArrayList<>();
    }

    public void receiveCard(Card card){
        hand.add(card);
    }

    public String getName(){
        return this.name;
    }

    public Card showCard(){
        return hand.get(0);
    }


}
