import java.sql.*;

public class DBHelper {
    private String USERNAME = "postgres";
    private String DATABASE_URL = "jdbc:postgresql://localhost/dvdrental";
    private String PASSWORD = "postgres";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
    }
    
    public static void showErrorMessage(SQLException exception){
        System.out.println("Error : "+exception.getMessage());
        System.out.println("Error Code : "+exception.getErrorCode());
    }
    
}
