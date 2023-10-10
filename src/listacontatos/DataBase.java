/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacontatos;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class DataBase {
    
    private static final String BD = "agenda"; 
    private static final String SERVIDOR = "127.0.0.1"; 
    private static final String PORTA = "3306"; 
    private static final String TIME_ZONE = "useTimezone=true&serverTimezone=UTC";
    private static final String STR_CONNECTION = "jdbc:mysql://" + SERVIDOR + ":" + PORTA + "/" + BD + "?" + TIME_ZONE; 
    private static final String USUARIO = "root"; 
    private static final String SENHA = "root";
    private static final String STR_DRIVER = "Com.mysql.cj.jdbc.Driver";
    private static Connection objConnection = null;
    
    public static Connection getConnection() {
        try{
            Class.forName(STR_DRIVER);
            objConnection = DriverManager.getConnection(STR_CONNECTION, USUARIO, SENHA);
        }catch(ClassNotFoundException ce){
            System.out.println("Erro ao carregar o driver!");
        }catch(SQLException e){
            System.out.println("Erro ao conectar com o banco de dados!");        
        }
        return objConnection;
    }
    
    public static void closeConnection(){
        if(objConnection != null){
            try{
                objConnection.close();
                objConnection = null;
            }catch(SQLException e){
                System.out.println("listacontatos.DataBase.closeConnection()");
                e.printStackTrace();
            }
        }
    }
    
    public void add(Contato contato){
        
    }
    
    public void delete(Contato contato){
        
    }
    
    public void update(Contato contato){
        
    }
    
    // Busca um contato pelo UUID
    public Contato get(String index){
        objConnection = this.getConnection();
        Contato contato = new Contato();
        
        // Aqui vamos fazer a consulta no banco
        
        return contato;
    }
    
    //Busca todos os contatos
    public ArrayList<Contato> get(){
        objConnection = this.getConnection();
        ArrayList<Contato> listaContatos = new ArrayList<>();
        
        // Aqui vamos fazer a consulta no banco
        
        return listaContatos;
    }
}
