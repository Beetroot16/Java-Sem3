package Engineering;

import java.util.Vector;
import java.util.Collections;

public class Marks {
    static void display(Vector<Student> vec){
        for(int i=0;i<vec.size();i++){
            System.out.println(vec.get(i).roll_no+"\t"+vec.get(i).name+"\t"+vec.get(i).marks);
        }
    }
    static void sort(Vector<Student> vec){
        for(int i=0;i<vec.size();i++){
            for(int j=i;j<vec.size();j++){
                if(vec.get(i).marks>vec.get(j).marks){
                    Collections.swap(vec,i,j);
                }
            }
        }
    }
}
