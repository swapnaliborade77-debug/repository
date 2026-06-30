package ipl;

public class Player {

    private String team;
    private String playerName;
    private int jersey;
    private double biddingAmount;

    public Player(String team, String playerName, int jersey, double biddingAmount) {
        this.team = team;
        this.playerName = playerName;
        this.jersey = jersey;
        this.biddingAmount = biddingAmount;
    }

    public String getTeam() {
        return team;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getJersey() {
        return jersey;
    }

    public double getBiddingAmount() {
        return biddingAmount;
    }

    @Override
    public String toString() {
        return "Team : " + team +
                "\nPlayer Name : " + playerName +
                "\nJersey Number : " + jersey +
                "\nBidding Amount : " + String.format("%.0f", biddingAmount) +
                "\n---------------------";
    }
}