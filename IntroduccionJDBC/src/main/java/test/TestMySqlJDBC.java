package test;

import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        var url ="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        //Class.forName("com.msql.cj.jdbc.Driver");
        try {
            Connection conexion = DriverManager.getConnection(url,"root","admin");
            Statement instruccion = conexion.createStatement();
            var sql ="SELECT id_persona, nombre, apellido, mail, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()){
                System.out.println(" ID Persona: " + resultado.getInt("id_persona") + " Nombre: " + resultado.getString("nombre") + " Apellido: " + resultado.getString("apellido") +" Mail: " + resultado.getString("mail")
                        + " Telefono: " + resultado.getString("telefono") );
            }
            resultado.close();
            instruccion.close();
            conexion.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }
    }
}
