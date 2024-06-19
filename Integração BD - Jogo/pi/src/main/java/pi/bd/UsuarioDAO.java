/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi.bd;

import pi.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 23.10270-5
 */
public class UsuarioDAO {
    //catch or declare
    public boolean existe(Usuario u) throws Exception{
        //1. Especificar o comando SQL (Select)
        String sql = "SELECT * FROM professor WHERE login = ? AND senha = ?";
        
        //2. Estabelecer uma conexão com o banco de dados
        Connection conexao = new ConnectionFactory().obterConexao();
        
        //3. Preparar o comando 
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        //4. Substituir os eventuais palceholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        
        //5. Executar o comando
        ResultSet rs = ps.executeQuery();
        
        //6. Lidar com o resultado
        boolean achou = rs.next();
        
        //7. Fechar a conexao
        conexao.close();
        
        //8. Devolver o resultado obtido da base
        return achou;
        
    }
    
}
