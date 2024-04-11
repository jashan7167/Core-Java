package Polymorphism;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num)
    {
        this.num = num;
    }
    public String toString()
    {
        return "ObjectPrint: " + num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj); //this calls the object class to string method we can also override the object class tostring method
    }

}
