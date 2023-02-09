package codingtest.leetcode.PalindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome1(int x) {
        if(x < 0) return false;
        String s = Integer.toString(x);
        StringBuffer sb = new StringBuffer(s);
        String reversedStr = sb.reverse().toString();
        if(s.equals(reversedStr)) return true;
        return false;
    }
    public boolean isPalindrome2(int x) {
        if(x < 0) return false;
        int reverse=0;
        int temp=x;
        while(temp!=0){
            reverse = reverse*10 + temp%10;
            temp /= 10;
        }
        return reverse == x;
    }
}
