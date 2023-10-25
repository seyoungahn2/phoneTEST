package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class firstDB {
    private static Connection conn;
    private static PreparedStatement pstmt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("지점 : ");
            String jum = sc.nextLine();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseprogramming","root","1234");
            pstmt = conn.prepareStatement("INSERT INTO 대리점 VALUES(?,?,?,?,?,?);");
            pstmt.setString(1, "부평점"); // 물음표(?)가 여기의 1~6과 매칭된다.
            pstmt.setString(2, "인천");
            pstmt.setString(3, "201-1111");
            pstmt.setInt(4, 5);
            pstmt.setInt(5, 50000000);
            pstmt.setInt(6, 19801001);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }






    }

}
