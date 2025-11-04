//Program to reverse a number

class Logic
{
    void reverseNumber(int num)
    {
        int reversed = 0;
        int original = num;

        while(num != 0)
        {
            int digit = num % 10;      
            reversed = reversed + digit; 
            reversed = reversed * 10;  
            num = num / 10;            
        }
        reversed = reversed / 10;     

        System.out.println("Reverse of " + original + " is: " + reversed);
    }
}

class Program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234); 
    }
}
