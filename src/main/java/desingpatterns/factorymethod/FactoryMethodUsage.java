package desingpatterns.factorymethod;

public class FactoryMethodUsage {
    public static void main(String[] args) {
        String type = args[0];
        GameFactory gameFactory;
        if (type.equals("PC")) {
            gameFactory = new ValorantGameCreator();
        } else if
        (type.equals("Board")) {
            gameFactory = new MonopolyGameCreator();
        } else {
            throw new RuntimeException("unknown game type");
        }
        Game createGame = gameFactory.create();
        System.out.println("create a game " + createGame);
    }
}
