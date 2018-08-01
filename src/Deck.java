import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        populateDeck();
        shuffle();
    }




    private void populateDeck(){
        SuitType[] allSuitTypes = SuitType.values();
        NumberType[] allNumberTypes = NumberType.values();
        for(SuitType eachSuitType : allSuitTypes) {
            for (NumberType eachNumberType : allNumberTypes) {
                Card card = new Card(eachSuitType, eachNumberType);
                cards.add(card);
            }
        }
    }

    private void shuffle(){
        Collections.shuffle(cards);
    }

    public Card getCard(){
        return cards.remove(0);
    }




}
