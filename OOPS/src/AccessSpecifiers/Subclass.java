package AccessSpecifiers;

public class Subclass extends A{
    public Subclass(int num, String name, int[] arr,int r) {
        super(num, name, arr,r);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        Subclass obj = new Subclass(90,"Jashan",arr,217);
        System.out.println(obj.roll); //hence we can access the protected var in subclass same package
    }

}
