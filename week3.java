import java.util.Scanner;

public class week3 {
    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void primes(int n) {
        // if (n < 2)
        //     return false;
        // if (n == 2)
        //     return true;
        // if (n % 2 == 0)
        //     return false;
        // for (int i = 3; i <= (n - 1); i += 2) {
        //     if (n % i == 0) {
        //         return false;
        //     }
        // }
        // return true;
        // boolean[] check = new boolean[N + 1];

        // for (int i = 2; i <= N; i++) {
        //     check[i] = true;
        // }

        // for (int i = 2; i <= N; i++) {
        //     if (check[i] == true) {
        //         for (int j = 2 * i; j <= N; j += i) {
        //             check[j] = false;
        //         }
        //     }
        // }
        // for (int i = 2; i <= N; i++) {
        //     if (check[i] == true) {
        //         System.out.print(i + " ");
        //     }
        // }
        if(n < 2) return;
        boolean[] marked = new boolean[n+1];
        double sqrt = Math.sqrt(n);

        for (int i=2; i<=sqrt; i++){
            if (!marked[i]) {
                for (int j=i*i; j<=n; j+=i){
                    marked[j] = true;
                }
            }
        }

        for (int i=2; i<=n; i++){
            if (!marked[i]) {
                System.out.println(i+" ");
            }
        }
    }

    //fibonacci
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    System.out.print(fibonacci(n));
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // int y = sc.nextInt();
    // sc.close();
    // System.out.println(gcd (x, y));
    // }

    // primes
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     sc.close();
    //     week3.primes(N);
    //     // for (int i = 1; i < N; i++) {
    //     //     if (primes(i))
    //     //         System.out.print(i + " ");
    //     // }

    // }
}

