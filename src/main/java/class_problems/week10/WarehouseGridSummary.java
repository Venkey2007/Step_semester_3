
package class_problems.week10;

public class WarehouseGridSummary {

    public static int[] warehouseSummary(int[][] grid) {

        int totalItems = 0;
        int maxItems = -1;

        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {

                totalItems = totalItems + grid[i][j];

                if (grid[i][j] > maxItems) {

                    maxItems = grid[i][j];

                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new int[]{totalItems, maxRow, maxCol};
    }

    public static void main(String[] args) {

        int[][] grid = {
            {4, 9, 2},
            {7, 1, 6},
            {3, 12, 5}
        };

        int[] result = warehouseSummary(grid);

        System.out.println("(" + result[0] + ", (" 
                           + result[1] + ", " + result[2] + "))");
    }
}

