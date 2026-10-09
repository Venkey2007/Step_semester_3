
package oops.assigment_problems.week9;

public class ClassTopperFinder {

    public static int[] findTopper(int[][] marks) {
        int topperIndex = 0;
        int highestTotal = 0;

        for (int i = 0; i < marks.length; i++) {
            int total = 0;

            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }

            if (i == 0 || total > highestTotal) {
                highestTotal = total;
                topperIndex = i;
            }
        }

        return new int[] {topperIndex, highestTotal};
    }

    public static void main(String[] args) {
        int[][] marks = {
            {80, 75, 90},
            {85, 95, 88},
            {70, 80, 85},
            {85, 95, 88}
        };

        int[] result = findTopper(marks);

        System.out.println("Topper Row Index: " + result[0]);
        System.out.println("Highest Total: " + result[1]);
    }
}

