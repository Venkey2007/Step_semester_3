
package oops.assigment_problems.week9;

import java.util.HashMap;
import java.util.Map;

public class MostPopularCanteenOrder {

    public static int findMostPopular(int[] orders) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int order : orders) {
            frequency.put(order, frequency.getOrDefault(order, 0) + 1);
        }

        int popularOrder = orders[0];
        int highestFrequency = frequency.get(popularOrder);

        for (int order : orders) {
            int count = frequency.get(order);

            if (count > highestFrequency) {
                highestFrequency = count;
                popularOrder = order;
            }
        }

        return popularOrder;
    }

    public static void main(String[] args) {
        int[] orders = {101, 102, 101, 103, 102, 101, 102};

        System.out.println("Most Popular Order: " + findMostPopular(orders));
    }
}

