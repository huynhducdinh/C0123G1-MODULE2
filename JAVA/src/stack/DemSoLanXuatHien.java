package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String str = "Hello hi HeLLO";
        System.out.println("trước khi thay dỗi: "+ str);
        str=str.toLowerCase();
        String[] arrstr = str.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String s : arrstr) {
            if (map.containsKey(s)) {
                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println("Sau khi thay đổi :"+map.toString());
    }
}
