
package class_problems.week10;

import java.util.Arrays;

public class PairWithTargetSumSorted {

    public static boolean hasPairWithSum(int[] nums, int target) {

        int[] arr = nums.clone();

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};

        int target1 = 9;

        System.out.println(hasPairWithSum(nums1, target1));

        int[] nums2 = {3, 4, 6};

        int target2 = 20;

        System.out.println(hasPairWithSum(nums2, target2));
    }
}

