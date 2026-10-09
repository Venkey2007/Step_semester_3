
package oops.assigment_problems.week8;

public class Member {

    private String memberId;
    private String name;
    private String department;

    public Member(String memberId, String name, String department) {
        this.memberId = memberId;
        this.name = name;
        this.department = department;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

