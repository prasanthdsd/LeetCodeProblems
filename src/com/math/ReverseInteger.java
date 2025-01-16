package com.math;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1463847412;
        int res = reverse(x);
        System.out.println(res);
    }

    public static int reverse(int x) {
       int rev = 0;
       int pop = 0;
       while (x != 0) {
           pop = x % 10;
           x = x / 10;
           //check the overflow before calculating ,
           //this make the difference when compared to checking 'x' with the MAX and MIN values
           if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MIN_VALUE / 10 && pop > 7) {
               return 0;
           }
           if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && pop < -8) {
               return 0;
           }
           rev = rev * 10 + pop;
       }
       return rev;
    }
}
