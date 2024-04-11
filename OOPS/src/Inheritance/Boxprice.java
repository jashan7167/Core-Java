package Inheritance;

public class Boxprice extends BoxWeight {
    double price;
    public Boxprice(double l,double h, double w, double weight,double price)
    {
        super(l,h,w,weight); //call the Boxweight constructor
        System.out.println("Base Class Constructor");
        this.price = price;
    }
}
