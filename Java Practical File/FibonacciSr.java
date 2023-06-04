import java.util.Scanner;
public class FibonacciSr{
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print Fibonacci series: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
