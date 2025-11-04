//Program to print even number up to N.

class Logic
{
    void printEvenNumbers(int n)
    {
        for(int icnt = 1; icnt <= n; icnt++)
        {
            if(icnt % 2 == 0)  
            {
                System.out.println(icnt);
            }
        }
    }
}

class Program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20); 
    }
}
