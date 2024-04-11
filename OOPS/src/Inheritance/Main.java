package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4.4,7.9,9.9);
       BoxWeight box2  = new BoxWeight(2,3,4,75);
        System.out.println(box.l + " " + box.h + box.w);
        System.out.println(box2.l + " " + box2.h + box2.w + " " + box2.weight);

        Box box3 = new BoxWeight(2,5,6,9);
        System.out.println(box3.l);
        //there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type
        //hence you should have access to weight variable
        //this also means the ones you are trying to access should be initialised
        //but here,when the obj itself is of child class and you call the constructor of the parent class
        //hence error
       // BoxWeight box6 = new Box(2,3,4);
//        System.out.println(box6);
        Box box4 = new BoxWeight();
        Box.greeting();  // we were trying to override a static method

    }




}
