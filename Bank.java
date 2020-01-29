public class Bank
{
    public static void main (String args[])
    {
        Account[] accounts = new Account[3];
        accounts[0] = new Account(0001);
        accounts[1] = new SavingsAccount(0002, 0.04);
        accounts[2] = new CurrentAccount(0003, 500);

        accounts[0].deposit(1000);
        accounts[1].deposit(1000);
        accounts[2].deposit(1000);

        accounts[0].withdraw(300);
        accounts[1].withdraw(300);
        accounts[2].withdraw(1200);

        accounts[0].toString();
        accounts[1].toString();
        accounts[2].toString();
        update(accounts);
    }

    public static void update(Account[] accounts)
    {
        for (Account account : accounts)
        {
            if (account instanceof SavingsAccount)
            {
                account.addInterest();
            }
            else if (account instanceof CurrentAccount)
            {
                // we dont know how to send letters
            }
        }
    }
}