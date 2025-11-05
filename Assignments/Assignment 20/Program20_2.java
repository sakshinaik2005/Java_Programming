// Program to print numbers from N down to 1 in reverse order.

class Logic
{
    void printReverse(int n)
    {
        for (int icnt = n; icnt >= 1; icnt--)
        {
            System.out.print(icnt + " ");
        }
    }
}

class Program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10); 
    }
}
