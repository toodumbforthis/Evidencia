/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Compu
 */
public class model {
    public static void saveData (String usuario,String contra, int edad, String sexo, Float estatura, Float peso) throws ClassNotFoundException{
    
        
        try{
        Class.forName("com.mysqul.Driver");
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql//localhost:3306/evidenciadb","root","root")) {
                Statement stmt=con.createStatement();
                //aqui me falta algo
                String query="Insert into usuario(usuario,contra,edad,sexo,estatura,peso) values("+usuario")"
                stmt.executeUpdate(query);
            }
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    public static String login(String contra, String usuario) throws SQLException{
    String table="<table>";
    try{
    Class.forName("com.mysql.jdbl.Driver");
    Connection con=DriverManager.getConnection(
    "jdbc:mysql//localhost:3306/evidenciadb","root","root");
    
    //añadir query
   table=table+"<td>nombre</td>"+"<td>Edad</td>"+"<td>Estatura</td>"+"<td>Sexo</td>"+"<td>Peso</td>";
   
    Statement st =con.createStatement();
    ResultSet rs= st.executeQuery(query);
   
    while(rs.next()){
    int id=rs.getInt("id");
    int edad=rs.get.Int("edad");
    String sexo = rs.getString("sexo");
    Float estatura = rs.getFloat("estatura");
    Float peso= rs.getFloat("peso");
    table= table+"<br>"+edad+"<br>"+sexo+"<br>"+peso+"<br>"+id;
    String query1="SELECT*fORM historicalimc WHERE usuario="+usuario;
    table=table+"<td>IMC</td>"+ "<td>Fecha</td>";
    
    ResultSet rss =st.executeQuery(query1);
    
    while(rss.next())
    {
    float imc =rss.getfloat("imc");
    Date fecha=rss.getDate("fecha");
    
    
    table= table+imc+fecha;
    }
    
      con.close();
    }
    catch(Exception e){System.out.println(e);
            }
    }
    return table;
    }
    public static void imc(String usuario, Float estatura, Float peso,Float imc){
    
    try{
    Class.forName("com.mysqul.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/evidenciabd","root","root")) {
            Statement stmt=con.createStatement();
            String query ="Insert into historicalimc( usuario, imc) values ("usuario"+","+"imc")";
            stmt.executeUpdate(query);
        }
    }
    catch(ClassNotFoundException | SQLException e){System.out.println(e);}
    }
}
