package GradedStudentsLab;
import java.util.*;

/*
Note that this class is written in Array format just to follow the directions.
I figured an Array was used to challenge us not to use an ArrayList
The max classroom size is set to 30
 */

public class Classroom {
    private Student[] students;
    private int nextEmptySeat;
    public Classroom(int maxStudents){
        students=new Student[maxStudents];
        nextEmptySeat=0;
    }
    public Classroom(Student[] studentList){
        students=new Student[30-studentList.length];
        Student[] newList = new Student[30];
        System.arraycopy(studentList,0,newList,0,studentList.length);
        System.arraycopy(students,0,newList,studentList.length,students.length);
        students=newList;
        nextEmptySeat= studentList.length;
    }
    public Classroom(){
        students=new Student[30];
        nextEmptySeat=0;
    }

    public Student[] getStudents(){
        return students;
    }
    public Student getAStudent(int i){
        return students[i];
    }
    public double getAverageExamScore(){
        double average=0;
        for(Student i : students){
            average+=i.getAverageExamScore();
        }
        return average/students.length;
    }
    public void addStudent(Student student){
        if(nextEmptySeat!=30 && students[nextEmptySeat]==null){
            students[nextEmptySeat]=student;
            nextEmptySeat++;
        }else{
            System.out.println("Classroom is full");
        }
    }
    public void removeStudent(String fName, String lName){
        //Creates a new list that doesn't have the student in it
        //MAKE THIS BETTER KI
        Student[] newList= new Student[students.length];
        int placeList=0;
        int placeNewList=0;
        for(Student i : students){
            if(i!=null && Objects.equals(i.getFName(), fName) && Objects.equals(i.getLName(), lName)){
                placeList++;
            }else{
                newList[placeNewList]=students[placeList];
                placeList++;
                placeNewList++;
            }
        }
        students=newList;
    }
    public Student[] getStudentListByScore(){
        SortClassRoom x = new SortClassRoom();
        int counter =0;
        while(students[counter]!=null) {
            counter++;
        }
        Student[] newList=new Student[counter];
        for(int i = 0; i<counter; i++){
            newList[i]=students[i];
        }

        return x.sortClassRoom(newList);
    }
    public void getGradeBook(){
        Student[] sortedList=getStudentListByScore();
        double highestScore=sortedList[0].getAverageExamScore();
        double holdScore;
        int counter=0;
        for(Student i : sortedList) {
            holdScore = i.getAverageExamScore();
            if (holdScore / highestScore >= .90) {
                System.out.println(sortedList[counter].getFName() + " " + sortedList[counter].getLName() + " has a score of  " + sortedList[counter].getAverageExamScore() + " and got an A");
            } else if (holdScore / highestScore > .70) {
                System.out.println(sortedList[counter].getFName() + " " + sortedList[counter].getLName() + " has a score of  " + sortedList[counter].getAverageExamScore() + " and got a B");
            } else if (holdScore / highestScore > .50) {
                System.out.println(sortedList[counter].getFName() + " " + sortedList[counter].getLName() + " has a score of  " + sortedList[counter].getAverageExamScore() + " and got a C");
            } else if (holdScore / highestScore > .11) {
                System.out.println(sortedList[counter].getFName() + " " + sortedList[counter].getLName() + " has a score of  " + sortedList[counter].getAverageExamScore() + " and got a D");
            } else {
                System.out.println(sortedList[counter].getFName() + " " + sortedList[counter].getLName() + " has a score of  " + sortedList[counter].getAverageExamScore() + " and got an F");
            }
            counter++;
        }
    }

}
