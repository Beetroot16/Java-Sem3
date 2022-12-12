import java.util.*;
class Employee{
    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

public class Exp5 {

    static Employee add(Scanner sc){
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the id");
        int id = sc.nextInt();
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        Employee E = new Employee(name,id,salary);
        return E;
    }

    static void remove(Scanner sc,Vector<Employee> vec){
        System.out.println("Enter the id");
        int id = sc.nextInt();
        for(int i=0;i<vec.size();i++){
            if(vec.get(i).id==id){
                vec.remove(i);
            }
        }
    }

    static void display(Scanner sc,Vector<Employee> vec){
        System.out.println("Enter the id");
        int id = sc.nextInt();
        for(int i=0;i<vec.size();i++){
            if(vec.get(i).id==id){
                Employee E = vec.get(i);
                System.out.println(E.name + " "+ E.id + " "+ E.salary);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Employee> vec = new Vector<Employee>();
        vec.add(add(sc));
        display(sc,vec);
    }
}
