import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;


public class GuessinTools {

    public GuessinTools() {
    }

    private static int counter = 0;
    //private ArrayList<Character> listOfOptions = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '1', '2', '3', '4', '5', '6', '7', '8', '5', '6', '7', '8'));

    private char[][] showUser = {{'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}};
    private char[][] guessingField = new char[4][4];


    // Generuje hrací pole, které neukazujeme hráči
    public void generateHiddenField() {
        ArrayList<Character> listOfOptions = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '1', '2', '3', '4', '5', '6', '7', '8', '5', '6', '7', '8'));
        char[][] showUser = {{'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int random = (int) Math.floor(Math.random() * listOfOptions.size());
                guessingField[i][j] = listOfOptions.get(random);
                listOfOptions.remove(random);
            }
        }
    }

    // Ukazuje herní pole, které je skryté a hráč vidí
    public void showPlayingField() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(showUser[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Ukazuje skryté herní pole, které hráč nevidi
    public void showHiddenField() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(guessingField[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void guess(int pos1, int pos2, int pos3, int pos4) throws InterruptedException {
        if ((pos1 < 4) && (pos2 < 4) && (pos3 < 4) && (pos4 < 4)) {
            if (guessingField[pos1][pos2] != '#' && guessingField[pos3][pos4] != '#') {
                if ((pos1 == pos3 && pos2 == pos4)) {
                    System.out.println("Enter different card coordinates!");
                    System.out.println();
                    showPlayingField();
                } else if (guessingField[pos1][pos2] == guessingField[pos3][pos4]) {
                    showUser[pos1][pos2] = guessingField[pos1][pos2];
                    showUser[pos3][pos4] = guessingField[pos3][pos4];
                    guessingField[pos3][pos4] = '#';
                    guessingField[pos1][pos2] = '#';

                    System.out.println("Correct!");
                    counter++;

                    showPlayingField();
                } else {
                    System.out.println("Inccorect!");
                    System.out.println();
                    showUser[pos1][pos2] = guessingField[pos1][pos2];
                    showUser[pos3][pos4] = guessingField[pos3][pos4];
                    showPlayingField();
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println();
                    showUser[pos1][pos2] = '#';
                    showUser[pos3][pos4] = '#';
                    showPlayingField();
                }
            } else {
                System.out.println("You have already guessed this combination!");
            }
        } else {
            System.out.println("Enter valid numbers!");
        }
    }

    // Logika zda user Vyhrál
    public boolean alreadyWon() {
        return counter == 8;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        GuessinTools.counter = counter;
    }

// reset hidden field and reset field of # showed to user
    public void resetGame() {
        generateHiddenField();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                showUser[i][j] = '#';
                System.out.print(showUser[i][j]);
            }
            System.out.println("");
        }
    }
}