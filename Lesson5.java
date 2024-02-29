import java.util.ArrayList;

public class Lesson5 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("apples");
        list.add("bread");
        list.add("milk");
        list.add("cheese");
        list.add("eggs");
        list.add("pasta");
        System.out.println(list);

        for(int i = list.size() - 1; i >= 0; i--){
           if(i % 2 == 0)
               list.remove(i);
        }
        System.out.println(list);
    }
}
