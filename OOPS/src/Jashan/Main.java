package Jashan;

public class Main {
    public static void main(String[] args) {
        human jashan = new human(21, "Jashan", 10000, false);
        human hargun = new human(20, "Hargun", 10000, false);
        System.out.println(jashan.name);
        System.out.println(human.population);

        //we cannot use this as it is non static and we cant access it
        // greeting();
        Main obj = new Main();
        obj.greeting(); //now we can access it as we have created an instance of main class
        Main fun = new Main();
        fun.fun2(); //greeting using fun2 object to run

    }
    void greeting()
    {
        System.out.println("Hello");
    }
    void fun2()
    {
        greeting();
    }

}
