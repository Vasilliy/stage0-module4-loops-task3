package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String nine = "";
        int sum = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            nine += "9";
            sum += (Integer.parseInt(nine));
        }
        System.out.println(sum);
    }
}