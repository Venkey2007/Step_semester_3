
package oops.assigment_problems.week8;

public class EmailChannel implements NotificationChannel {

    @Override
    public String getChannelName() {
        return "Email";
    }

    @Override
    public void send(Student student, Notice notice) {
        System.out.println(
            "Email sent to " + student.getName()
            + " (" + student.getDepartment() + ")"
            + ": " + notice.getTitle()
        );
    }
}

