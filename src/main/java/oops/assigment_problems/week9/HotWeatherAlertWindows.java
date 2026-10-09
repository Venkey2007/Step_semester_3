
package oops.assigment_problems.week9;

public class HotWeatherAlertWindows {

    public static int countHotWindows(int[] temperatures, int k, int threshold) {
        if (k <= 0 || k > temperatures.length) {
            return 0;
        }

        int windowSum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            windowSum += temperatures[i];
        }

        if (windowSum >= k * threshold) {
            count++;
        }

        for (int i = k; i < temperatures.length; i++) {
            windowSum += temperatures[i] - temperatures[i - k];

            if (windowSum >= k * threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] temperatures = {30, 32, 35, 28, 36, 40, 31};
        int k = 3;
        int threshold = 33;

        System.out.println("Hot Windows: "
                + countHotWindows(temperatures, k, threshold));
    }
}

