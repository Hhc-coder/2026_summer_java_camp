import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLTEST {
    static void main(String[] args){



        String selectsql = "SELECT * FROM students";


        while(true){
            System.out.println("뭘할래요? \n1.insert \n2.select \n3.delete \n4.update \n5.exit");
            String se = IO.readln();
            if(se.equals("1")){
                StudentsDAO dao = new StudentsDAO();
                dao.insert();
            } else if (se.equals("2")) {
                StudentsDAO dao = new StudentsDAO();
                dao.select();
            }else if (se.equals("3")){
                StudentsDAO dao = new StudentsDAO();
                dao.delete();
            } else if (se.equals("4")) {
                StudentsDAO dao = new StudentsDAO();
                dao.update();
            }else if (se.equals("5")) {
                System.out.println("종료됩니다.");
                break;
            }
        }


    }
}