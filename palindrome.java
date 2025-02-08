import java.util.*;
class palindrome 
{
    public boolean isPalindrome(int x)
     {  int rev=0;
        int num=x;
        while(x>0)
        {
            int r=x%10;
            rev=rev*10+r;
            x=x/10;

        }
        if(rev==num)
       {
        return true;
       }
       else
       {
        return false;
       }
     }

        public void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            int x= sc.nextInt();
            isPalindrome(x);

        
        sc.close();
    }}
