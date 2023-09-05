import java.util.ArrayList;

public class ArrayinJava {
    public static void main(String[] args) {
        ArrayList<Integer>l1 = new ArrayList<>();
        // initial capacity -> intially created an empty array list of size 5
        ArrayList<Integer>l2 = new ArrayList<>(5);

        // add() -> inserts element in arraylist, arguments: (index,element) or (element);
        l1.add(6);
        l1.add(4);
        l1.add(7);
        l1.add(5);
        l1.add(6);
        l1.add(3,1);

        l2.add(10);
        l2.add(20);
        l2.add(30);
        //Concatenated elements of l2 in l1 
        l1.addAll(l2);

        // L1 ki minimum capacity 500 toh hogi hi hogi
        // l1.ensureCapacity(500);

        //Tells the presence of a particular element in the array list
        System.out.println("Does l1 contains 44? "+l1.contains(44));
        // Returns index of a particular element, first instance in case of duplicates
        System.out.println(l1.indexOf(7));

        // Updates value at a particular index
        l1.set(1, 99);

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" "); 
        }

    }
}
