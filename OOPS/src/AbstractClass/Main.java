package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Son a = new Son(21);
        a.career();
        a.normal();
        Daughter daughter = new Daughter(22);
        daughter.normal();

        daughter.career();

     //   Parent mom = new Parent(); cannot create objects of the abstract class
        //hence we can create static methods of abstract classes
        Parent.hello();
    }
}
