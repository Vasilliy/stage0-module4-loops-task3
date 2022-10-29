package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String s = String.valueOf(t);
        int sum = 0;
        for (int i = 1; i < s.length() + 1; i++) {
            int rank = 1;
            for (int j = 1; j < i; j++) {
                rank *= 10;
            }
            int number = t % (rank * 10) / rank;
            sum += number;
        }
        System.out.println(t >= 0 ? sum : -sum);
    }
}