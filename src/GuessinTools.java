import java.util.ArrayList;
import java.util.Arrays;

public class GuessinTools {
    public GuessinTools() {
    }
    private ArrayList<Integer> listOfOptions = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,8,5,6,7,8));
    private char[][] showUser =  {{'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}};


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
    public void guess(int pos1, int pos2){
        showUser[pos1-1][pos2-1] = '9';
    }


}
