package az.edu.turing.module02.part02.lesson03;

import java.util.Comparator;

public class PlayerComparatorByScoreAndName implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player2.score > player1.score ? 1 : player2.score < player1.score
                ? -1
                : player1.name.compareTo(player2.name) != 0
                ? player1.name.compareTo(player2.name)
                : -Long.compare(player1.id, player2.id);
    }
}
