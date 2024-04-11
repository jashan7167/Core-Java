public class SavingsAccount extends Backaccount{
    SavingsAccount(int balance)
    {
        super(balance);
    }
    @Override
    int withdraw(int w)
    {
        if(balance<100)
        {
            System.out.println("Balance low");
        }
        else
        {
            balance = balance - w;
        }
        return balance;
    }

}
