
package oops.assigment_problems.week9;

public class TicketPriceSlotFinder {

    public static int findPriceSlot(int[] prices, int target) {
        int left = 0;
        int right = prices.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (prices[mid] == target) {
                return mid;
            } else if (prices[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] prices = {100, 200, 300, 400, 500};

        System.out.println("Index of 300: "
                + findPriceSlot(prices, 300));

        System.out.println("Insertion index for 350: "
                + findPriceSlot(prices, 350));
    }
}

