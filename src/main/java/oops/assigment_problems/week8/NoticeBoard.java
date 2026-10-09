
package oops.assigment_problems.week8;

import java.util.ArrayList;
import java.util.List;

public class NoticeBoard {

    private List<Student> students;
    private List<Notice> notices;
    private List<NotificationChannel> channels;

    public NoticeBoard() {
        students = new ArrayList<>();
        notices = new ArrayList<>();
        channels = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    public void postNotice(Notice notice) {
        if (notice == null) {
            System.out.println("Notice cannot be null.");
            return;
        }

        notices.add(notice);
        System.out.println("\nPosting notice: " + notice.getTitle());

        for (Student student : students) {
            if (notice.targetsDepartment(student.getDepartment())) {
                for (NotificationChannel channel : channels) {
                    if (student.getPreferredChannels()
                            .contains(channel.getChannelName())) {
                        channel.send(student, notice);
                    }
                }
            }
        }
    }

    public List<Notice> getNotices() {
        return new ArrayList<>(notices);
    }
}

