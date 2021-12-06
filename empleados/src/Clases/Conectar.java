
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conectar {
    Connection cn;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados","root","assasins123");
            System.out.println("Conexion existosa");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo conectar a base de  datos");
        }
    return cn;
    }  
}