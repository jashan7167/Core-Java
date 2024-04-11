package Jashan;


public class human {
    int age;
    String name;
    int salary;
    boolean married;

   static long population;
    static void message() //it is not dependent on object of the class
    {
        System.out.println("Hello world");
        //System.out.println(this.age); this is a part of the class not the part of object so we cannot use this in here
    }
    public human(int age,String name,int salary,boolean married)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population+=1;

    }
}

