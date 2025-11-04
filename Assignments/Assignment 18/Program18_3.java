// Program to print all odd numbers up to N.

class Logic
{
    void printOddNumbers(int n)
    {
        for (int icnt = 1; icnt <= n; icnt++)
        {
            if (icnt % 2 != 0)   
            {
                System.out.println(icnt);
            }
        }
    }
}

class Program3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20); 
    }
}
