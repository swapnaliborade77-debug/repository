package ipl;

public class Team {

    private String teamName;
    private Player[] players;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void displayPlayers() {

        System.out.println("\nPlayers of " + teamName);

        if (players == null || players.length == 0) {
            System.out.println("No players available");
            return;
        }

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                System.out.println(
                    (i + 1) + ". " +
                    players[i].getPlayerName() +
                    " - ₹" + players[i].getBiddingAmount() + " Cr"
                );
            }
        }
    }
}