public class Backaccount {
    int balance;
    Backaccount()
    {}


    Backaccount(int balance)
    {
        this.balance = balance;
    }
    void deposit(int c)
    {
        balance = balance + c;
    }
    int withdraw(int w)
    {
        balance = balance -w;
        return balance;
    }

}
