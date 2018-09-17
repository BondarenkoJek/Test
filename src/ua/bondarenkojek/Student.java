package ua.bondarenkojek;


/**
 * Created by jek on 17.09.18.
 */
public class Student {

    private final String name;

    private final int responsibility;

    private final int success;

    private final int decency;

    private boolean present = false;

    private Group group;

    public Student(String name, int responsibility, int success, int decency) {
        this.name = name;
        this.responsibility = responsibility;
        this.success = success;
        this.decency = decency;
    }


    public Student voting() {
        Skill preferSkill = Skill.values()[(int) (Math.random()*3)];

        System.out.println();
        System.out.println(this.getName() + " is prefer skill - " + preferSkill);

        Student preferStudent = null;

        for (Student student : group.getStudents()) {
            if (preferStudent == null)
                preferStudent=student;

            switch (preferSkill) {
                case DECENCY:
                    if (student.getDecency() > preferStudent.getDecency())
                    preferStudent = student;
                    break;
                case RESPONSIBILITY:
                    if (student.getResponsibility() > preferStudent.getResponsibility())
                        preferStudent = student;
                    break;
                case SUCCESS:
                    if (student.getSuccess() > preferStudent.getSuccess())
                        preferStudent = student;
                    break;
            }
        }

        System.out.println(this.getName() + " chose - " + preferStudent.getName());

        return preferStudent;
    }



    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String getName() {
        return name;
    }

    public int getResponsibility() {
        return responsibility;
    }

    public int getSuccess() {
        return success;
    }

    public int getDecency() {
        return decency;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    private enum Skill {
        RESPONSIBILITY,
        SUCCESS,
        DECENCY
    }

}
