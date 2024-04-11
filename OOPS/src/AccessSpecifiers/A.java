package AccessSpecifiers;

public class A {
    int num;
    String name;
    int [] arr;
    protected int roll;


    public A(int num , String name , int[] arr,int r)
    {
        this.num = num;
        this.name = name;
        this.arr = arr;
        this.roll = r;
    }

    int getNum()
    {
        return num;
    }
}
