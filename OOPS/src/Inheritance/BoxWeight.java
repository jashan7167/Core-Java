package Inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight()
    {
        this.weight = -1;
    }


    // @Override it wont override
    static void greeting()
    {
        System.out.println("Hey i am in Box class . Greetings !");
    }

    public BoxWeight(double l,double h, double w, double weight)
    {
        super(l,h,w); //all the Box class constructor
        System.out.println("Base Class Constructor");
        this.weight = weight;
    }


}
