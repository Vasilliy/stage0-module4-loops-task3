package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int remainder = first % second;
        while (remainder != 0) {
            first = second;
            second = remainder;
            remainder = first % second;
        }
        System.out.println(second);
    }
}
