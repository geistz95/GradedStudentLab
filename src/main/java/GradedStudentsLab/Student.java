package GradedStudentsLab;
import java.util.*;
public class Student {
    private String fName;
    private String lName;
    private ArrayList<Double> examScores;
    public Student (String fName, String lName, ArrayList<Double> exams){
        this.fName=fName;
        this.lName=lName;
        this.examScores=exams;
    }
    public Student (String fName, String lName, Double[] exams){
        this.fName=fName;
        this.lName=lName;
        examScores=new ArrayList<>();
        this.examScores.addAll(Arrays.asList(exams));
    }
    public String getFName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    public double getAverageExamScore(){
        if(examScores.isEmpty()){
            System.out.println("There are no tests brother");
            System.exit(0);
        }
        double sum=0;
        for(Double i : examScores){
            sum+=i;
        }
        return sum/examScores.size();
    }
    public String getExamScores(){
        StringBuilder list= new StringBuilder("Student's name is " + fName + " " + lName + "\nTheir exam scores are\n");
        list.append(">Exam Scores\n");
        for(int i = 0; i<examScores.size();i++){
            list.append("\tExam ").append(i + 1).append(" -> ").append(examScores.get(i)).append("\n");
        }
        return list.toString();
    }
    @Override
    public String toString(){
        StringBuilder list= new StringBuilder("Student's name is " + fName + " " + lName + "\nTheir exam scores are\n");
        list.append("> Average is : ").append(getAverageExamScore()).append("\n> Exam Scores\n");
        for(int i = 0; i<examScores.size();i++) {
            list.append("\tExam ").append(i + 1).append(" -> ").append(examScores.get(i)).append("\n");
        }

        return list.toString();
    }
    public double getTestTaken(){
        return examScores.size();
    }
    public void setfName(String fName){
        this.fName=fName;
    }
    public void setlName(String lName){
        this.lName=lName;
    }
    public void setExamScore(int whichExam, double examScore){
        examScores.set(whichExam,examScore);
    }
    public void addTestTaken(double grade){
        examScores.add(grade);
    }
}
