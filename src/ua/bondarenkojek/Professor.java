package ua.bondarenkojek;

import java.util.Set;

/**
 * Created by jek on 17.09.18.
 */
public class Professor {

    private Group group;

    public void presenceCheck() {


        if (group == null) {
            System.out.println("Group is empty");
            return;
        }

        int countStudentsByPresent = 0;

        Set<Student> students = group.getStudents();


        System.out.println("---------------------------------------------------------");
        System.out.println("Begin of present check");
        System.out.println();
        for (Student student : students) {
            System.out.println("Professor: " + student.getName() + " is present?");
            if (student.isPresent()) {
                System.out.println(student.getName() + ": I'm here!");
                countStudentsByPresent+=1;
            } else {
                System.out.println("Absent!!!");
            }
            System.out.println();
        }

        if (countStudentsByPresent == 0) {
            System.out.println("All the students are absent!!!");
        } else {
            System.out.println("Professor: "
                                + countStudentsByPresent
                                +  " students from "
                                + students.size()
                                + " are present!");
        }

        System.out.println("---------------------------------------------------------");
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
