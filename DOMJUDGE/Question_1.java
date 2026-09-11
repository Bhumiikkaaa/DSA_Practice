/* Sum of Digits

Problem Statement
Given a non-negative integer N, calculate the sum of all its digits.

Input
The input contains one non-negative integer N.

Output
Print a single integer representing the sum of all digits of N.

Constraints
0 <= N <= 10^18

Sample Input
5823

Sample Output
18

Explanation
The digits of 5823 are 5, 8, 2, and 3. Their sum is 18.
*/
import java.util.Scanner;
public class Question_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = 0;
        while(n!=0){
            m = m + n%10;
            n = n/10;
        }
        System.out.println(m);
    }
}
