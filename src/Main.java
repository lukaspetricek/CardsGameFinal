import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
///If you are doing a console-based version, use numbers instead of the usual cards or objects, and a board like:
//# # # #
//# # # #
//# # # #
//# # # #
//The user enters two pairs of coordinates, to turn two “cards”. If the “cards” are equal they will stay faced up.
//If not, they should be turned again to be hidden.

        ArrayList<Integer> allCards = new ArrayList<>();

        allCards.add(1);
        allCards.add(1);
        allCards.add(2);
        allCards.add(2);
        allCards.add(3);
        allCards.add(3);
        allCards.add(4);
        allCards.add(4);
        allCards.add(5);
        allCards.add(5);
        allCards.add(6);
        allCards.add(6);
        allCards.add(7);
        allCards.add(7);
        allCards.add(8);
        allCards.add(8);

        int min = 0;
        int random_card;
        Integer[][] hiddenCards = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                random_card = (int) Math.floor(Math.random() * (allCards.size() - min + 1) + min);
                hiddenCards[i][j] = random_card;
                System.out.println(hiddenCards[i][j]);
            }
        }

        System.out.println("Cards game");


        // Připravit ArrayList, ve kterém  budou možnosti pro seznam
        // Pak přiravit Array o specifické délce, do kterého napustíme věci z Arraylistu
        // Pak vytvoříme Array, kterje se zobrazí lidem při hře.
        //  Když se uhádne pozice v schovanem Arrayi, tak se přepíšoe záznam do Arraye pro hráče
        // když ne opakujeme dokud se vše neuhádne, uhádnutí končí, když zbývá poslední dvojice na nalezení.
        // je možnost počítat, kolik kol to trvalo

//        System.out.println("Array[0][0] +  Array[0][1]  + Array[0][2] +  Array[0][3]");
//        System.out.println("#   #   #   #");
//        System.out.println("#   #   #   #");
//        System.out.println("#   #   #   #");

//        System.out.println("Array[0] +   Array[1] + Array[2] + Array[3]");
//        System.out.println("#   #   #   #");
//        System.out.println("#   #   #   #");
//        System.out.println("#   #   #   #");




char[][] showUser =     {{'1', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}};

        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(showUser[i][j] + " ");
            }
            System.out.println();
        }
    }
}