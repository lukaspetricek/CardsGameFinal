import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GuessinTools play = new GuessinTools();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        boolean playAgain = true;
        play.generateHiddenField();
        play.showPlayingField();
        play.showHiddenField();

        while (playAgain) {
            while (!play.alreadyWon()) {
// show board to user only the first time
//                if (flag) {
//                    play.showPlayingField();
//                    flag = false;
//                }
// cheat sheet to play faster / 2do delete
                //play.showHiddenField();

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
                                System.out.println("Enter only valid choice (1-4)!");
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
                            System.out.println("Enter only valid choice (1-4)!");
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
                            System.out.println("Enter only valid choice (1-4)!");
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
                            System.out.println("Enter only valid choice (1-4)!");
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

//            System.out.println("Enter positive number coordinates of card A (1-" + 4 + "), (1-" + 4 + "): ");
//
//            do {
//                System.out.print("Please enter a Row: ");
//                while (!scanner.hasNextInt()) {
//                    System.out.println("That's not a number!");
//                    System.out.println();
//                    System.out.print("Enter row again: ");
//                    scanner.next(); // this is important!
//                }
//                pos1 = scanner.nextInt() -1;
//            } while (pos1 < -1);
//
//            do {
//                System.out.print("Please enter a column: ");
//                while (!scanner.hasNextInt()) {
//                    System.out.println("That's not a number!");
//                    System.out.println();
//                    System.out.print("Enter column again: ");
//                    scanner.next(); // this is important!
//                }
//                pos2 = scanner.nextInt() -1;
//            } while (pos2 < -1);
//
//            System.out.println("Enter positive number coordinates of card B (1-" + 4 + "), (1-" + 4 + "): ");
//
//            do {
//                System.out.print("Please enter a row: ");
//                while (!scanner.hasNextInt()) {
//                    System.out.println("That's not a number!");
//                    System.out.println();
//                    System.out.print("Enter row again: ");
//                    scanner.nextLine(); // this is important!
//                }
//                pos3 = scanner.nextInt() - 1;
//            } while (pos3 < - 1);
//
//            do {
//                System.out.print("Please enter a column: ");
//                while (!scanner.hasNextInt()) {
//                    System.out.println("That's not a number!");
//                    System.out.println();
//                    System.out.print("Enter column again: ");
//                    scanner.nextLine(); // this is important!
//                }
//                pos4 = scanner.nextInt() - 1;
//            } while (pos4 < - 1);
//
//            play.guess(pos1, pos2, pos3, pos4);
//        }

        //If user wins show whole field and ask for playing Again.
        System.out.println("You have won!");
        System.out.println();

        System.out.print("Do you wanna play again?: [Y/N]");
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