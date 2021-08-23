package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Banco {
    private static Connection connection;
   
    public static Connection getConnection(){
        if(connection == null){
            try{
                Class.forName("org.postgresql.Driver");
                String host = "localhost";
                String port = "5432";
                String database = "postgres";
                String user = "postgres";
                String pass = "senai";
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;
                connection = DriverManager.getConnection(url, user, pass);                
               
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexÃ£o aberta!");
        }
        else{
            try{
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
 

    
 
    public static void salvar (Cliente cliente){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO cliente (nome, cod_cliente, cpf, telefone) values(?, ?, ?, ?)");
            ps.setString(1, cliente.getNome());
            ps.setInt(2, cliente.getCod_cliente());
            ps.setString(3, cliente.getCpf());
            ps.setString(4, cliente.getTelefone());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void salvar (Pedidos Pedidos){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Pedidos (nome, cod, cod_cliente, valor, data) values(?, ?, ?, ?, ?)");
            ps.setString(1, Pedidos.getNome());
            ps.setInt(2, Pedidos.getCod());
            ps.setInt(3, Pedidos.getCod_cliente());
            ps.setInt(4, Pedidos.getValor());
            ps.setString(5, Pedidos.getData());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    
      public static void deletaCliente(int cod_cliente){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM cliente WHERE cod_cliente = ?");
            ps.setInt(1, cod_cliente);
            ps.executeUpdate();


            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
      public static void deletaPedidos(int cod){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM Pedidos WHERE cod = ?");
            ps.setLong(1, cod);
            ps.executeUpdate();


            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void atualizaBanco(Cliente cliente){
        deletaCliente(cliente.getCod_cliente());
        salvar(cliente);
    }
    
    public static void atualizaBanco(Pedidos Pedidos){
        deletaPedidos(Pedidos.getCod());
        salvar(Pedidos);
    }
    
     public static void visualiza_tabela(String tabela, String... atributo){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM "+ tabela);
            ResultSet rs = ps.executeQuery();
            
            String s = "";
            while(rs.next()){
                for(String i : atributo){
                    s = s + " | " +rs.getString(i);
                }
                s = s + "\n";
            }
            System.out.println(s);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static void criar_tabela (String tabela, String... atributo){
        try{
            Connection con = Banco.getConnection();
            String comando = "CREATE TABLE " + tabela + "(";
            
            for(String i : atributo){
                comando = comando + i + ",";
            }
            comando = comando.substring(0, comando.length()-1);
            comando = comando + ");";
        
            PreparedStatement ps = con.prepareStatement(comando);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}