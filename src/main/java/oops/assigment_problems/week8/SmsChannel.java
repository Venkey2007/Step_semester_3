
package oops.assigment_problems.week8;

public class SmsChannel implements NotificationChannel {

    @Override
    public String getChannelName() {
        return "SMS";
    }

    @Override
    public void send(Student student, Notice notice) {
        System.out.println(
            "SMS sent to " + student.getName()
            + " (" + student.getDepartment() + ")"
            + ": " + notice.getTitle()
        );
    }
}

