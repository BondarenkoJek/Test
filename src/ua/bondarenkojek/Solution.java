package ua.bondarenkojek;


/**
 * Created by jek on 17.09.18.
 */
public class Solution {
    public static void main(String[] args) {

        //Створення нової групи для студентів
        Group group = new Group();


        //Додавання студентів до групи
        group.addStudent(new Student("Kolya", 3,2,5));
        group.addStudent(new Student("Vasya", 5, 8, 1));
        group.addStudent(new Student ("Petya", 7, 6, 4));
        group.addStudent(new Student("Alex", 7,6,6));


        //Голосування за старосту групи
       group.votingGroupLeader();


       //Наявність студентів
       group.studentsPresent();




       //Створення професора
        Professor professor = new Professor();

        //Додавання групи студентів професору
        professor.setGroup(group);

        //Профессор перевіряє наявність студентів
        professor.presenceCheck();

    }
}
