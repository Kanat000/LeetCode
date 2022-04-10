package Easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        List<Long> arr = new ArrayList<>(2);
        long a;
        long t = 1;
        int reverseNum = 0;
        while(x%t != x){
            a = x/t - (x/(t*10))*10;
            arr.add(a);
            t *= 10;
        }

        for (Long integer : arr) {
            t = t / 10;
            reverseNum += t * integer;
        }

        return reverseNum == x;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1000000));
    }
}
