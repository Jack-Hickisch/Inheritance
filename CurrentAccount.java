public class CurrentAccount extends Account
{
    private double overdraftLimit = 0;
    public CurrentAccount(int a, int o)
    {
        super(a);
        overdraftLimit = o;
    }

    public void addInterest()
    {
        bal += bal * interest;   
    }

    public void withdraw(double sum)
    {
	if (bal - sum > -1 * overdraftLimit)
	    bal-=sum;    
	else
	    System.err.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount. or you exeeded the overdraft limit");    
    }

    public double getOverdraft()
    {
        return overdraftLimit;
    }

    public void toString()
    {
        super().toString();
        System.out.print(" overdraft limit: " + overdraftLimit);
    }
}