import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class JDBC_bank {
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
        ResultSet rs;
        int flag=0,ch=0;
       
        String sqlcmd;
        con=DriverManager.getConnection(dburl,usr,pas);
        System.out.println("Creating statements");
        s=con.createStatement();
         //Table creation
        /*sqlcmd="CREATE TABLE account2(accno INT,name varchar(10))";
        flag=s.executeUpdate(sqlcmd);
        if(flag>0)
        {
            System.out.println("Created Table...");
        }
        */
        //Row insertion
        sqlcmd = "Insert into account2(accno,name) values(?,?)";
        PreparedStatement ps=con.prepareStatement(sqlcmd);
        System.out.println("Enter 1 to add a row: ");
        Scanner scan=new Scanner(System.in);
        ch=scan.nextInt();
        while(ch==1)
        {
            System.out.println("Enter the account no and name: ");
            int a=scan.nextInt();
            String n=scan.next();
            ps.setInt(1,a);
            ps.setString(2, n);
            flag=ps.executeUpdate();
        if(flag>0)
            System.out.println("A row is inserted....");
        System.out.println("Enter 1 to add another row: ");
        ch=scan.nextInt();
        }
        //Viewing a database
        sqlcmd="Select * from account2";
        rs= s.executeQuery(sqlcmd);
        while(rs.next())
        {
            System.out.println("Account number- " + rs.getInt(1) + " Name- " + rs.getString(2));
            
        }
        
        //Altering a table
        /*sqlcmd="Alter table account2 add bal int";
        flag=s.executeUpdate(sqlcmd);
        if(flag>0)
        {
            System.out.println("New column is added...");
        }
        sqlcmd="UPDATE account2 SET bal=1000 where accno>0";
        flag=s.executeUpdate(sqlcmd);
        if (flag>0)
            System.out.println("New value is added...");
          */      
    //Viewing
    sqlcmd="Select * from account2";
        rs= s.executeQuery(sqlcmd);
        while(rs.next())
        {
            System.out.println("Account number- " + rs.getInt(1) + " Name- " + rs.getString(2)  + " Balance- " + rs.getInt(3));
            
        }
    }
    catch (SQLException | ClassNotFoundException e) {
     System.out.println("Class not found....");
      }
}
}
        
        
    

