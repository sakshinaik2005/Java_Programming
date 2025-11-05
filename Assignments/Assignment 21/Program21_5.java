// Program to print numbers from 1 to N that are divisible by both 2 and 3.

class Logic
{
    void printDivisibleBy2and3(int n)
    {
        System.out.println("Numbers between 1 and " + n + " divisible by both 2 and 3 are:");

        for (int icnt = 1; icnt <= n; icnt++)
        {
            if (icnt % 2 == 0 && icnt % 3 == 0)
            {
                System.out.print(icnt + " ");
            }
        }
    }
}

class Program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}
