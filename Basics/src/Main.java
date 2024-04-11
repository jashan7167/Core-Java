public class Main{
    public static void main(String[] args) {
        Animal a = new Cat();
        a.makesound();
        Employee e = new HRManager(100000);
        e.work();
        Backaccount  b = new SavingsAccount(99);
        System.out.println(b.withdraw(10));
    }

}
