package prueba.connection;
import java.sql.*;

/**
 * Clase que permite conectar con la base de datos
 * @author Fabian
 *
 */
public class DbConnection {
private static String bd = "biblioteca";
private static String login = "root";
private static String password = "";
private static String url = "jdbc:mysql://localhost/"+bd;
Connection connection = null;

public DbConnection() {
try{
//obtenemos el driver de para mysql
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection(url,login,password);
if (connection!=null){
		System.out.println("Conexión a base de datos "+bd+" OK\n");
		}
}
	catch(SQLException e){
	System.out.println(e);
	}
catch(ClassNotFoundException e){
	System.out.println(e);
	}
	catch(Exception e){
		System.out.println(e);
		}
}
/**Permite retornar la conexión*/
public Connection getConnection(){
	return connection;
	}

public void desconectar(){
	connection = null;
	}
}