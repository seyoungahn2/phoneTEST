package Day09;

class Student{
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }
}
public class ClassTest2_8 {
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());

        Student student1 = new Student();
        student1.studentName = "안연수";
        Student student2 = new Student();
        student2.studentName = "안승연";

        System.out.println(student1.getStudentName());
        System.out.println(student2.getStudentName());

        System.out.println(student1);
        System.out.println(student2);
    }
}
