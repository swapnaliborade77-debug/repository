package ipl;

import java.sql.Connection;
import java.util.Scanner;

public class TestPlayerDAO {

    public static void main(String[] args) {

        Connection con = null;
        Scanner sc = new Scanner(System.in);

        try {

            con = JDBCFactory.getConnection();
            PlayerDAO dao = new PlayerDAO(con);

            int choice;

            do {

                System.out.println("\n=================================");
                System.out.println("         IPL PLAYER MENU");
                System.out.println("=================================");
                System.out.println("1. Display All Players");
                System.out.println("2. Search Player by Name");
                System.out.println("3. Display Players of Team");
                System.out.println("4. Display All Teams");
                System.out.println("5. Highest Bid Player");
                System.out.println("6. Lowest Bid Player");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {

                case 1:
                    dao.displayAllPlayers();
                    break;

                case 2:
                    System.out.print("Enter Player Name: ");
                    String playerName = sc.nextLine();
                    dao.searchPlayer(playerName);
                    break;

                case 3:
                    System.out.print("Enter Team Name (CSK/MI/RCB/KKR/SRH): ");
                    String teamName = sc.nextLine();
                    dao.searchTeam(teamName);
                    break;

                case 4:
                    dao.displayTeams();
                    break;

                case 5:
                    dao.highestBidPlayer();
                    break;

                case 6:
                    dao.lowestBidPlayer();
                    break;

                case 7:
                    System.out.println("Thank You! Visit Again.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
                }

            } while (choice != 7);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (con != null)
                    con.close();
                sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}