/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package pi.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import pi.bd.ConnectionFactory;
import java.util.Random;


/**
 *
 * @author 23.01355-9
 */
public class Pergunta {
    //Inicialização de atributos
    private String perguntaTexto;
    private List<Alternativa> alternativas;
    static private int tamanhoTabela;
    private int idPergunta;

    //Obtenção do tamanho da tabela
    static{
        try {
            //Comando sql
            String sql = "SELECT COUNT(*) FROM pergunta";
            
            //Abertura de conexão
            Connection conexao = new ConnectionFactory().obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            //Execução do comando
            ResultSet rs = ps.executeQuery();
    
            //Tratamento de dados obtidos
            if (rs.next()) {
                tamanhoTabela = Integer.parseInt((rs.getString("COUNT(*)")).trim());
        
            }
    
            rs.close();
            ps.close();
            conexao.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Métodos

    //Getters e Setters
    public int getTamanhoTabela() {
        return tamanhoTabela;
    }
    public void setTamanhoTabela(int tamanhoTabela) {
        Pergunta.tamanhoTabela = tamanhoTabela;
    }
    public String getPerguntaTexto() {
        return perguntaTexto;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }

    public int getIdPergunta() {
        return idPergunta;
    }

    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }

    public void setPerguntaTexto(String perguntaTexto) {
        this.perguntaTexto = perguntaTexto;
    }

    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }

    //Método que obtem uma Questão e uma lista com suas quatro alternativas e as atribui a suas respectivas variaveis
    public void obterQuestao(int id) throws Exception {
        //Comando sql
        String sql = "SELECT * FROM pergunta WHERE idPergunta = ?";

        //Abertura de conexão
        Connection conexao = new ConnectionFactory().obterConexao();

        //Compilação do comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, Integer.toString(id));

        //Execução do comando
        ResultSet rs = ps.executeQuery();

        //Tratamento de dados obtidos
        if (rs.next()) {
            perguntaTexto = rs.getString("pergunta");
            alternativas = obterAlternativas(id);
            setPerguntaTexto(perguntaTexto);
            
        }

        rs.close();
        ps.close();
        conexao.close();
        

    }

    //Método que retorna uma lista de instâncias da classe Alternativa
    public List<Alternativa> obterAlternativas(int idPergunta) throws Exception {
        //Inicialização da lista
        List<Alternativa> alternativas = new ArrayList<>();

        //Comando sql
        String sql = "SELECT alternativa, idResposta, correta FROM resposta WHERE idPergunta = ? ORDER BY idResposta";

        try (
            //Abertura de conexão
            Connection conexao = new ConnectionFactory().obterConexao();

            //Compilação do comando
            PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, idPergunta);

            //Execução do comando
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    //Tratamento de dados obtidos
                    String alternativaTexto = rs.getString("alternativa");
                    int idResposta = rs.getInt("idResposta");
                    boolean correta = rs.getBoolean("correta");

                    Alternativa alternativa = new Alternativa(idResposta, alternativaTexto, correta);
                    alternativas.add(alternativa);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("Erro ao obter alternativas", e);
        }

        return alternativas;
    }

    //Construtor que obtem questões aleatoriamente
    public Pergunta(){
        //Geração de um número aleatório
        Random random = new Random();
        int randomNum = random.nextInt((tamanhoTabela - 1) + 1) + 1;
        setIdPergunta(randomNum);

        try{
            obterQuestao(randomNum);
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}


