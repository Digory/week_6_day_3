import java.util.ArrayList;

public class Dealer {
    private Deck theDeck;
    private ArrayList<Player> players;

    public Dealer(ArrayList<Player> players){
        theDeck = new Deck();
        this.players = players;
    }

    public void dealAll(){
        for(Player eachPlayer : players){
            dealToPlayer(eachPlayer);
        }
    }

    private void dealToPlayer(Player player){
        Card theCard = theDeck.getCard();
        player.receiveCard(theCard);
    }


    public String whichPlayerHasWon(){
        Card player1Card = players.get(0).showCard();
        Card player2Card = players.get(1).showCard();
        Card bestCard = whichCardIsBetter(player1Card, player2Card);

        for(Player player : players){
            if(player.showCard() == bestCard){
                return player.getName();
            }
        }
        return null;
    }

    public Card whichCardIsBetter(Card card1, Card card2){
        int card1Ranking = card1.getNumberType().getRanking();
        int card2Ranking = card2.getNumberType().getRanking();
        if(card1Ranking > card2Ranking){
            return card1;
        }
        else{
            return card2;
        }
    }


}
