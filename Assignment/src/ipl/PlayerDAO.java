package ipl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlayerDAO {

    private Connection con;

    public PlayerDAO(Connection con) {
        this.con = con;
    }

    // 1. Display All Players
    public void displayAllPlayers() {

        String sql = "SELECT p.PlayerID,p.PlayerName,p.Age,p.BidAmount,t.TeamName "
                + "FROM Player p INNER JOIN Team t "
                + "ON p.TeamID=t.TeamID";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("----------------------------");
                System.out.println("Player ID   : " + rs.getInt("PlayerID"));
                System.out.println("Player Name : " + rs.getString("PlayerName"));
                System.out.println("Age         : " + rs.getInt("Age"));
                System.out.println("Team        : " + rs.getString("TeamName"));
                System.out.println("Bid Amount  : ₹" + rs.getDouble("BidAmount") + " Cr");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. Search Player
    public void searchPlayer(String name) {

        String sql = "SELECT p.PlayerName,p.Age,p.BidAmount,t.TeamName "
                + "FROM Player p INNER JOIN Team t "
                + "ON p.TeamID=t.TeamID "
                + "WHERE p.PlayerName=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Player Name : " + rs.getString("PlayerName"));
                System.out.println("Age         : " + rs.getInt("Age"));
                System.out.println("Team        : " + rs.getString("TeamName"));
                System.out.println("Bid Amount  : ₹" + rs.getDouble("BidAmount") + " Cr");

            } else {
                System.out.println("Player Not Found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. Display Players Of Team
    public void searchTeam(String team) {

        String sql = "SELECT p.PlayerName,p.BidAmount "
                + "FROM Player p INNER JOIN Team t "
                + "ON p.TeamID=t.TeamID "
                + "WHERE t.TeamName=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, team);

            ResultSet rs = ps.executeQuery();

            System.out.println("\nPlayers of " + team);

            while (rs.next()) {

                System.out.println(rs.getString("PlayerName")
                        + " - ₹" + rs.getDouble("BidAmount") + " Cr");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4. Display Players Above Bid Amount
    public void playersAboveBid(double amount) {

        String sql = "SELECT PlayerName,BidAmount FROM Player WHERE BidAmount>?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, amount);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getString("PlayerName")
                        + " - ₹" + rs.getDouble("BidAmount") + " Cr");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 5. Count Players In Team
    public void countPlayers(String team) {

        String sql = "SELECT COUNT(*) "
                + "FROM Player p INNER JOIN Team t "
                + "ON p.TeamID=t.TeamID "
                + "WHERE t.TeamName=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, team);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Total Players : " + rs.getInt(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 6. Display All Teams
    public void displayTeams() {

        String sql = "SELECT TeamName FROM Team";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getString("TeamName"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 7. Highest Bid Player
    public void highestBidPlayer() {

        String sql = "SELECT PlayerName,BidAmount FROM Player "
                + "ORDER BY BidAmount DESC LIMIT 1";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Highest Bid Player");
                System.out.println("Player : " + rs.getString("PlayerName"));
                System.out.println("Bid : ₹" + rs.getDouble("BidAmount") + " Cr");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 8. Lowest Bid Player
    public void lowestBidPlayer() {

        String sql = "SELECT PlayerName,BidAmount FROM Player "
                + "ORDER BY BidAmount ASC LIMIT 1";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Lowest Bid Player");
                System.out.println("Player : " + rs.getString("PlayerName"));
                System.out.println("Bid : ₹" + rs.getDouble("BidAmount") + " Cr");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 9. Average Bid Of Team
    public void averageBid(String team) {

        String sql = "SELECT AVG(BidAmount) "
                + "FROM Player p INNER JOIN Team t "
                + "ON p.TeamID=t.TeamID "
                + "WHERE t.TeamName=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, team);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Average Bid : ₹"
                        + rs.getDouble(1) + " Cr");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 10. Display Players Sorted By Bid
    public void sortByBid() {

        String sql = "SELECT PlayerName,BidAmount "
                + "FROM Player ORDER BY BidAmount DESC";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getString("PlayerName")
                        + " - ₹" + rs.getDouble("BidAmount") + " Cr");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}