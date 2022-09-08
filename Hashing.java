import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        //create a hashmap
        HashMap<String, Integer> map=new HashMap<>();
        //put data in hashmap
        map.put("India",130);
        map.put("China",150);
        map.put("usa",30);
        map.put("UK",40);
        System.out.println(map);
        System.out.println();

        //update UK and add Uttar Pradesh
        System.out.println("after update ");
        map.put("UK",45);
        map.put("Uttar_pradesh",25);
        System.out.println(map);
        System.out.println();
//
//        //remove a key
        map.remove("UK");
        System.out.println(map);
        System.out.println();
//
//       //size of map
        System.out.println("size of map is "+map.size());
        System.out.println(map.clone());
        System.out.println();

        System.out.println(map.containsKey("India"));
        System.out.println();
        System.out.println(map.containsKey("pakistan"));
        System.out.println();
        System.out.println(map.containsValue(20));
        System.out.println();
        System.out.println(map.containsValue(150));
        System.out.println();

        //traverse whole HashMap
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey());
            System.out.print(e.getValue()+" ");
        }
        System.out.println(map.isEmpty());

        System.out.println(map.hashCode());


    }
}
