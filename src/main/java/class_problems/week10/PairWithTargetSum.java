
package class_problems.week10;

import java.util.HashSet;

public class PairWithTargetSum {

    public static boolean hasPairWithSum(int[] nums, int target) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {

            int complement = target - num;

            if (seen.contains(complement)) {
                return true;
            }

            seen.add(num);
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

