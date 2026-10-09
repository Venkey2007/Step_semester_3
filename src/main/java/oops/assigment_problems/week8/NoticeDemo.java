package oops.assigment_problems.week8;

import java.util.Arrays;
import java.util.HashSet;

public class NoticeDemo {
    public static void main(String[] args) {
        NoticeBoard board = new NoticeBoard();

        Student asha = new Student(
                "Asha", "CSE",
               new HashSet<>(Arrays.asList("Email", "App", "WhatsApp")));

        Student ravi = new Student(
                "Ravi", "ECE",
                new HashSet<>(Arrays.asList("SMS")));

        board.addStudent(asha);
        board.addStudent(ravi);

        board.addChannel(new EmailChannel());
        board.addChannel(new SmsChannel());
        board.addChannel(new AppChannel());
        board.addChannel(new WhatsAppChannel());

        Notice examNotice = new Notice(
                "Exam schedule published",
                new HashSet<>(Arrays.asList("CSE", "ECE")));

        board.postNotice(examNotice);

        Notice cseNotice = new Notice(
                "CSE lab maintenance",
                new HashSet<>(Arrays.asList("CSE")));

        board.postNotice(cseNotice);

        try {
            new Notice(
                    "Invalid notice",
                    new HashSet<String>());
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Invalid notice rejected: " + e.getMessage());
        }
    }
}

