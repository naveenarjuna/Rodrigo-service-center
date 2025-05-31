package rodrigoservicecenter.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
    private static Connection con;
    public Connection createConnection(){
        try{
            String dbpath = "jdbc:mysql://localhost/rodrigo";
            con = DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }

        return con;
    }
}