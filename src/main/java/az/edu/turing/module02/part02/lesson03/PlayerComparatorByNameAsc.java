package az.edu.turing.module02.part02.lesson03;

import java.util.Comparator;

public class PlayerComparatorByNameAsc implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player1.name.compareTo(player2.name);
    }
}
