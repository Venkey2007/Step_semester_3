
package oops.assigment_problems.week8;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String name;
    private Set<String> preferredChannels;

    public Student(String name) {
        this.name = name;
        this.preferredChannels = new HashSet<>();
    }

    public Student(String name, String department, Set<String> preferredChannels) {
        this.name = name;
        this.department = department;
        this.preferredChannels = new HashSet<>(preferredChannels);
    }

    private String department;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Set<String> getPreferredChannels() {
        return new HashSet<>(preferredChannels);
    }

    public void addPreferredChannel(String channel) {
        preferredChannels.add(channel);
    }
}


