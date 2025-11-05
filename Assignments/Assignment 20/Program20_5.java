// Program to find the smallest digit in a given number.

class Logic
{
    void findSmallestDigit(int num)
    {
        int smallest = 9; 
        int digit;

        while (num > 0)
        {
            digit = num % 10; 
            if (digit < smallest)
            {
                smallest = digit;
            }
            num = num / 10; 
        }

        System.out.println("Smallest digit is: " + smallest);
    }
}

class Program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872); 
    }
}
