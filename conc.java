package bank.management.system;

import java.sql.*;

public class conc{

    Connection connection;
    Statement statement;

    public conc(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql:" +
                    "//localhost:3306/bankSystem" ,"root","3033");
            statement = connection.createStatement();
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
}
