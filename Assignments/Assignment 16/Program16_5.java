//  Count  the number of digits in a given number

class Logic
{
    void countDigits(int num)
    {
        int count = 0;
        int original = num;

        if(num == 0)
        {
            count = 1;
        }
        else
        {
            while(num != 0)
            {
                num = num / 10; 
                count++;
            }
        }

        System.out.println("Number of digits in " + original + " is: " + count);
    }
}

class Program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865); 
    }
}
