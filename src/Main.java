import java.util.Scanner;

public class Main {

    public static int playerInput(Scanner scanner) {
        int hand = scanner.nextInt();
        return hand;
    }

    public static int cpuInput(Scanner scanner) {
        int cpuNumber = (int)(Math.random()*3)+1;
        System.out.println(cpuNumber);
        return cpuNumber;
    }

    public static void gameConditions(int player, int cpu) {
        switch(player) {
            case 1:
                System.out.println("Rock");
                if (cpu == 1) {
                    System.out.println("Draw");
                } else if (cpu == 2) {
                    System.out.println("Lost");
                } else if (cpu == 3) {
                    System.out.println("Win");
                }
                break;
            case 2:
                System.out.println("Paper");
                if (cpu == 1) {
                    System.out.println("Win");
                } else if (cpu == 2) {
                    System.out.println("Draw");
                } else if (cpu == 3) {
                    System.out.println("Lost");
                }
                break;
            case 3:
                System.out.println("Scissors");
                if (cpu == 1) {
                    System.out.println("Lost");
                } else if (cpu == 2) {
                    System.out.println("Win");
                } else if (cpu == 3) {
                    System.out.println("Draw");
                }
                break;
        }
    }

    public static boolean gameState(String[] args, Scanner scanner, Boolean gameState) {
        System.out.println("Would you like to play again?");
        char playAgain = scanner.next().charAt(0);

        if (playAgain == 'Y' || playAgain == 'y') {
            gameState = true;
        } else if (playAgain == 'N' || playAgain == 'n') {
            gameState = false;
        }
        return gameState;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean gameState = true;

        while (gameState) {
            System.out.println("Please select: ");
            System.out.println("Rock: (1) ");
            System.out.println("Paper: (2) ");
            System.out.println("Scissors: (3) ");

            // Player input Method
            int player = playerInput(scanner);

            // Logic for AI Method
            int  cpu = cpuInput(scanner);

            // Game Conditions Method
            gameConditions(player, cpu);

            // Game State
            gameState = gameState(args, scanner, gameState);

        }
    }
}