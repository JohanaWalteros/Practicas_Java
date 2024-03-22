package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConfigDB {
    //Variable que va a contener el estado de la conexión
    static Connection objConnection = null;

   //Método openConnection: abre la conexión
    public static Connection openConnection(){
        try {
            //Conexión para conectar el driver en el archivo y para obtener un catch
            //com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/_01_jdbc";
            String user = "root";
            String password = "";

            //Establecer conexión entre base de datos y java get recibe 3 parámetros: url, user y password
            objConnection = (Connection) DriverManager.getConnection(url, user,password);

            //Si todo esta bien
            System.out.println("¡Conexión perfecta!");

            //Error si no se establece una conexión con el drive
        }catch (ClassNotFoundException e){
            System.out.println("Error >> Driver no Instalado");

            //Error si hay algún dato incorrecto como url, user o el password
        }catch (SQLException e){
            System.out.println("Error >> No se pudo establecer una conexión con la base de datos" + e.getMessage());
        }

        //Porque en el public static Connection está indicando que retornara connection
        return objConnection;
    }

    public static void closeConnection(){
        try {
            //Si hay una conexión activa, la cerramos
            if(objConnection !=null) objConnection.close();
        }catch (SQLException e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
