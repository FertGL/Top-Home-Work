package less_38;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Player p1 = game1.addPlayer("Gleb");
        Player p2 = game1.addPlayer("Ivan");
        Player p3 = game1.addPlayer("Denis");
        Player p4 = game1.addPlayer("Oleg");
        Player p5 = game1.addPlayer("Sasha");
        Player p6 = game1.addPlayer("Grisha");
        Player p7 = game1.addPlayer("Sergey");

        game1.gameInfo();
        game1.findPlayer("Gleb");
        p1.run();
        game1.gameInfo();
    }
}






