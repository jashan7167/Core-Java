package AbstractClass;

public class Daughter extends Parent{

    Daughter(int age)
    {
        super(age);
    }
    void normal()
    {
        System.out.println("This is a normal method");
    }

    @Override
    void career()
    {
        System.out.println("I am going to be a Coder");
    }
}
