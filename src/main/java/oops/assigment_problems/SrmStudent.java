public class SrmStudent {

    private static String collegeName;
    private static String academicYear;

    private String name;

    static {
        collegeName = "SRM";
        academicYear = "2026-2027";

        System.out.println("College info loaded");
    }

    public SrmStudent(String name) {
        this.name = name;
    }

    public void printConfirmation() {
        System.out.println(
            "Student record created: " + name
        );
    }

    public static void main(String[] args) {

        String[] names = {
            "Ravi",
            "Meera",
            "Karthik",
            "Divya",
            "Anitha"
        };

        for (int i = 0; i < names.length; i++) {

            SrmStudent student =
                new SrmStudent(names[i]);

            student.printConfirmation();
        }
    }
}