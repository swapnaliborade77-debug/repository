package ipl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IPLService {


	List<Player> players;


	public IPLService() throws Exception {


		Stream<String> data = Files.lines(Paths.get("src/ipl.txt"));


		players = data.skip(1)
				.map(line -> line.split(","))
				.map(arr -> 
					new Player(
						arr[0],
						arr[1],
						Integer.parseInt(arr[2]),
						Double.parseDouble(arr[3])
					))
				.collect(Collectors.toList());

	}



	// search player using flatMap concept
	public void searchPlayer(String name) {


		players.stream()

		.flatMap(p -> Stream.of(p))

		.filter(p -> 
			p.getPlayerName()
			.equalsIgnoreCase(name))

		.forEach(System.out::println);

	}



	// search complete team

	public void searchTeam(String team) {


		players.stream()

		.flatMap(p -> Stream.of(p))

		.filter(p ->
			p.getTeam()
			.equalsIgnoreCase(team))

		.forEach(System.out::println);

	}

}