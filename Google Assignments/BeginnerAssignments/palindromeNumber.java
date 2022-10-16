//Palindrome number

class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,y,z=x;
        if(x<0)
        {
            return false;
        }
        while(x>0)
        {
            y=x%10;                     
            rev=rev*10+y;
            x=x/10;
        }
        if(rev==z)
        {
            return true;
        }
        else {
            return false;
        }
        
    }
}


