package desingpatterns.factorymethod;

public class MonopolyGameCreator implements GameFactory{
    @Override
    public Game create() {
        return new BoardGame("Monopoly","Family",4);
    }
}
