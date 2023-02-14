package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = first;
        if (first < second || first < third) {
            max = second >= third ? second : third;
        }
        System.out.println(max);
    }
}
