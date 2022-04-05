import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class map {

    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2 , 2020);
        map.put(4 , 4020);
        map.put(6 , 6020);
        map.put(8 , 8020);
        map.put(1 , 3020);
        map.put(3 , 5020);
        map.put(5 , 6020);
        map.forEach((k,v)-> System.out.println(k+"="+v));
        System.out.println("After sorting by value");
        List<Entry<Integer,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        list.forEach(System.out::println);
    }



    
}
