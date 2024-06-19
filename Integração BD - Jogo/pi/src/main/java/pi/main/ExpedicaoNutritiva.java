package pi.main;

import pi.model.*;
import pi.model.Personagem;
import pi.telas.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpedicaoNutritiva {
    public static void main(String[] args) throws Exception{
        LoadingPage telaIni = new LoadingPage();
        
        telaIni.setVisible(true);
        //PersonagemPage telaEscolha = new PersonagemPage();
        //telaEscolha.setVisible(true);
        
        // Instância do tempo corrido de uma aventura
        TempoCorrido tempoCorrido = new TempoCorrido();

        // Instância do cronômetro para cada pergunta
        CronometroPerguntas cronometroPerguntas = new CronometroPerguntas();

        //Scanner
        Scanner leitor = new Scanner(System.in);
        

        //Criacao de instancias dos personagens
        Personagem inimigo = new Personagem();
        Personagem aliado = new Personagem();

        //Definição de variáveis
        final int NUM_ALIADOS_MAXIMO = 5;
        int numQuestao = 0;
        int indiceFase = 0;
        int acertos = 0;
        int erros = 0;
        var perguntasFeitas = new ArrayList<Integer>();
        int escolhaInimigo = 0;
        int aliadoHP = 100;           
        int inimigoHP = 100;
        
        //escolhaInimigo = telaEscolha.getEscolha();

        //Definição e atribuição de valores 

            //Aliados
        final String [] NOME_ALIADO = {"O Dente","O Esôfago","O Estômago","O Intestino Delgado", "O Intestino Grosso"};
        final int VIDA_ALIADO = 100; //vida do corpo.
        final int [] ATAQUE_ALIADO = {10,10,10,15,20}; //ataque das partes do corpo respectivamente.

            //Atribuicao dos valores do aliado inicial
        aliado.setNome(NOME_ALIADO[0]);
        aliado.setAtaque(ATAQUE_ALIADO[0]);
        aliado.setVida(VIDA_ALIADO);

            //Inimigos 
        int [] vidaInimigo = {0,0,0,0,0};
        int [] ataqueInimigo = {0,0,0,0,0};
        final int [] FACIL_VIDA = {50,50,50,50,50}; 
        final int [] FACIL_ATAQUE = {10,10,10,10,10}; 
        final int [] MEDIO_VIDA = {50,50,50,40,40}; 
        final int [] MEDIO_ATAQUE = {10,15,15,15,15}; 
        final int [] DIFICIL_VIDA = {40,40,40,40,40}; 
        final int [] DIFICIL_ATAQUE = {15,15,20,20,20}; 
        
        JogarPage tela = new JogarPage();
        tela.esconderEsofago();
        tela.esconderEstomago();
        tela.esconderDelgado();
        tela.esconderGrosso();
            
        tela.exibirDente();
        tela.esconderFundo();
       
    
        //Saída Inicial
        System.out.println("Bem vindo à Expedição Nutritiva.");
        
        //Escolha do Alimento
        
        // while (escolhaInimigo != 1 && escolhaInimigo != 2  && escolhaInimigo != 3){
        //     System.out.println("Escolha seu alimento(Maca - 1, Chocolate - 2 ou Bife - 3):");
        //     escolhaInimigo = leitor.nextInt();
        //     System.out.println("-------------------------------------------------");
        //}
            //Inserção de dados da Maça
        escolhaInimigo = 1;
        inimigo.setNome("a Maça");
        vidaInimigo = FACIL_VIDA;
        ataqueInimigo = FACIL_ATAQUE;
        inimigo.setAtaque(ataqueInimigo[0]);
        inimigo.setVida(vidaInimigo[0]);
        tela.esconderBife();
        tela.esconderChocolate();
        tela.exibirMaca();
        tela.setNomeInimigo(inimigo.getNome());
            
        
         
            //Inserção de dados do Chocolate
         

            //Inserção de dados do Bife
        



        tela.setInimigoMaxHealth(100-vidaInimigo[indiceFase]);
        inimigo.setVida(0);
        //Inicialização do tempo
        tempoCorrido.iniciar();
        
        //Estrutura de repeticao das perguntas, respostas e tratamento das repostas.
        while(indiceFase < NUM_ALIADOS_MAXIMO){
            
            //Checagem da vida do aliado e do inimigo
            if(aliado.getVida() <= 0){
                System.out.println(String.format("Você morreu para a %sª forma d%s.",(indiceFase+1),inimigo.getNome()));
                System.out.println("-------------------------------------------------");
                break;
            }
            else if(inimigo.getVida() >= tela.getInimigoMaxHealth()){
                System.out.println(String.format("Parabéns, você derrotou a %sº forma d%s.",(indiceFase+1),inimigo.getNome()));
                System.out.println("-------------------------------------------------");
                indiceFase++;
                try{
                    //Atualizacao de variaveis ao trocar de fase
                    aliado.setNome(NOME_ALIADO[indiceFase]);
                    aliado.setAtaque(ATAQUE_ALIADO[indiceFase]);
                    inimigo.setAtaque(ataqueInimigo[indiceFase]);
                    inimigo.setVida(0);
                    tela.setInimigoMaxHealth(100-vidaInimigo[indiceFase]);
                    tela.setInimigoHealth(inimigo.getVida());
                    tela.setNomeAliado(aliado.getNome());
                    if(indiceFase == 1){
                        tela.esconderDente();
                        tela.exibirEsofago();
                        
                        inimigo.setNome("o Chocolate");
                        vidaInimigo = MEDIO_VIDA;
                        ataqueInimigo = MEDIO_ATAQUE;
                        inimigo.setAtaque(ataqueInimigo[0]);
                        inimigo.setVida(vidaInimigo[0]);
                        tela.esconderMaca();
                        tela.esconderBife();
                        tela.exibirChocolate();
                        tela.setNomeInimigo(inimigo.getNome());
                        
        
                    }
                    else if(indiceFase == 2){
                        tela.esconderEsofago();
                        tela.exibirEstomago();

                    }
                    else if(indiceFase == 3){
                        tela.esconderEstomago();
                        tela.exibirDelgado();
                        inimigo.setNome("o Bife");
                        vidaInimigo = DIFICIL_VIDA;
                        ataqueInimigo = DIFICIL_ATAQUE;
                        inimigo.setAtaque(ataqueInimigo[0]);
                        inimigo.setVida(vidaInimigo[0]);
                        tela.esconderMaca();
                        tela.esconderChocolate();
                        tela.exibirBife();
                        tela.setNomeInimigo(inimigo.getNome());
                    }
                    else if(indiceFase == 4){
                        tela.esconderDelgado();
                        tela.exibirGrosso();
                    }
                }
                catch(Exception e){
                    // Formatação do tempo corrido da aventura (Formato: HH:MM:SS)
                    tempoCorrido.pausar();
                    String tempoFormatado = tempoCorrido.getTempoFormatado();

                    //Registro da pontuação no ranking
                    System.out.println("Insira um apelido:");
                    leitor.next();
                    String apelido = leitor.next();
                    int pontuacao = ((acertos*40) - (erros*15))*escolhaInimigo;
                    Ranking rank = new Ranking(apelido,escolhaInimigo,pontuacao,tempoFormatado);
                    rank.inserirRanking();
                    break;
                }
            }

            //Saída dos dados.
            String dadosPersonagens = String.format("O corpo possui %s de vida e %s possui %s de ataque.\nEnquanto %s possui %s de vida e %s de ataque.",aliado.getVida(),aliado.getNome(),aliado.getAtaque(),inimigo.getNome(),inimigo.getVida(),inimigo.getAtaque());
            System.out.println(dadosPersonagens);
            System.out.println("-------------------------------------------------");
        

            //Contador no numero de questões
            numQuestao++;
            int correta = 0;

            //Construção da instancia da classe Pergunta.
            Pergunta pergunta;

            //Limitando as questões(uma questão so pode aparecer uma vez por jogo)
            do{ pergunta = new Pergunta();} 
            while(perguntasFeitas.contains(pergunta.getIdPergunta()));

            perguntasFeitas.add(pergunta.getIdPergunta());

            String perguntaQuestao = pergunta.getPerguntaTexto();
            var perguntaRespostas = pergunta.getAlternativas();

            //Inicialização do tempo

            // Inicialização da contagem do jogo
            tempoCorrido.iniciar();

            // Inicialização do cronômetro de perguntas
            cronometroPerguntas.iniciar();
            int tempoRestante = cronometroPerguntas.getTempoRestante();

            //Saída do número da questão e da pergunta.
            // String saidaPergunta = String.format("Questão %s.\n%s",numQuestao,perguntaQuestao);
            // System.out.println(saidaPergunta);

            //Saída das respostas.
            tela.setPerguntaQuestao(perguntaQuestao);
            tela.setAlt1(perguntaRespostas.get(0).getAlternativa());
            tela.setAlt2(perguntaRespostas.get(1).getAlternativa());
            tela.setAlt3(perguntaRespostas.get(2).getAlternativa());
            tela.setAlt4(perguntaRespostas.get(3).getAlternativa());
            tela.iniciarBotoes();
            tela.setVisible(true);
            for(int i = 0; i <= 3;i++){
                // String saidaResposta = String.format("Resposta (%s), %s",i+1,(perguntaRespostas.get(i).getAlternativa()));
                // System.out.println(saidaResposta);
                //Guardar o índice da resposta correta
                if (perguntaRespostas.get(i).getCorreta() == true){
                    correta = i+1;

                }
            }

            
            System.out.println("-------------------------------------------------");


            // while(checagem == false){ 
            //     // Verificação se o tempo limite esgotou
            //     if (tempoRestante <= 0) {
            //         inimigo.atacar(aliado);
            //         erros++;

            //         String out = String.format("Tempo esgotado! \nVocê recebeu %s de dano d%s.",inimigo.getAtaque(),inimigo.getNome());
            //         System.out.println(out);

            //         System.out.println("-------------------------------------------------");
            //         checagem = true;
            //     }

                // Verificação das respostas
                // else{
                    //Recebimento da resposta.
                    final int [] VALORES = {1,2,3,4};
                    int Resposta = 0;
                    tela.setEscolha(0);
                    
                    while(Resposta == 0){       
                            Resposta = tela.getEscolha(); 
                            if (Resposta != 0)
                            {
                                for(int val:VALORES){
                                    if (val == correta){
                                        tela.verdeBotao(val);
                                    }
                                    else if(val!=correta&&val!=Resposta){
                                        tela.apagarBotao(val);
                                    }
                                    else if(val!=correta&&val==Resposta){
                                        tela.vermelhoBotao(val);
                                    }
                                }
                                break;
                            }
                    } 
                

                    // Color blue = new Color(0, 0, 255); // Create a Color object for blue (RGB values)
                    // myButton.setForeground(blue);

                    //tela.set
                    
                    //Tratamento da resposta.
                        //Acerto.
                    if(Resposta == correta){

                        aliado.atacar2(inimigo);
                        acertos++;
                        String out = String.format("Você acertou a questão %s.\n%s de dano ao inimigo.",numQuestao,aliado.getAtaque());
                        System.out.println(out);

                        System.out.println("-------------------------------------------------");
                        
                        inimigoHP = tela.getInimigoHealth();
                        inimigoHP += aliado.getAtaque();
                        tela.setInimigoHealth(inimigoHP);
                        tela.setInimigoMaxHealth(100-vidaInimigo[indiceFase]);
                    }
                        //Erro.
                    else{
                        inimigo.atacar(aliado);
                        erros++;
                        String out = String.format("Você errou a questão %s.\nVocê recebeu %s de dano d%s.",numQuestao,inimigo.getAtaque(),inimigo.getNome());
                        System.out.println(out);

                        System.out.println("-------------------------------------------------");
                       

                        aliadoHP = tela.getPersonagemHealth();
                        aliadoHP -= inimigo.getAtaque();
                        tela.setPersonagemHealth(aliadoHP);
                    }       
                    
                // }
            // Parar o cronômetro
        //     cronometroPerguntas.parar();

        }

        System.out.println("Obrigado por jogar.");

        leitor.close();
        
    }
}
