// Program to print multiplication table of a number.

class Logic
{
    void printTable(int num)
    {
        for(int icnt = 1; icnt <= 10; icnt++)
        {
            System.out.println(num + " x " + icnt + " = " + (num * icnt));
        }
    }
}

class Program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);  
    }
}
