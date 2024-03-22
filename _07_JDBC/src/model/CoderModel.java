package model;

import database.CRUD;
import database.ConfigDB;
import entity.Coder;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Para utilizar una interfaz se debe de utilizar la palabra reservada implements
public class CoderModel implements CRUD {

    @Override
    public Object insert(Object object) {
        //1. Abrir la conexión
        Connection objConnection = ConfigDB.openConnection();

        //2.Castear el objeto
        Coder objCoder = (Coder) object;

        try {
            //3. Crear el sql
            String sql ="INSERT INTO coder(name,age,clan) VALUES(?,?,?);";
            //4. Preparar el Statement
            PreparedStatement objPrepare = (PreparedStatement) objConnection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);

            //5. Asignar los ?
            objPrepare.setString(1,objCoder.getName());
            objPrepare.setInt(2,objCoder.getAge());
            objPrepare.setString(3,objCoder.getClan());

            //6. Ejecutar el query
            objPrepare.execute();

            //7. Obtener el resultado
            ResultSet objResult = objPrepare.getGeneratedKeys();
            while (objResult.next()){
                objCoder.setId(objResult.getInt(1));
            }
            //8. Creamos el prepare
            objPrepare.close();
            JOptionPane.showMessageDialog(null,"Coder insertion was successful");

            //9. Creamos la conexión
            ConfigDB.closeConnection();
            return objCoder;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error adding coder"+e.getMessage());

        }
        return null;
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean delate(Object object) {
        return false;
    }

    @Override
    public List<Object> findAll() {
        //1. Abrir la conexión
        Connection objConnection = ConfigDB.openConnection();
        //2. Inicializar la lista donde se guardan los registros que devuelve la BD
        List<Object> listCoders = new ArrayList<>();

        try {
            //3. Escribir la sentencia SQL
            String sql = "SELECT * FROM coder ORDER BY coder.id ASC;";

            //4. Utilizar PrepareStatement
            PreparedStatement objPreparedStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            //5. Ejecutar el Query o el prepare
            ResultSet objResult = (ResultSet) objPreparedStatement.executeQuery();

            //6. Obtener los resultados
            while (objResult.next()){
                Coder objCoder = new Coder();

                objCoder.setId(objResult.getInt("id"));
                objCoder.setName(objResult.getString("name"));
                objCoder.setAge(objResult.getInt("age"));
                objCoder.setClan(objResult.getString("Clan"));

                //7. Se agrega el coder a la lista
                listCoders.add(objCoder);

            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Data acquisition Error");
        }

        //8. Cerrar la conexión
        ConfigDB.closeConnection();

        return listCoders;
    }

    @Override
    public Object findById(int id) {
        return null;
    }
}
