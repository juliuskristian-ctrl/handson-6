import java.util.Scanner;

public class inputTurnamentData {

    public static void inputTournamentData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CODEWARRIORS CHAMPIONSHIP 2025 ===");

        int numberOfTeams = 0;

        do {
            System.out.print("Enter number of teams (3-10): ");
            if (scanner.hasNextInt()) {
                numberOfTeams = scanner.nextInt();
                if (numberOfTeams < 3 || numberOfTeams > 10) {
                    System.out.println("Invalid! Must be between 3-10.");
                }
            } else {
                System.out.println("Invalid! Must be a number.");
                scanner.next();
            }
        } while (numberOfTeams < 3 || numberOfTeams > 10);
        scanner.nextLine();

        final int MATCH_COUNT = 5;
        String[] teamNames = new String[numberOfTeams];
        int[][] teamScores = new int[numberOfTeams][MATCH_COUNT];

        // inputan nama timnya
        for (int i = 0; i < numberOfTeams; i++) {
            System.out.println("\n--- Team " + (i + 1) + " ---");

            System.out.print("Team name: ");
            teamNames[i] = scanner.nextLine();

            // inputan skor
            System.out.println("Enter 5 match scores (0-100):");

            for (int j = 0; j < MATCH_COUNT; j++) {
                int score;
                do {
                    System.out.print("Match " + (j + 1) + ": ");

                    if (scanner.hasNextInt()) {
                        score = scanner.nextInt();
                        if (score < 0 || score > 100) {
                            System.out.println("Invalid score! Must be between 0-100. Enter again.");
                        }
                    } else {
                        System.out.println("Invalid score! Must be a number. Enter again.");
                        scanner.next();
                        score = -1;
                    }
                } while (score < 0 || score > 100);

                teamScores[i][j] = score;
            }
            scanner.nextLine();
        }

        scanner.close();
    }

    public static void main(String[] args) {
        inputTournamentData();
    }
}