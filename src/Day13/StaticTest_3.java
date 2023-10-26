package Day13;

class Student{
    static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    Student(){
        serialNum++;
        studentID = serialNum;
    }
    String getStudentName(){
        return studentName;
    }
    void setStudentName(String name){
        studentName = name;
    }

    static void abc(){
        System.out.println("Hello");
    }
}
public class StaticTest_3 {

    public static void main(String[] args) {
        Student.abc();
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(Student.serialNum);
        System.out.println(studentLee.studentName+" 학번 : "+studentLee.studentID);
        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println(Student.serialNum);
        System.out.println(studentSon.studentName+" 학번 : "+studentSon.studentID);

    }
}
