package Day10;

class Subject{
    String subjectName;
    int scorePoint;
}

class Student{
    int studentID;
    String studentName;
    Subject korean;
    Subject math;
}

public class HasTest_6 {
    public static void main(String[] args) {
        Student student = new Student();
        student.korean = new Subject();
        student.korean.scorePoint = 80;
    }
}
