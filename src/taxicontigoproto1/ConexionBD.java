
package taxicontigoproto1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 
 * @author daniel
 */
    class conexionBD {
    public static String url ="jdbc:mysql://localhost:3306/db_taxicontigo_prot3?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static String user = "root";
    public static String password = "";
    public static String  clase = "com.mysql.cj.jdbc.Driver";
     
    public static Connection crearConexion(){
        Connection con = null;
        
        try{
        Class.forName(clase); //controlador para solicitar la conexion
       con = DriverManager.getConnection(url,user,password); //se realiza la conexion a las variables para acceder a las bases de datos
       
        } catch(Exception e){
            System.out.println(e);   
        
        }
        return con;
     
} //getConection
}
