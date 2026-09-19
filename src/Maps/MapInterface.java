package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();

        //Put method
        map.put("In", "India");
        map.put("No", "Norway");
        map.put("Y", "Yes");

        System.out.println(map);
        System.out.println(map.get("In"));

        map.remove("In");
        System.out.println(map);

        System.out.println(map.getOrDefault("Ne", "None"));

        map.putIfAbsent("In", "India");
        System.out.println(map);


        Map<String, String> map2 = new HashMap<>();


        map2.put("In", "India1");
        map2.put("Ve", "Veluae");
        map2.putAll(map);
        System.out.println(map2);


        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);


        //Iterator

        for (Map.Entry<String, String> e : map2.entrySet()) {
            System.out.print(e.getKey() + ": " + e.getValue() + " | ");
        }


    }
}
