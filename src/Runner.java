import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Player player1 = new Player("Tahnee");
        Player player2 = new Player("Digory");

        ArrayList<Player> players = new ArrayList();
        players.add(player1);
        players.add(player2);

        Dealer dealer = new Dealer(players);

        dealer.dealAll();

        for(Player player : players){
            System.out.println(player.getName() + " had the " + player.showCard().getNumberType() + " of " + player.showCard().getSuitType() + "s");
        }
        System.out.println(dealer.whichPlayerHasWon() + " has won.");
    }
}
