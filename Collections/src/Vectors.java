import java.util.*;
public class Vectors {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>(4,2);
        vec.add("Jashan");
        vec.add("Sehaj");
        vec.add("Divyanshu");
        vec.add("Shashwat");
        vec.add("CGHUM");


        System.out.println("Size" + vec.size());
        System.out.println("Last Index Shashwat: " + vec.lastIndexOf("Shashwat"));
        System.out.println("Default capacity " + vec.capacity());
        System.out.println(vec.contains("Sehaj"));
        System.out.println(vec.clone());

        //
        System.out.println("Vector elements is " + vec);

        //using add element method
        vec.addElement("Archit");
        vec.addElement("Fateh");
        vec.addElement("Meet");
        vec.addElement("Lakshay");

        System.out.println("Size after addition" + vec.size());
        System.out.println("Capacity after addition " + vec.capacity());

        System.out.println("Elements are " + vec);

        System.out.println("Last Element : " + vec.lastElement());

        System.out.println("First Element " + vec.firstElement());



    }
}
