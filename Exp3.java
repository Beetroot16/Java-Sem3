import java.util.*;

public class Exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int player_count = sc.nextInt();
        int array[][] = new int[player_count][];
        for(int i=0;i<player_count;i++){
            System.out.println("Enter the matches played by player " + (i+1));
            int matches = sc.nextInt();
            array[i] = new int[matches];
            for(int j=0;j<matches;j++){
                System.out.println("Enter the runs scored in match "+(j+1));
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
