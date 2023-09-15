package GradedStudentsLab;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        //System.out.println(student.getTestScores());
        //student.addTestTaken(100.0);
        String output = student.toString();
        System.out.println(output);

    }
}