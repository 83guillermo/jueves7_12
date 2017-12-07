
package jueves7_12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Alumnos {
 private String alumno;
 private String mail;
 private String clave;
 public Alumnos(String alumno,String mail,String clave){
     this.alumno=alumno;
     this.clave=clave;
     this.mail=mail;
 }
    public void guardar(){
        //supuestamente aca conecta con la base de datos y manda los atributos a la tabla
    }
    public void mostrar(){}
    //con este metodo los muestra en pnatalla  con un print a la invocacion del metodo de la instancia
}
