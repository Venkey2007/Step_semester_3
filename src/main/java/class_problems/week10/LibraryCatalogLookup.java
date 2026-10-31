
package class_problems.week10;

public class LibraryCatalogLookup {

    public static String findBook(String[][] catalog, String targetIsbn) {

        int low = 0;
        int high = catalog.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int result = catalog[mid][0].compareTo(targetIsbn);

            if (result == 0) {
                return catalog[mid][1];
            }
            else if (result < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[][] catalog = {
            {"0001112223", "Introduction to Algebra"},
            {"0002223334", "Beginning Python"},
            {"0003334445", "Classic Mythology"},
            {"0004445556", "Data and Society"},
            {"0005556667", "European History"}
        };

        String targetIsbn = "0003334445";

        System.out.println(findBook(catalog, targetIsbn));

        String missingIsbn = "0009998887";

        System.out.println(findBook(catalog, missingIsbn));
    }
}

