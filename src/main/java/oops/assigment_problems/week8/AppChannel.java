
package oops.assigment_problems.week8;

public class AppChannel implements NotificationChannel {

    @Override
    public String getChannelName() {
        return "App";
    }

    @Override
    public void send(Student student, Notice notice) {
        System.out.println(
            "App notification sent to " + student.getName()
            + " (" + student.getDepartment() + ")"
            + ": " + notice.getTitle()
        );
    }
}

