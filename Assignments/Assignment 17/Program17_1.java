// Program to find the sum of digit of a number

class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        int original = num;

        while(num != 0)
        {
            int digit = num % 10;  
            sum = sum + digit;     
            num = num / 10;        
        }

        System.out.println("Sum of digits of " + original + " is: " + sum);
    }
}

class Program1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234); 
    }
}
