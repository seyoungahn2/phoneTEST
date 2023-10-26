package DB;

import java.sql.*; // mysql-connector-j-8.1.0
import java.util.Scanner;
class Data
{
    String a, b, c;
    int d, e, f;

    public String getA() {		return a;	}
    public void setA(String a) {		this.a = a;	}
    public String getB() {		return b;	}
    public void setB(String b) {		this.b = b;	}
    public String getC() {		return c;	}
    public void setC(String c) {		this.c = c;	}
    public int getD() {		return d;	}
    public void setD(int d) {		this.d = d;	}
    public int getE() {		return e;	}
    public void setE(int e) {		this.e = e;	}
    public int getF() {		return f;	}
    public void setF(int f) {		this.f = f;	}
}
class SQLC
{
    // Connction 데이터 베이스를 연결하기 위한 클래스
    private static Connection conn;
    // Statement 데이터 베이스에 명령(SQL 쿼리) 실행
    private static PreparedStatement pstmt;

    SQLC() throws SQLException {
        //DriverManager : SQL Driver 연결을 위한 Manger
        //getConnection : 데이터베이스에 연결시 객체를 제공 Connection
        //1인자 : Mysql url -> MySQL 서버(DB 서버) 스키마(database)
        //2인자 : 아이디
        //3인자 : 비번
        // 실제로 MySQL 연결이되면 Connction 객체를 리턴
        // conn 객체를 받습니다.
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseprogramming"
                ,"root","1234");
    }

    void DataInsert(Data d)
    {
        try {
            // 쿼리문을 세팅하는 작업
            // 연결된 객체 -> conn
            // conn.prepareStatement(쿼리문)
            // Connection을 이용해서 쿼리문 객체 생성 PrepareStatement
            // PrepareStatement 객체 -> pstmt
            // ? ? ? ? ? ?
            /*
            ? ->pstmt.setString(1, d.getA());
            ? ->pstmt.setString(2, d.getB());
            ? ->pstmt.setString(3, d.getC());
            ? ->pstmt.setInt(4, d.getD());
            ? ->pstmt.setInt(5, d.getE());
            ? ->pstmt.setInt(6, d.getF());
             */
            pstmt = conn.prepareStatement(" insert into 대리점 values (?,?,?,?,?,?);");
            pstmt.setString(1, d.getA());
            pstmt.setString(2, d.getB());
            pstmt.setString(3, d.getC());
            pstmt.setInt(4, d.getD());
            pstmt.setInt(5, d.getE());
            pstmt.setInt(6, d.getF());
            // 쿼리문을 실행합니다.
            int num =pstmt.executeUpdate();
            System.out.println(num);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void selectAll() throws SQLException {
        // 문자열 쿼리
        String sql = "select * from 대리점;";
        // conn.prepareStatement(sql)
        pstmt=conn.prepareStatement(sql);
        //executeQuery Select용 -> return set(ResultSet)
        // rs <- 쿼리 결과
        ResultSet rs =pstmt.executeQuery();
        // Set -> iterator hasNext(), next()
        // ResultSet -> rs.next() iterator 변환 필요 X
        while(rs.next()){
            // Set 객체
            //rs.getString("지점명") 지점명 찾아봐
            // 값 -> 강남점
            System.out.print(rs.getString("지점명")+"/");
            System.out.print(rs.getString("도시")+"/");
            System.out.print(rs.getString("전화번호")+"/");
            System.out.print(rs.getInt("종업원수")+"/");
            System.out.print(rs.getInt("자본금")+"/");
            System.out.print(rs.getDate("지점개설일")+"/");
            System.out.println();
        }
    }
    void findSelect(String name) throws SQLException {
        String sql = "select * from 대리점 where 지점명 = ?;";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1, name);
        ResultSet rs =pstmt.executeQuery();
        // Set -> iterator hasNext(), next()
        // ResultSet -> rs.next() iterator 변환 필요 X
        while(rs.next()){
            // Set 객체
            //rs.getString("지점명") 지점명 찾아봐
            // 값 -> 강남점
            System.out.print(rs.getString("지점명")+"/");
            System.out.print(rs.getString("도시")+"/");
            System.out.print(rs.getString("전화번호")+"/");
            System.out.print(rs.getInt("종업원수")+"/");
            System.out.print(rs.getInt("자본금")+"/");
            System.out.print(rs.getDate("지점개설일")+"/");
            System.out.println();
        }
    }

    void deleteSelect(String name) throws SQLException {
        String sql = "delete from 대리점 where 지점명 = ?;";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.executeUpdate();
    }
}
class InputClass
{
       Data valueReturn() {
        Data d = new Data();

        Scanner scS = new Scanner(System.in);
        Scanner scI = new Scanner(System.in);

        System.out.print("지점을 입력하세요 : ");
        d.setA(scS.nextLine());
        System.out.print("도시를 입력하세요 : ");
        d.setB(scS.nextLine());
        System.out.print("전화번호을 입력하세요 : ");
        d.setC(scS.nextLine());
        System.out.print("종업원수를 입력하세요 : ");
        d.setD(scI.nextInt());
        System.out.print("자본금을 입력하세요 : ");
        d.setE(scI.nextInt());
        System.out.print("지점개설일을 입력하세요 : ");
        d.setF(scI.nextInt());
        return d;

    }
    String findString(){
        Scanner scS = new Scanner(System.in);
        System.out.print("지점명 : ");
        return scS.next();
    }
}

public class FirstDB_T {
    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        SQLC sq = new SQLC();
        InputClass ic = new InputClass();
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
