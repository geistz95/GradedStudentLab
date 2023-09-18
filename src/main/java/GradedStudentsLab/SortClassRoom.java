package GradedStudentsLab;

/*
 In this method, we're creating a tree and iterating though comparing left and right to the root to see if its higher or not
 We re-organize the tree so that the highest is at the top (at index 0) to the lowest

 I challenged myself to do a sort method using trees for this
 */
public class SortClassRoom {
    public Student[] sortClassRoom(Student[] students){
        int j = students.length;
        for (int i = j/2-1; i>=0; i--){
            sortThis(students, j,i);
        }
        for (int i = j-1; i>0; i--){
            Student temp = students[0];
            students[0]=students[i];
            students[i]=temp;
            sortThis(students,i,0);
        }
        return students;
    }

    private void sortThis(Student[] x, int j, int i) {
        double largest = x[i].getAverageExamScore();
        int largePos=i;
        int leftTree = 2*i+1;
        int rightTree = 2*i+2;

        if(leftTree<j && x[leftTree].getAverageExamScore() < largest){
            largest = x[leftTree].getAverageExamScore();
            largePos=leftTree;
        }
        if(rightTree<j && x[rightTree].getAverageExamScore()<largest){
            largest=x[rightTree].getAverageExamScore();
            largePos=rightTree;
        }
        if( largest!=x[i].getAverageExamScore()){
            Student swap = x[i];
            x[i]=x[largePos];
            x[largePos]=swap;
            sortThis(x,j,largePos);
        }
    }
}
