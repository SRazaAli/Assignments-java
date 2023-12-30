package Demodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Db {

    private static final String dLoc = "jdbc:ucanaccess://Demodb.accdb";
    private Connection con;
    private PreparedStatement pState;
    private ResultSet resSet;

    public Db() throws SQLException {
        try {
            con = DriverManager.getConnection(dLoc);
            System.out.println("Connected!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void dmlOperation(String sqlQuery) {
        try {
            pState = con.prepareStatement(sqlQuery);
            pState.executeUpdate();
            System.out.println("Update sucessfull");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ResultSet runSelect(String sqlQuery) {
        try {
            pState = con.prepareStatement(sqlQuery);
            resSet = pState.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return resSet;
    }
}
