// Find the factorial of number using a for loop

class Logic
{
    void findFactorial(int num)
    {
        int fact = 1;

        for(int icnt = 1; icnt <= num; icnt++)
        {
            fact = fact * icnt;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

class Program3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);  
    }
}
