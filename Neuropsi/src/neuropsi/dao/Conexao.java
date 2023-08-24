package neuropsi.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    @SuppressWarnings("CallToPrintStackTrace")
    public Connection getConnection(){
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/neuropsi","root",null);
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println(e);
        }
        return conn;
    }
}
