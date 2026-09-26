package oops.class_problems;

public class MembershipTreeAnalyzer {

    public static String classifyGeneration(LibraryMember member) {

        if (member instanceof HonorsStudentMember) {
            return "Multilevel descendant (3 generations deep)";
        }

        if (member instanceof FacultyMember) {
            return "Hierarchical sibling (independent branch)";
        }

        if (member instanceof StudentMember) {
            return "Student branch";
        }

        return "General member";
    }

    public static int getTotalBooksBorrowed(LibraryMember[] members) {

        int total = 0;

        if (members != null) {
            for (LibraryMember member : members) {
                if (member != null) {
                    total += member.getBooksBorrowed();
                }
            }
        }

        return total;
    }
}