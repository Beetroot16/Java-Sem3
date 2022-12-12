package Engineering;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Student> vec = new Vector<Student>();
        vec.add(Student.add());
        vec.add(Student.add());
        vec.add(Student.add());
        vec.add(Student.add());
        Marks.sort(vec);
        Marks.display(vec);
    }
}
