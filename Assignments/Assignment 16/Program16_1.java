//Sum of first N natural numbers
class Logic
{
    void calculateSum(int n)
    {
        int sum = 0;
        for(int icnt = 1; icnt <= n; icnt++)
        {
            sum = sum + icnt;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);   
    }
}
