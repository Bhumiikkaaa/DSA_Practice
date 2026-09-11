/*You are given three integers: n, m, and k. Define a function F(i) as follows:
• For i = 0, 1, 2, . . . , k: F(i) = i
• For i > k: F(i) = (F(i − 1) + F(i − k)) mod m
Given n, m, and k, compute F(n).
Input Format
A single line containing three space-separated integers: n m k
Output Format
A single integer: F(n) mod m
Examples
Input      Output
5 1000 2    8
10 7 3      6
0 100 5     0
3 100 5     3
6 100 3     9
Explanation of Examples
Example 1: n = 5, m = 1000, k = 2
F(0) = 0
F(1) = 1
F(2) = 2
F(3) = F(2) + F(1) = 2 + 1 = 3
F(4) = F(3) + F(2) = 3 + 2 = 5
F(5) = F(4) + F(3) = 5 + 3 = 8
Thus, F(5) = 8.
  
Example 2: n = 10, m = 7, k = 3
F(0) = 0, F(1) = 1, F(2) = 2, F(3) = 3
F(4) = F(3) + F(1) = 3 + 1 = 4 (mod 7)
F(5) = F(4) + F(2) = 4 + 2 = 6 (mod 7)
F(6) = F(5) + F(3) = 6 + 3 = 9 ≡ 2 (mod 7)
F(7) = F(6) + F(4) = 2 + 4 = 6 (mod 7)
F(8) = F(7) + F(5) = 6 + 6 = 12 ≡ 5 (mod 7)
F(9) = F(8) + F(6) = 5 + 2 = 7 ≡ 0 (mod 7)
F(10) = F(9) + F(7) = 0 + 6 = 6 (mod 7)
Thus, F(10) = 6.

Example 3: n = 0, m = 100, k = 5
Since n = 0 ≤ k, F(0) = 0.
  
Example 4: n = 3, m = 100, k = 5
Since n = 3 ≤ k, F(3) = 3.
  
Example 5: n = 6, m = 100, k = 3
F(0) = 0, F(1) = 1, F(2) = 2, F(3) = 3
F(4) = F(3) + F(1) = 3 + 1 = 4
F(5) = F(4) + F(2) = 4 + 2 = 6
F(6) = F(5) + F(3) = 6 + 3 = 9
Thus, F(6) = 9.
  
Constraints
• 0 ≤ n ≤ 10^18
• 1 < m ≤ 10^5
• 0 < k < 100 */

import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long ans = f(n,m,k);
        System.out.println(ans);
    }
    public static long f(long n, int m, int k){
        if(n<=k){
            return n;
        }
        return (f(n-1,m,k)+f(n-k,m,k))%m;
    }
}
