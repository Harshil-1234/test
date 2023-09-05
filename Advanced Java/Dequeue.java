import java.util.ArrayDeque;

public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer>dq = new ArrayDeque<>();
        dq.add(6);
        dq.add(56);
        dq.add(9);
        dq.addFirst(100);

        //tells first element in the queue
        System.out.println(dq.getFirst());
        //tells the last element in the queue
        System.out.println(dq.getLast());
    }
}
