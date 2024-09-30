import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur");
        map1.put(1234, "Ivan");
        map1.put(5678, "Sveta");
        map1.put(7643, "Nikolay");
        map1.putIfAbsent(1010, null);
        System.out.println(map1);

        System.out.println(map1.values());
        System.out.println(map1.keySet());
        map1.remove(1234);
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.containsValue("Sveta"));
        System.out.println(map1.get(1010));
    }
}