import java.util.*;

class CollectionDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);

    }
}