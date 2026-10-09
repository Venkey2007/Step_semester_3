
package oops.assigment_problems.week8;

public interface NotificationChannel {
    String getChannelName();
    void send(Student student, Notice notice);
}

