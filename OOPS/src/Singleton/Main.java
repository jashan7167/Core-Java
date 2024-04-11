package Singleton;

public class Main {
    public static void main(String[] args) {
         singleton obj1 = singleton.getInstance();
        singleton obj2= singleton.getInstance();
        singleton obj3= singleton.getInstance();

//all three ref pointing to the same object
    }
}
