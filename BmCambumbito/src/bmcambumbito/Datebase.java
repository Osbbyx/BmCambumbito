

package bmcambumbito;

/**
 *
 * @author Oliver Smit, Camil Agramonte y Luis Feliz <BmCambumbito at gmail.com>
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Datebase {
    private static String user="root";
    private static String pass="Chino123";
    private static String server="jdbc:mysql://localhost:3306/sga?useSSL=false";
    
    public static  Connection getConexion() {
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(server,user,pass);         
        }
        catch(Exception e){
         System.out.println(String.valueOf(e));}
        return cn;
    }
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConexion();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return datos;
    }    
}