
package jueves7_12;
import java.sql.*;
public class Datos {
    private Connection cnn;
    private String url="jdbc:mysql://127.0.0.1:3306/alumnos";
    private String user="root";
    private String password="";
    private PreparedStatement ps;
    private ResultSet rs;
    private String resultado;

   
   public Datos(){
       
       try {
           cnn = DriverManager.getConnection(url, user, password);
           ps = cnn.prepareStatement("SELECT * FROM id WHERE last_name='Simmel' or first_name=Georgi");
           rs = ps.executeQuery();
          while(rs.next()){
              resultado = rs.getString("nombre");
              
              
              System.out.println(resultado);
          }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
      
   }
}
