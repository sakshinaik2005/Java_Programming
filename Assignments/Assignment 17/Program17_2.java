// Program to check given number is palindrome or not.

class Logic
{
    void checkPalindrome(int num)
    {
        int original = num;
        int reversed = 0;

        while(num != 0)
        {
            int digit = num % 10;   
            reversed = reversed * 10 + digit; 
            num = num / 10;  
        }

        if(original == reversed)
        {
            System.out.println(original + " is a Palindrome number.");
        }
        else
        {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }
}

class Program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121); 
    }
}
