package pi.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pi.bd.ConnectionFactory;


public class Ranking {

    private String apelidoAluno;
    private int idDificuldade;
    private int pontuacao;
    private String tempo;

    public Ranking(String apelidoAluno, int idDificuldade, int pontuacao, String tempo) {

        this.apelidoAluno = apelidoAluno;
        this.idDificuldade = idDificuldade;
        this.pontuacao = pontuacao;
        this.tempo = tempo;
    }

    public Ranking(ResultSet rs) throws Exception {

        this.apelidoAluno = rs.getString("apelidoAluno");
        this.idDificuldade = rs.getInt("idDificuldade");
        this.pontuacao = rs.getInt("pontuacao");
        this.tempo = rs.getString("tempo");
    }


    public void inserirRanking() {
        try {
            String sql = "INSERT INTO ranking (apelidoAluno, idDificuldade, pontuacao, tempo) VALUES (?, ?, ?, ?)";
            Connection conexao = new ConnectionFactory().obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, this.apelidoAluno);
            ps.setInt(2, this.idDificuldade);
            ps.setInt(3, this.pontuacao);
            ps.setString(4, this.tempo);
            ps.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static List<Ranking> recuperarRankings() throws Exception {
        String sql = "SELECT idRanking,apelidoAluno,idDificuldade,pontuacao,tempo FROM ranking ORDER BY pontuacao DESC,tempo LIMIT 10";
        Connection conexao = new ConnectionFactory().obterConexao();
        List<Ranking> rankings = new ArrayList<>();
        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Ranking ranking = new Ranking(rs);
                rankings.add(ranking);
            }
        }
        return rankings;
    }
    
}
