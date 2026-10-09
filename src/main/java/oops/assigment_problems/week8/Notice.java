
package oops.assigment_problems.week8;

import java.util.HashSet;
import java.util.Set;

public class Notice {

    private String title;
    private Set<String> targetDepartments;

    public Notice(String title, Set<String> targetDepartments) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Notice title cannot be empty."
            );
        }

        if (targetDepartments == null || targetDepartments.isEmpty()) {
            throw new IllegalArgumentException(
                "At least one target department is required."
            );
        }

        this.title = title;
        this.targetDepartments = new HashSet<>(targetDepartments);
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getTargetDepartments() {
        return new HashSet<>(targetDepartments);
    }

    public boolean targetsDepartment(String department) {
        return targetDepartments.contains(department);
    }
}

