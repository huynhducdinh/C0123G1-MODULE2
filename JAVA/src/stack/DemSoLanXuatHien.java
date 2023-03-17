package stack;

import java.util.HashMap;
import java.util.Map;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String str = "Hello";
        String[] arrstr = str.split("");
        Map<String, Integer> map = new HashMap<>();

        for (String s : arrstr) {
            if (map.containsKey(s)) {
                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            } else {
                map.put(s, 1);
            }
            System.out.println(s.toLowerCase());

        }
        System.out.println(map.toString());


    }
}
