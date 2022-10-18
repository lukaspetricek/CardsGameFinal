import java.util.ArrayList;
import java.util.Arrays;

public class GuessinTools {
    public GuessinTools() {
    }
    public static int counter = 0;
    private ArrayList<Character> listOfOptions = new ArrayList<>(Arrays.asList('1','2','3','4','1','2','3','4','5','6','7','8','5','6','7','8'));
    private char[][] showUser =  {{'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}};
    private char[][] guessingField = new char[4][4];

    public void generateField(){

    }

    public void showField(){
    for (int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            System.out.print(showUser[i][j] + " ");
        }
        System.out.println();
    }
}
    public void guess(int pos1, int pos2, int pos3, int pos4){
        if(guessingField[pos1][pos2] == guessingField[pos3][pos4]){
            guessingField[pos1][pos2] = showUser[pos1][pos2];
            guessingField[pos3][pos4] = showUser[pos3][pos4];

            System.out.println("Correct!");
            counter++;
        }
        else {
            System.out.println("Incorrect!");
            counter++;
        }
    }


}
