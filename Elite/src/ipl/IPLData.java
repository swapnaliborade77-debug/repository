package ipl;

import java.util.Set;

public interface IPLData {

    void addPlayers(Players... pl);

    Set<Players> getPlayers();

    boolean RemovePlayer(String s);

    void getInfo();

    Players Find(String s);
}