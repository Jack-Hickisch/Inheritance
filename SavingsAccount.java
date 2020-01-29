public class SavingsAccount extends Account
{
    private double interest = 0;

    public SavingsAccount(int a, double i)
    {
        super(a);
        interest = i;
    }

    public void addInterest()
    {
        bal += bal * interest;   
    }

    public void toString()
    {
        super().toString();
        System.out.print(" interest: " + interest);
    }
}