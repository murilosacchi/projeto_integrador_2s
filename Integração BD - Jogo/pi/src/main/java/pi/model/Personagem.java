package pi.model;

/**
 *
 * @author 23.10270-5
 */

public class Personagem {
    //Definição de variáveis
    private int vida = 0;
    private int ataque = 0;
    private String nome;

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getAtaque(){
        return ataque;
    }

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    
    //Método que atualiza a vida do defensor baseado no ataque da instância
    public void atacar(Personagem defensor){
        int vidaDefensor = defensor.getVida() - getAtaque();
        defensor.setVida(vidaDefensor);
    }

    public void atacar2(Personagem defensor){
        int vidaDefensor = defensor.getVida() + getAtaque();
        defensor.setVida(vidaDefensor);
    }
}