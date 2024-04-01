package desingpatterns.factorymethod;

public interface Game {
    String getName();
    String getType();
    int getMinNrOfPlayers();
    int getMaxNrOfPlayers();
    boolean canBePlayedRemotely();
}
