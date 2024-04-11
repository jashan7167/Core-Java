package Inheritance;

public class Box {
    double l;
    double h;
    double w;
    Box()
    {
        super(); // Object class
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    //cube
    Box(double side)
    {
        this.h = side;
        this.l = side;
        this.w =side;
    }
    Box(double l ,double h , double w)
    {
        System.out.println("Parent Class Constructor");
        this.h = l;
        this.l =h;
        this.w =w;
    }
    Box(Box old)
    {
        this.h = old.h;
        this.l =old.l;
        this.w =old.w;
    }

    static void greeting()
    {
        System.out.println("Hey i am in Box class");
    }
   public void information()
   {
       System.out.println("Running the Box");
   }


}
