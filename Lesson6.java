import java.util.ArrayList;

public class Lesson6 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int startIndex = 0;
        int endIndex = list.size() - 1;

        while (startIndex < endIndex) {
            int temp = list.get(startIndex);
            list.set(startIndex, list.get(endIndex));
            list.set(endIndex, temp);

            startIndex++;
            endIndex--;
        }
        System.out.println(list);



    }
}
