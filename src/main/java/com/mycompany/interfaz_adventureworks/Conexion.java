/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz_adventureworks;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Jose Alfredo
 */
public class Conexion {
     
    Connection conectar = null;
    
    String usuario = "usersql";
    String contrasenia = "1234";
    String database = "AdventureWorks2019_3";
    String ip="localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+database;
    
    public Connection  establecerConnexion(){
        try {
            String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+database;
            conectar=DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos"+e.toString());
        }
           return conectar;
    }
}
