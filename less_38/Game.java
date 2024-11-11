package less_38;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public int playersCount = 0;
    public static Player player;
    public final int MAX_PLAYERS_COUNT = 6;
    public List<Player> game = new ArrayList<>();

    public Player addPlayer(String playerName) {
        if (playersCount < MAX_PLAYERS_COUNT) {
            System.out.println("Игроков не достаточно." +
                    "В игре сейчас: " + playersCount + " человек.");
            player = new Player(playerName);
            game.add(player);
            playersCount++;
            return player;
        } else {
            System.out.println("Игроков достаточно. В игре: " + playersCount + " человек");
            return null;
        }
    }

    public void gameInfo() {
        for (Player player : game) {
            System.out.println(player.getPlayerName() + ", стамина: " + player.getStamina());
        }
    }

    public void findPlayer(String playerName) {
        for (Player players : game) {
            if (players.getPlayerName().equals(playerName)) {
                System.out.println("Такой игрок есть в команде.");
            }
        }
    }

    public List<Player> getPlayer() {
        return game;
    }

    public void removePlayer(String playerName) {
        if (playerName.equals(player.getPlayerName())) {
            game.remove(player);
            playersCount--;
        }
    }

    @Override
    public String toString() {
        return "Game{" + game;
    }
}
