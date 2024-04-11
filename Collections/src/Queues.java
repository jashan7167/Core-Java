import java.util.Iterator;
import java.util.PriorityQueue;

public class Queues {
    public static void main(String[] args) {
        PriorityQueue<String> ob = new PriorityQueue<String>();

        ob.add("Jashan");
        ob.add("Sehaj");
        ob.add("Divyanshu");
        ob.add("Shashwat");
        ob.add("Rohan");

        System.out.println("head" + ob.element());
        System.out.println("head" + ob.peek());
        System.out.println("Iterating the elements");
        Iterator itr = ob.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        ob.remove();
        ob.poll();
        System.out.println("After Removing Two Elements");
        Iterator itr2 = ob.iterator();

        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }

    }
}
