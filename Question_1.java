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
