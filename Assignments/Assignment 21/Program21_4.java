class Logic
{
    void countFactors(int num)
    {
        int count = 0;

        for (int icnt = 1; icnt <= num; icnt++)
        {
            if (num % icnt == 0)
            {
                count++;
            }
        }

        System.out.println("Total number of factors of " + num + " = " + count);
    }
}

class Program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}
