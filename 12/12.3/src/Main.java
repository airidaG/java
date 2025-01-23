import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//Logging player names
//        List<Player> players = List.of(new Player("Alice", 20),
//                new Player("Bob", 30), (new Player("Charlie", 25)));

//        players.forEach(player -> System.out.println("Player: " + player.getName() + ", Score: " + player.getScore()));

//Removing players with low scores

//        List<Player> players = new ArrayList<>(List.of(new Player("Alice", 20),
//                new Player("Bob", 30), (new Player("Charlie", 25))));

//        players.removeIf(player -> player.getScore() < 25);
//        System.out.println(players);

//Updating scores

//        List<Player> players = new ArrayList<>(List.of(new Player("Alice", 10),
//                new Player("Bob", 15), (new Player("Charlie", 20))));
//
//        players.replaceAll((player) -> {
//            player.setScore(player.getScore() * 2);
//            return player;
//        });
//
//        System.out.println(players);
//
//Sorting players

//        List<Player> players = new ArrayList<>(List.of(
//                new Player("Alice", 15),
//                new Player("Bob", 20),
//                new Player("Charlie", 20),
//                new Player("Daisy", 10)));
//
//        players.sort((p1, p2) ->
//                Comparator.comparingInt(Player::getScore).reversed()
//                        .thenComparing(Player::getName)
//                        .compare(p1, p2)
//        );
//
////        players.sort((p1, p2) -> {
////            int scoreComparison = Integer.compare(p2.getScore(), p1.getScore());
////            if (scoreComparison != 0) {
////                return scoreComparison;
////            }
////            return p1.getName().compareTo(p2.getName());
////        });
//        System.out.println(players);

//Adding Prefix to Player Names

        List<Player> players = new ArrayList<>(List.of(
                new Player("Alice", 25),
                new Player("Bob", 30),
                new Player("Charlie", 35)));

        players.forEach((player) -> player.setName("Player-" + player.getName()));
        System.out.println(players);
    }
}