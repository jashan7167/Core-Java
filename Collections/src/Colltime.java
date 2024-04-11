import java.util.ArrayList;
import java.util.Vector;

public class Colltime {
    public static void main(String[] args) {
        int size = 1000000;

        ArrayList<Integer> al = new ArrayList<Integer>();

        long startTime = System.currentTimeMillis();

        for(int i = 0 ; i<size; i++)
        {
            al.add(i);
        }
        long addTime = System.currentTimeMillis() - startTime;

        System.out.println("ArrayList add time: " +  addTime);

        startTime = System.currentTimeMillis();

        for(int i = 0 ; i<size ; i++)
        {
            al.get(i);
        }

        long retTime = System.currentTimeMillis() - startTime;

        System.out.println("ArrayList retrievel time " + retTime);

        startTime = System.currentTimeMillis();
        for(int i = 0 ; i < size ; i++)
        {
            al.remove(al.size() - 1);
        }

        long delTime = System.currentTimeMillis() - startTime;

        System.out.println("ArrayList delete time " + delTime);

        Vector v = new Vector<>();

        startTime = System.currentTimeMillis();

        for(int i = 0 ; i < size ; i ++)
        {
            v.add(i);
        }
        long vaddTime = System.currentTimeMillis() - startTime;
        System.out.println("Vector add time:" + vaddTime);
        startTime = System.currentTimeMillis();

        for(int i = 0 ; i < size ; i ++)
        {
            v.get(i);
        }
        long vgetTime = System.currentTimeMillis() - startTime;
        System.out.println("Vector retrievel time:" + vgetTime);

        startTime = System.currentTimeMillis();

        for(int i = 0 ; i < size ; i ++)
        {
            v.remove(v.size() - 1);
        }
        long vremTime = System.currentTimeMillis() - startTime;
        System.out.println("Vector removal time:" + vremTime);

    }


}
