/* Given a positive integer N (1 ≤ N < 10^18), reverse its decimal digits and
output the reversed integer without leading zeros.
Input: A single integer N.
Output: The reversed integer.
Examples:
Input: 12345 → Output: 54321
Input: 1000 → Output: 1
Input: 987654321 → Output: 123456789
Constraints: 1 ≤ N < 10^18 */

import java.util.*;
public class Question_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = n;
        long m = 0;
        while(x%10 == 0){
            x = x/10;
        }
        while(x!=0){
            m = m*10 + x%10;
            x = x/10;
        }
        System.out.println(m);
    }
}
