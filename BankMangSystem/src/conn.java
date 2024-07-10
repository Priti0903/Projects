
import java.sql.*;

public class conn {
    Statement statement;
    Connection connection;
   conn()
   {    
     try 
        {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem1", "root", "1234");
            statement=connection.createStatement();
            // dbConnection.close();
} 
     
        catch ( Exception E)
         {
            E.printStackTrace();
        }
    }
}