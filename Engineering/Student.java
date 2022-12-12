package Engineering;

import java.util.Scanner;

public class Student {
    int roll_no;
    String name;
    int marks;

    Student(int no,String n,int m){
        this.roll_no = no;
        this.name = n;
        this.marks = m;
    }

    static Student add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the roll_no");
        int rollno = sc.nextInt();
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        Student n = new Student(rollno,name,marks);
        return n;
    }
}
