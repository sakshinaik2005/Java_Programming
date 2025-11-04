// Program to find the maximum of two numbers.

class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a + " is greater than " + b);
        }
        else if(b > a)
        {
            System.out.println(b + " is greater than " + a);
        }
        else
        {
            System.out.println(a + " and " + b + " are equal");
        }
    }
}

class Program3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);  
    }
}
