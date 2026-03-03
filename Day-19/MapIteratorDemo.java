import java.util.*;

class MapIteratorDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}