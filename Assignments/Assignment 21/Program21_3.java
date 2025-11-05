// Program to display all factors of a given numbers.

class Logic
{
    void displayFactors(int num)
    {
        System.out.println("Factors of " + num + " are:");

        for (int icnt = 1; icnt <= num; icnt++)
        {
            if (num % icnt == 0)
            {
                System.out.print(icnt + " ");
            }
        }
    }
}

class Program3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
