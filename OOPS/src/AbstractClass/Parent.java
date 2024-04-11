package AbstractClass;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello()
    {
        System.out.println("Hello bachooo");
    }

    abstract void career(); //abstract methods no body only decleration



}
