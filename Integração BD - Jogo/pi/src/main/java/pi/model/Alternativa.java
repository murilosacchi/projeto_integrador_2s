/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi.model;

/**
 *
 * @author 23.01355-9
 */
public class Alternativa {

    //Definição de Variáveis
    private int idResposta;
    private String alternativa;
    private boolean correta;

    //Construtor setter
    public Alternativa(int idResposta, String alternativa, boolean correta) {
        this.idResposta = idResposta;
        this.alternativa = alternativa;
        this.correta = correta;
    }

    //Getters
    public String getAlternativa() {
        return alternativa;
    }
    
    public int getIdResposta() {
        return idResposta;
    }
    
    public boolean getCorreta() {
        return correta;
    }
    
   
}