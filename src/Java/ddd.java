package Java;
import java.sql.*; // mysql-connector-j-8.1.0
import java.util.Scanner;


class Data{
    String a, b, c;

    public String getA() {		return a;	}
    public void setA(String a) {		this.a = a;	}
    public String getB() {		return b;	}
    public void setB(String b) {		this.b = b;	}
    public String getC() {		return c;	}
    public void setC(String c) {		this.c = c;	}
}

class SQLC{
    private static Connection conn;
    private static PreparedStatement pstmt;
    SQLC() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phone"
                ,"root","1234");
    }
    void DataInsert(Java.Data d) {
        try {
            pstmt = conn.prepareStatement(" insert into phone values (?,?,?);");
            pstmt.setString(1, d.getA());
            pstmt.setString(2, d.getB());
            pstmt.setString(3, d.getC());

            int num = pstmt.executeUpdate();
            System.out.println(num);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    void selectAll() throws SQLException {
        String sql = "select * from phone;";
        pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString("이름") + "/");
            System.out.print(rs.getString("전화번호") + "/");
            System.out.print(rs.getString("주소") + "/");
            System.out.println();
        }
    }
    void findSelect(String name) throws SQLException {
        String sql = "select * from phone where name = ?;";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        ResultSet rs = pstmt.executeQuery();
        // Set -> iterator hasNext(), next()
        // ResultSet -> rs.next() iterator 변환 필요 X
        while (rs.next()) {
            // Set 객체
            //rs.getString("지점명") 지점명 찾아봐
            // 값 -> 강남점
            System.out.print(rs.getString("이름") + "/");
            System.out.print(rs.getString("전화번호") + "/");
            System.out.print(rs.getString("주소") + "/");
            System.out.println();
        }
    }

    void deleteSelect(String name) throws SQLException {
        String sql = "delete from phone where name = ?;";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.executeUpdate();
    }

}

class InputClass{

    Java.Data valueReturn() {
        Java.Data d = new Java.Data();
        Scanner scS = new Scanner(System.in);

        System.out.print("이름 : ");
        d.setA(scS.nextLine());
        System.out.print("전화번호 : ");
        d.setB(scS.nextLine());
        System.out.print("주소 : ");
        d.setC(scS.nextLine());

        return d;
    }


    String findString () {
        Scanner scS = new Scanner(System.in);
        System.out.print("지점명 : ");
        return scS.next();
    }

}


public class ddd {
    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        Java.SQLC sq = new Java.SQLC();
        Java.InputClass ic = new Java.InputClass();
        while(true)
        {
            System.out.print("1. 입력 2.전체출력 3.지점명 검색 4.지점 삭제 5.종료 :");
            int num = sc.nextInt();
            if(num==1)
            {
                sq.DataInsert(ic.valueReturn()); // Data타입의 d를 DataInsert함수에 넣어 쿼리문 만들어 던져
            }
            else if(num == 2){
                sq.selectAll();
            }
            else if(num == 3){
                sq.findSelect(ic.findString());
            }
            else if(num == 4){
                sq.deleteSelect(ic.findString());
            }
            else
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
