package less_38;

import java.util.Random;

public class Player extends Game{
    public int stamina;
    protected static final int MAX_STAMINA = 10;
    protected static final int MIN_STAMINA = 0;
    static Random random = new Random();
    protected String playerName;


    public Player(String playerName) {
        this.playerName = playerName;
        this.stamina = random.nextInt(5, MAX_STAMINA);
    }

    public void run() {
        if (getStamina() > MIN_STAMINA) {
            System.out.println(getPlayerName() + " бежит.");
            stamina--;
            run();
        } else {
            System.out.println(getPlayerName() + " устал, уходит с поля");
            removePlayer(playerName);
        }
    }


    public int getStamina() {
        return stamina;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Игрок: " + getPlayerName() + ", стамина: " + getStamina();
    }

}
