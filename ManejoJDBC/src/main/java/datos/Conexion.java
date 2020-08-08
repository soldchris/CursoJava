package datos;

import java.sql.Connection;
import java.sql.*;

public class Conexion {
    private static final String JDBC_URL ="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PWD = "admin";

    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PWD);
    }

    public static void close (ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement stmt) throws SQLException {
        stmt.close();
    }

    public static void close(PreparedStatement smt) throws SQLException {
        smt.close();
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }

}
