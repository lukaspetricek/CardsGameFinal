import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GuessinTools play = new GuessinTools();
        Scanner scanner = new Scanner(System.in);
        int pos1, pos2, pos3, pos4;
        boolean flag = true;
        boolean playAgain = true;

        play.generateHiddenField();

    while(playAgain){

        //Show board to user only the first time
        while(!play.alreadyWon()){
            if(flag){
                play.showPlayingField();
                flag = false;
            }
            //get user input
            System.out.println("Enter positive number coordinates of card A (1-" + 4 + "), (1-" + 4 + "): ");

            do {
                System.out.print("Please enter a Row: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a number!");
                    System.out.println();
                    System.out.print("Enter row again: ");
                    scanner.next(); // this is important!
                }
                pos1 = scanner.nextInt() -1;
            } while (pos1 < -1);

            do {
                System.out.print("Please enter a column: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a number!");
                    System.out.println();
                    System.out.print("Enter column again: ");
                    scanner.next(); // this is important!
                }
                pos2 = scanner.nextInt() -1;
            } while (pos2 < -1);

            System.out.println("Enter positive number coordinates of card B (1-" + 4 + "), (1-" + 4 + "): ");

            do {
                System.out.print("Please enter a row: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a number!");
                    System.out.println();
                    System.out.print("Enter row again: ");
                    scanner.nextLine(); // this is important!
                }
                pos3 = scanner.nextInt() - 1;
            } while (pos3 < - 1);

            do {
                System.out.print("Please enter a column: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a number!");
                    System.out.println();
                    System.out.print("Enter column again: ");
                    scanner.nextLine(); // this is important!
                }
                pos4 = scanner.nextInt() - 1;
            } while (pos4 < - 1);

            play.guess(pos1, pos2, pos3, pos4);
        }

        //If user wins show whole field and ask for playing Again.
        System.out.println("You have won!");
        play.showHiddenField();
        System.out.println();
        System.out.println();

        System.out.print("Do you wanna play again?: [Y/N]");
        String userDecide = scanner.nextLine();
        if(userDecide.equalsIgnoreCase("N") || userDecide.equalsIgnoreCase("No")){
            System.out.println("K thx bye!");
            playAgain = false;
        } else {
            play.setCounter(0);
            flag = true;
        }

    }
        System.out.println("Thanks for playing!");
    }
}