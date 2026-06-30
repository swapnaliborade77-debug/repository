package ipl;

import java.util.HashSet;
import java.util.Set;

public class Team implements IPLData {

    private String name;
    private Set<Players> players;

    public Team(String name) {
        this.name = name;
        players = new HashSet<>();
    }


    @Override
    public void addPlayers(Players... pl) {

        for(Players p : pl) {
            players.add(p);
        }
    }


    @Override
    public Set<Players> getPlayers() {
        return players;
    }


    @Override
    public boolean RemovePlayer(String s) {

        for(Players p : players) {

            if(p.getName().equals(s)) {
                players.remove(p);
                return true;
            }
        }

        return false;
    }


    @Override
    public Players Find(String s) {

        for(Players p : players) {

            if(p.getName().equals(s)) {
                return p;
            }
        }

        return null;
    }


    @Override
    public void getInfo() {

        System.out.println("Team : " + name);

        for(Players p : players) {
            System.out.println(p);
        }

        System.out.println();
    }
}