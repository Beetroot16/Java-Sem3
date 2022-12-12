import java.util.*;

class User{
    int account_id;
    String name;
    double balance;

    User(int id , String n,double b){
        this.account_id = id;
        this.name = n;
        this.balance = b;
    }
}

public class Exp4 {

    static int user_count = 0;
    static void add_user(Scanner sc, User array[]){
        System.out.println("Enter the id: ");
        int id = sc.nextInt();
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter the balance: ");
        int bal = sc.nextInt();
        array[user_count].account_id = id;
        array[user_count].name = name;
        array[user_count].balance = bal;
    }
    static void search_user(Scanner sc, User array[]){
        User answer = new User(0,null,0);
        System.out.println("Enter the user id: ");
        int id = sc.nextInt();
        int index = -1;
        int flag = 0;
        for(int i=0;i<user_count;i++){
            if(array[i].account_id == id){
                index = i;
                flag  = 1;
            }
            else{
                flag = 0;
            }
            if(flag == 0){
                System.out.println("Not found");
                break;
            }
            answer = array[index];
        }
        System.out.println(answer.account_id + " " + answer.name+ " "+ answer.balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int n = sc.nextInt();
        User array[] = new User[n];
        for(int i=0;i<n;i++){
            array[i] = new User(0,null,0);
        }
        System.out.println("1. Add 2. Delete 3. Display");
        while(true){
            int choice;
            System.out.println(">>");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add_user(sc,array);
                    user_count++;
                    System.out.println(user_count);
                    break;
                case 3:
                    search_user(sc, array);
                default:
                    break;
            }
        }
    }
}
