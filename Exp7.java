import java.util.*;

class TimeException extends Exception{
    public TimeException(String s){
        super(s);
    }
}

public class Exp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter minutes");
        int min = sc.nextInt();
        System.out.println("Enter seconds");
        int sec = sc.nextInt();
        if(sec > 60){
            throw new TimeException("Nahi chala bhai");
        }
        else{
            int ans = min*60 + sec;
            System.out.println(ans);
        }
        }
        catch(TimeException t){
            System.out.println(t.getMessage());
        }
    }
}
