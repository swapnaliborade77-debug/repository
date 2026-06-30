package ipl;

import java.util.Scanner;


public class TestIPL {


	public static void main(String[] args) throws Exception {


		IPLService service = new IPLService();


		Scanner sc = new Scanner(System.in);


		System.out.println("1.Search Player");
		System.out.println("2.Search Team");

		int choice=sc.nextInt();
		sc.nextLine();


		switch(choice) {


		case 1:

			System.out.println("Enter Player Name");

			String player=sc.nextLine();

			service.searchPlayer(player);

			break;



		case 2:

			System.out.println("Enter Team Name");

			String team=sc.nextLine();

			service.searchTeam(team);

			break;



		default:
			System.out.println("Invalid choice");

		}


		sc.close();

	}

}