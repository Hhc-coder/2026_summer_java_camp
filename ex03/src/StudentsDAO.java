import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentsDAO {
    final String HOST = "svc.sel3.cloudtype.app";
    final String PORT = "32701";
    final String DB_NAME = "dgsw";
    final String USER = "root";
    final String PASSWORD = "1234";
    final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME+ "?useSSL=false&allowPublicKeyRetrieval=true&s erverTimezone=Asia/Seoul";

    public void insert(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        String insertsql = "INSERT INTO students (NAME,AGE,EMAIL) VALUES (?,?,?)";
        String selectsql = "SELECT * FROM students";
        try{
            //DB 연결
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            pstmt = conn.prepareStatement(insertsql);

            System.out.println("name을 입력하세요");
            String name = IO.readln();
            pstmt.setString(1,name);

            pstmt.setInt(2,20);

            System.out.println("email을 입력하세요");
            String email = IO.readln();
            pstmt.setString(3,email);
            // sql구문 작성 완료

            pstmt.executeUpdate();
            System.out.println("저장성공");
        }catch (Exception e) {
            e.printStackTrace();
//          conn.close();
        }
    }
    public void select(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String selectsql = "SELECT * FROM students";
        try{
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            pstmt = conn.prepareStatement(selectsql);
            rs = pstmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                String created_at = rs.getString("created_at");
                System.out.println(id+"\t");
                System.out.println(name);
                System.out.println(age);
                System.out.println(email);
                System.out.println(created_at);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void delete(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        String deletesql = "DELETE FROM students";

        try{
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            pstmt = conn.prepareStatement(deletesql);
            pstmt.executeUpdate();
            System.out.println("전체가 삭제 되었습니다");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void update(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        String updatesql = "update students set name=? where email=?";
        System.out.println("이름을 입력하세요");
        String name = IO.readln();
        System.out.println("email 어떤것을 바꿀래요?");
        String email = IO.readln();
        try{
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            pstmt = conn.prepareStatement(updatesql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("행을 수정하였습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}