package AccessSpecifiers;

public class Main {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,6};
        A obj = new A(90,"Jashan",arr,5);

        int a = obj.getNum();
        System.out.println(a);

    }
}
