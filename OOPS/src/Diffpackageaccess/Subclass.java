package Diffpackageaccess;
import AccessSpecifiers.A;


public class Subclass extends A {
    public Subclass(int num, String name, int[] arr,int r) {
        super(num,name,arr,r);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        Subclass obj = new Subclass(12,"Jashan",arr,211);
        System.out.println(obj.roll); //hence we are able to access the protected variable in the different package subclass

    }
}
