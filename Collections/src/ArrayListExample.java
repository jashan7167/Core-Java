import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList ob = new ArrayList(5);

        ob.add("Jashan");
        ob.add("Sehaj");
        ob.add("Shashwat");
        ob.add("Divyanshu");
        ob.add("Rohan");

        Iterator a  = ob.iterator();
        System.out.println(ob.contains("Jashan"));
        System.out.println(ob.indexOf("Sehaj"));
        System.out.println(ob.clone());
        System.out.println(ob.size());
        System.out.println(ob.lastIndexOf("Divyanshu"));
        while(a.hasNext())
        {
            System.out.println(a.next());
        }
    }
}
