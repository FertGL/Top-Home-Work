package less_38;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Player p1 = new Player(random.nextInt(Player.MIN_STAMINA, Player.MAX_STAMINA));
        Player p2 = new Player(random.nextInt(Player.MIN_STAMINA, Player.MAX_STAMINA));
        Player p3 = new Player(random.nextInt(Player.MIN_STAMINA, Player.MAX_STAMINA));
        Player p4 = new Player(random.nextInt(Player.MIN_STAMINA, Player.MAX_STAMINA));

        Player.info();
        System.out.println(p1.getStamina());

        for (int i = p1.stamina; i >= Player.MIN_STAMINA; i--) {
            p1.run();
        }
        Player.info();
    }
}






