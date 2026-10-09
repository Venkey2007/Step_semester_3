
package oops.assigment_problems.week9;

import java.util.Arrays;

public class MergeTokenQueues {

    public static int[] merge(int[] queue1, int[] queue2) {
        int m = queue1.length;
        int n = queue2.length;

        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (queue1[i] <= queue2[j]) {
                merged[k++] = queue1[i++];
            } else {
                merged[k++] = queue2[j++];
            }
        }

        while (i < m) {
            merged[k++] = queue1[i++];
        }

        while (j < n) {
            merged[k++] = queue2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] queue1 = {1, 3, 5, 7};
        int[] queue2 = {2, 3, 6, 8};

        int[] result = merge(queue1, queue2);

        System.out.println(Arrays.toString(result));
    }
}
