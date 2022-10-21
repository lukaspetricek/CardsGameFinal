import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GuessinTools play = new GuessinTools();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        boolean playAgain = true;
        play.generateHiddenField();

// cheat sheet for testing
//      play.showHiddenField();
        play.showPlayingField();

        while (playAgain) {
            while (!play.alreadyWon()) {

// get user input validation by brute force :-D
            System.out.println("Enter row 1-4 of card A.");
                    Scanner userChoice = new Scanner(System.in);
                    int userInput = 0, n = 1;
                    boolean valid;
                    do {
                        do {
                            valid = true;
                            try {
                                userInput = Integer.parseInt(userChoice.nextLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Valid values are 1-4!");
                                valid = false;
                            }
                        } while (!valid);
                        switch (userInput) {
                            case 1:
                                n = 2;
                                break;
                            case 2:
                                n = 2;
                                break;
                            case 3:
                                n = 2;
                                break;
                            case 4:
                                n = 2;
                                break;
                            default:
                                System.out.println("Invalid input. Valid values are 1-4!");
                        }
                    } while (n == 1);
                    int pos1 = userInput - 1;

                System.out.println("Enter column 1-4 of card A.");
                userInput = 0;
                n = 1;
                do {
                    do {
                        valid = true;
                        try {
                            userInput = Integer.parseInt(userChoice.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Valid values are 1-4!");
                            valid = false;
                        }
                    } while (!valid);
                    switch (userInput) {
                        case 1:
                            n = 2;
                            break;
                        case 2:
                            n = 2;
                            break;
                        case 3:
                            n = 2;
                            break;
                        case 4:
                            n = 2;
                            break;
                        default:
                            System.out.println("Invalid input. Valid values are 1-4!");
                    }
                } while (n == 1);
                int pos2 = userInput - 1;

                System.out.println("Enter row 1-4 of card B.");
                userInput = 0;
                n = 1;
                do {
                    do {
                        valid = true;
                        try {
                            userInput = Integer.parseInt(userChoice.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Valid values are 1-4!");
                            valid = false;
                        }
                    } while (!valid);
                    switch (userInput) {
                        case 1:
                            n = 2;
                            break;
                        case 2:
                            n = 2;
                            break;
                        case 3:
                            n = 2;
                            break;
                        case 4:
                            n = 2;
                            break;
                        default:
                            System.out.println("Invalid input. Valid values are 1-4!");
                    }
                } while (n == 1);
                int pos3 = userInput - 1;

                System.out.println("Enter column 1-4 of card B.");
                userInput = 0;
                n = 1;
                do {
                    do {
                        valid = true;
                        try {
                            userInput = Integer.parseInt(userChoice.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Valid values are 1-4!");
                            valid = false;
                        }
                    } while (!valid);
                    switch (userInput) {
                        case 1:
                            n = 2;
                            break;
                        case 2:
                            n = 2;
                            break;
                        case 3:
                            n = 2;
                            break;
                        case 4:
                            n = 2;
                            break;
                        default:
                            System.out.println("Invalid input. Valid values are 1-4!");
                    }
                } while (n == 1);
                int pos4 = userInput -1;

                play.guess(pos1, pos2, pos3, pos4);
            }

        // if user wins show question for playing again
        System.out.println("You have won!\n");

        System.out.print("Do you wanna play again y/n? ");
        String userDecide = scanner.next();

        if (userDecide.equalsIgnoreCase("N") || userDecide.equalsIgnoreCase("No")) {
            System.out.println("K thx bye!");
            playAgain = false;
        } else {
            play.setCounter(0);
            play.resetGame();
            flag = true;
        }
    }
        System.out.println("Thanks for playing!");
    }
}