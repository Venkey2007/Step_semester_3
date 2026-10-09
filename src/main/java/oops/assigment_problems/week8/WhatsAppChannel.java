package oops.assigment_problems.week8;

public class WhatsAppChannel implements NotificationChannel {

    @Override
    public String getChannelName() {
        return "WhatsApp";
    }

    @Override
    public void send(Student student, Notice notice) {
        System.out.println(
                "WhatsApp message sent to " + student.getName()
                + " (" + student.getDepartment() + ")"
                + ": " + notice.getTitle());
    }
}
