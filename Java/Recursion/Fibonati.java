package Java.Recursion;

public class Fibonati {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Fibonati f = new Fibonati();
        for (int i = 0; i < 20; i++) {
            System.out.print(f.fib(i) + " ,");
        }
    }
}
