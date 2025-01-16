package com.math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        boolean isPalindrome = isPalindrome(number);
        boolean res = isPalindromeWithStore(number);
        System.out.println(isPalindrome + ","+ res);
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return n == reverse;
    }

    public static boolean isPalindromeWithStore(int x) {
        if (x < 0) {
            return false;
        }
        int len = countDigit(x);
        int[] store = new int[len];
        int count = 0;

        while(x!=0)
        {
            int n = x%10;
            store[count] = n ;
            count++;
            x = x/10;
        }
        int i =0 ;
        int j = len-1;
        while(i<=j)
        {
            if(store[i] != store[j])
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
    public static int countDigit(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int count = 0;
        while(n!=0)
        {
            n = n/10;
            count++;
        }
        return count;
    }
}
