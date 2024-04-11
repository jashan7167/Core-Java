package Polymorphism;

public class Main {

    public static void main(String[] args) {
        Traingle t = new Traingle();
        Circle c = new Circle();
        Square s= new Square();
        Shapes a = new Square();
        a.area(); //using the superclass reference variable we are calling the Square method
        t.area();
    }


}
