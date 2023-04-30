package structure;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");

        System.out.println(map.get("key1"));
    }
}
