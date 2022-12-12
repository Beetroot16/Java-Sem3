class Square extends Thread{
    int x;
    Square(int n){
        this.x = n;
    }
    public void run(){
        int sqr = x*x;
        System.out.println("Square of number = "+ sqr);
    }
}

class Cube extends Thread{
    int x;
    Cube(int n){
        this.x = n;
    }
    public void run(){
        int cube = x*x*x;
        System.out.println("Cube of number = "+ cube);
    }
}

class Number extends Thread{
    public void run(){
        for(int i =0;i<10;i++){
            if(i%2 == 0){
                Square s = new Square(i);
                s.start();
            }
            else{
                Cube c = new Cube(i);
                c.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Exp8 {
    public static void main(String[] args) {
        Number n = new Number();
        n.start();
    }
}
