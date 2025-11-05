// program to check a number is a perfect number or not.

class Logic
{
    void checkPerfect(int num)
    {
        int sum = 0;

        for (int icnt = 1; icnt <= num / 2; icnt++)
        {
            if (num % icnt == 0)
            {
                sum += icnt;
            }
        }

        if (sum == num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is not a Perfect Number");
    }
}

class Program3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6); 
    }
}
