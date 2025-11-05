// Program to count how many even numbers are present between 1 to N.

class Logic
{
    void countEvenOddRange(int n)
    {
        int evenCount = 0;
        int oddCount = 0;

        for (int icnt = 1; icnt <= n; icnt++)
        {
            if (icnt % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Total even numbers between 1 and " + n + " = " + evenCount);
        System.out.println("Total odd numbers between 1 and " + n + " = " + oddCount);
    }
}

class Program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}
