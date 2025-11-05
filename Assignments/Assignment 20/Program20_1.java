// Program to find the sum of all even numbers up to N.

class Logic
{
    void sumEvenNumbers(int n)
    {
        int sum = 0;
        for (int icnt = 2; icnt <= n; icnt += 2)
        {
            sum += icnt;
        }
        System.out.println("Sum of even numbers up to " + n + " is: " + sum);
    }
}

class Program1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10); 
    }
}
