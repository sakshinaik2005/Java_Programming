// Program to print each digit of a number separately.

class Logic
{
    void printDigits(int num)
    {
        int digit;
        System.out.println("Digits of " + num + " are:");

        int rev = 0;
        int temp = num;
        while (temp > 0)
        {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        while (rev > 0)
        {
            digit = rev % 10;
            System.out.println(digit);
            rev = rev / 10;
        }
    }
}

class Program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
