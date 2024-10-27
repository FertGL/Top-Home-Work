package less_38;

import java.util.Random;

public class Player {
    protected int stamina;
    protected static final int MAX_STAMINA = 10;
    protected static final int MIN_STAMINA = 0;
    protected static int countPlayer = 0;
    static Random random = new Random();

    public Player() {
    }

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayer++;
        countingPlayer();
    }

    public static void countingPlayer() {
        if (countPlayer > 6) {
            countPlayer = 6;
        } else {
            new Player(random.nextInt(MIN_STAMINA, MAX_STAMINA));
        }
    }


    public void run() {
        if (stamina > MIN_STAMINA) {
            System.out.println("Игрок бежит");
            stamina -= 1;
        } else if (stamina == MIN_STAMINA) {
            countPlayer--;
            System.out.println("Игроку нужен отдых, он уходит с поля.");
        }
    }

    public static void info() {
        if (countPlayer < 6 & countPlayer >= 0) {
            System.out.println("На поле ещё есть места, " +
                    "на поле: " + countPlayer + " игроков.");
        } else if (countPlayer == 6) {
            System.out.println("Команды полные, " +
                    "на поле: " + countPlayer + " игроков.");
        }
    }


    public int getStamina() {
        return stamina;
    }
}
