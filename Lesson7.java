import java.util.HashMap;
import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args){

        HashMap<String, Integer> students = new HashMap<>();
        students.put("john", 30);
        students.put("jom", 80);
        students.put("jane", 75);
        students.put("sue", 100);

        System.out.println(students.get("jane"));
        if(students.containsKey("ibo")){
            System.out.println(students.get("john"));
        }
        else
            System.out.println("is not ");
     }
}
