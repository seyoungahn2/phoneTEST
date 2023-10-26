package TEST;

import java.sql.*;
import java.util.Scanner;
class Data
{
    String a, b, c;

    public String getA() {		return a;	}
    public void setA(String a) {		this.a = a;	}
    public String getB() {		return b;	}
    public void setB(String b) {		this.b = b;	}
    public String getC() {		return c;	}
    public void setC(String c) {		this.c = c;	}

}
class SQLC
{
    private static Connection conn;
    private static PreparedStatement pstmt;

    SQLC() throws SQLException {

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phone"
                ,"root","1234");
    }

    void DataInsert(TEST.Data d)
    {
        try {
            pstmt = conn.prepareStatement(" insert into phone values (?,?,?);");  // 입력
            pstmt.setString(1, d.getA());
            pstmt.setString(2, d.getB());
            pstmt.setString(3, d.getC());

            int num =pstmt.executeUpdate();
            System.out.println(num);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void findSelect(String name) throws SQLException {  // 검색
        String sql = "select * from phone where name = ?;";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1, name);
        ResultSet rs =pstmt.executeQuery();
        if (rs.next()){
            System.out.print(rs.getString("name")+"/");
            System.out.print(rs.getString("phoneNumber")+"/");
            System.out.print(rs.getString("address")+"/");
            System.out.println();
        }
        else {
            System.out.println("전화번호부에 없습니다.");
        }
    }

    void deleteSelect(String name) throws SQLException { // 삭제
        String sql = "delete from phone where name = ?;";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.executeUpdate();
    }

    void selectAll() throws SQLException {  // 출력

        String sql = "select * from phone;";
        pstmt=conn.prepareStatement(sql);
        ResultSet rs =pstmt.executeQuery();

        while(rs.next()){
            System.out.print(rs.getString("name")+"/");
            System.out.print(rs.getString("phoneNumber")+"/");
            System.out.print(rs.getString("address")+"/");
            System.out.println();
        }
    }

}
class InputClass
{
    TEST.Data valueReturn() {
        TEST.Data d = new TEST.Data();
        Scanner scS = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        d.setA(scS.nextLine());
        System.out.print("전화번호를 입력하세요 : ");
        d.setB(scS.nextLine());
        System.out.print("주소을 입력하세요 : ");
        d.setC(scS.nextLine());
        return d;

    }
    String findString(){
        Scanner scS = new Scanner(System.in);
        System.out.print("이름 : ");
        return scS.next();
    }
}

public class phone {
    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        TEST.SQLC sq = new TEST.SQLC();
        TEST.InputClass ic = new TEST.InputClass();
        while(true)
        {
            System.out.print("1. 입력 2.검색 3.삭제 4.출력 5.종료 :");
            int num = sc.nextInt();
            if(num==1)
            {
                sq.DataInsert(ic.valueReturn()); // 입력
            }
            else if(num == 2){
                sq.findSelect(ic.findString());  // 검색
            }
            else if(num == 3){
                sq.deleteSelect(ic.findString());  //삭제
            }
            else if(num == 4){
                sq.selectAll(); // 출력
            }
            else
            {
                System.out.println("프로그램을 종료합니다."); //종료
                break;
            }
        }
    }

}
