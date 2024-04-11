import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> ob = new LinkedList<String>();

        ob.add("Jashan");
        ob.add("Sehaj");
        ob.add("Shashwat");
        ob.add("Divyanshu");
        ob.add("Rohan");
        System.out.println(ob.contains("Jashan"));
        System.out.println(ob.lastIndexOf("Shashwat"));
        System.out.println(ob.size());
        System.out.println(ob.clone());
        System.out.println(ob.lastIndexOf("Divyanshu"));
        Iterator a  = ob.iterator();

        while(a.hasNext())
        {
            System.out.println(a.next());
        }
    }
}
