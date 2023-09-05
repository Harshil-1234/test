import java.util.HashSet;

public class HashSetinJava {
    public static void main(String[] args) {
        // Can provide initial capacity
        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(10);
        myHashSet.add(12);
        myHashSet.add(12);

        System.out.println(myHashSet);

    }    
}
