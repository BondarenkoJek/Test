package ua.bondarenkojek;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by jek on 17.09.18.
 */
public class Group {

    private final Set<Student> students = new HashSet<>();

    private Student groupLeader;

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        student.setGroup(this);
        students.add(student);
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(Student groupLeader) {
        this.groupLeader = groupLeader;
    }



    public void votingGroupLeader() {

        if (students.size() > 0) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Begin to voting leader of the group!!!");
            Map<Student, Integer> candidatesForGroupLeader = new HashMap<>();

            for (Student student : students) {

                Student candidate = student.voting();

                if (candidatesForGroupLeader.containsKey(candidate)) {
                    candidatesForGroupLeader.put(candidate, candidatesForGroupLeader.get(candidate) + 1);
                } else {
                    candidatesForGroupLeader.put(candidate, 1);
                }
            }

            int numberOfVotes = 0;

            for (Map.Entry<Student, Integer> entry : candidatesForGroupLeader.entrySet()) {
                if (groupLeader == null)
                    groupLeader = entry.getKey();

                if (entry.getValue() > numberOfVotes) {
                    numberOfVotes = entry.getValue();
                    groupLeader = entry.getKey();
                }
            }

            System.out.println();
            System.out.println("Voting leader of the group finished!!!");
            System.out.println("The leader of the group  become: " + groupLeader.getName());
            System.out.println(groupLeader.getName() + " scored " + numberOfVotes + " votes.");
            System.out.println("---------------------------------------------------------");
        }
    }

    public void studentsPresent() {
        for (Student student : students) {

            if (((int) (Math.random()*10)) != 0) {
                student.setPresent(true);
            } else student.setPresent(false);
        }
    }

}
