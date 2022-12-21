import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_FIRSTEXAMPLE {
public static void main(String[] arg)
{
    Connection con=null;
    Statement s=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database");
        String dburl="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String usr="root";
        String pas="clorateddy";
        con=DriverManager.getConnection(dburl,usr,pas);
        System.out.println("Creating statements");
        s=con.createStatement();
        String sql="Select * from employee1";
        String n;
        ResultSet rs=s.executeQuery(sql);
        while(rs.next()){
            int id=rs.getInt("Id");
            n=rs.getString("name");
            System.out.println("Id= " + id + " Name= " + n);
            
       }
        s.close();
        con.close();
    }
    catch (SQLException | ClassNotFoundException e) {
     System.out.println("Class not found....");
      }
}
}
        
        
    

