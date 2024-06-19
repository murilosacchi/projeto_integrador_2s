/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi.bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 23.10270-5
 */
public class ConnectionFactory {

    private String host = "mysql-1af04ebf-expedicaonutritiva-18b6.e.aivencloud.com";
    private String port = "26874";
    private String db = "pi";
    private String user = "avnadmin";
    private String password = "AVNS_dqoN4ObnCRNsfh_qe93";

    public Connection obterConexao() throws Exception {
        //jdbc:mysql://host:port/db isso é uma string de conexao
        //catch or declare
        var stringConexao = String.format(
                "jdbc:mysql://%s:%s/%s", host, port, db
        );
        Connection conexao = DriverManager.getConnection(stringConexao, user, password);
        return conexao;

    }
;

}
