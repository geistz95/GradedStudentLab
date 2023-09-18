package GradedStudentsLab;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //String firstName = "Leon";
        //String lastName = "Hunter";
        //Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        //Student student = new Student(firstName, lastName, examScores);
        //System.out.println(student.getExamScores());
        //student.addTestTaken(100.0);
        //String output = student.toString();
        //System.out.println(output);

        // : Given
        //Double[] s1Scores = { 100.0, 150.0 };
        //Double[] s2Scores = { 225.0, 25.0 };

        //Student s1 = new Student("student", "one", s1Scores);
        //Student s2 = new Student("student", "two", s2Scores);

        //Student[] students = {s1,s2};
        //Classroom classroom = new Classroom(students);

        // When
        //double output = classroom.getAverageExamScore();

        // Then
        //System.out.println(output);

        // : Given
        //int maxNumberOfStudents = 1;
        //Classroom classroom = new Classroom(maxNumberOfStudents);
        //Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        //Student student = new Student("Leon", "Hunter", examScores);

        // When
        //Student[] preEnrollment = classroom.getStudents();

        //classroom.addStudent(student);
        //Student[] postEnrollment = classroom.getStudents();

        // Then
        //String preEnrollmentAsString = Arrays.toString(preEnrollment);
        //String postEnrollmentAsString = Arrays.toString(postEnrollment);

        //System.out.println("===========================");
        //System.out.println(preEnrollmentAsString);
        //System.out.println("===========================");
        //System.out.println(postEnrollmentAsString);



        Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };
        Student student1 = new Student("Leon", "Hunter", examScores1 );

        Double[] examScores2 = { 30.0, 392.0, 0.0 , 92.0};
        Student student2 = new Student("Brian", "Kroenburg", examScores2);

        Double[] examScores3 = {100.0, 100.0, 101.0, 201.1};
        Student student3 = new Student("Mary", "Schultz", examScores3);

        Double[] examScores4= {92.0, 97.0, 0.0, 0.0};
        Student student4 = new Student("Joey", "Mike", examScores4);

        Double[] examScores5= {92.0, 97.0, 88.0, 25.0};
        Student student5 = new Student("Michael", "Wu", examScores5 );
        Student[] students = {student1,student2, student3,student4, student5};

        Classroom classroom = new Classroom(students);

        Double[] examScores6 = {100.2, 100.0 ,210.63, 99.9};
        Student student6 = new Student("Justin", "Spuds", examScores6);
        classroom.addStudent(student6);
        classroom.removeStudent(student6.getFName(),student6.getLName());

        Student[] sorted = classroom.getStudentListByScore();

        System.out.println(Arrays.toString(sorted));

        classroom.getGradeBook();

    }
}