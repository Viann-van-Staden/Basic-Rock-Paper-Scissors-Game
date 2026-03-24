import java.util.Scanner;

public class Main {
    enum Hand {
        ROCK,
        PAPER,
        SCISSORS,
    }

    public static void main(String[] args) {


        // Win Lose Table

        // You - CPU

        // Paper Hand
        // Paper - Rock = Win
        // Paper - Paper = Draw
        // Paper - Scissors = Lost

        // Rock Hand
        // Rock - Rock = Draw
        // Rock - Paper = Lost
        // Rock - Scissors = Win

        // Scissors Hand
        // Scissors - Rock = Lost
        // Scissors - Paper = Win
        // Scissors - Scissors = Draw

        boolean gameState = true;

        Scanner scanner = new Scanner(System.in);

        while (gameState) {
            System.out.println("Please select: ");
            System.out.println("Rock: (1) ");
            System.out.println("Paper: (2) ");
            System.out.println("Scissors: (3) ");

            int hand = scanner.nextInt();

            // Logic for AI

            int cpuNumber = (int)(Math.random()*3)+1;
            System.out.println(cpuNumber);


            switch(hand) {
                case 1:
                    System.out.println("Rock");
                    if (cpuNumber == 1) {
                        System.out.println("Draw");
                    } else if (cpuNumber == 2) {
                        System.out.println("Lost");
                    } else if (cpuNumber == 3) {
                        System.out.println("Win");
                    }
                    break;
                case 2:
                    System.out.println("Paper");
                    if (cpuNumber == 1) {
                        System.out.println("Win");
                    } else if (cpuNumber == 2) {
                        System.out.println("Draw");
                    } else if (cpuNumber == 3) {
                        System.out.println("Lost");
                    }
                    break;
                case 3:
                    System.out.println("Scissors");
                    if (cpuNumber == 1) {
                        System.out.println("Lost");
                    } else if (cpuNumber == 2) {
                        System.out.println("Win");
                    } else if (cpuNumber == 3) {
                        System.out.println("Draw");
                    }
                    break;
            }
            System.out.println("Would you like to play again?");
            char playAgain = scanner.next().charAt(0);
            if (playAgain == 'Y' || playAgain == 'y') {
                gameState = true;
            } else if (playAgain == 'N' || playAgain == 'n') {
                gameState = false;
            }
        }
    }
}