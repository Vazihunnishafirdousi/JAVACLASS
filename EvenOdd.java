
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int[] arr=new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                even++;
            else {
                odd++;
            }
        }

        System.out.println("Even: " + even + ", Odd: " + odd);
        sc.close();  // optional
    }
}