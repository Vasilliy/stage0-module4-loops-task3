package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0, b = 1, t;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(a);
            t = a;
            a = b;
            b = t + b;
        }
    }
}