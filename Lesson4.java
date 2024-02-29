import java.util.ArrayList;

public class Lesson4 {
    public static void main(String[] args){
        ArrayList< Integer> list = new ArrayList<Integer>();
        list.add(1200);
        list.add(223);
        list.add(5388234);
        System.out.println(list);

       for(int i = 0; i < list.size(); i++){
           System.out.println(list.get(i) * 2);
       }
       ArrayList< String> shoping = new ArrayList<String>();
       shoping.add("elma");
       shoping.add("armut");
       shoping.add("mango");
       shoping.add("muz");
       System.out.println(shoping);
        for(int i = 0; i < shoping.size(); i++){
            if(shoping.get(i).length() < 5)
                shoping.remove(i);

        }
        System.out.println(shoping);
    }
}
