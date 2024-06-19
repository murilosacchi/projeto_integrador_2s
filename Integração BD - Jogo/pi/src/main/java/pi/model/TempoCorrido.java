package pi.model;

import java.util.Timer;
import java.util.TimerTask;

public class TempoCorrido {

    // Definição das variáveis
    private long tempoInicial;
    private long tempoFinal;
    private int tempoDecorridoSegundos;
    private Timer timer;

    // Atribuição de valores
    public TempoCorrido() {
        this.tempoInicial = 0;
        this.tempoFinal = 0;
        this.tempoDecorridoSegundos = 0;
        this.timer = null;
    }

    // Inicialização do tempo da aventura
    public void iniciar() {
        if (timer == null) {
            this.tempoInicial = System.currentTimeMillis();
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    atualizarTempoDecorrido();
                }
            }, 0, 1000); // Atualiza a cada 1 segundo
        }
    }

    // Pausa no tempo da aventura
    public void pausar() {
        if (timer != null) {
            this.tempoFinal = System.currentTimeMillis();
            timer.cancel();
            timer = null;
        }
    }

    // Retomar tempo da aventura
    public void retomar() {
        if (tempoFinal > 0) {
            this.tempoInicial += System.currentTimeMillis() - this.tempoFinal;
            this.tempoFinal = 0;
            iniciar(); // Reinicia o timer
        }
    }

    // -- Alterar método quando integrado ao FrontEnd -- (Necessário manipulação da label)
    public void exibirTempo() {
        System.out.println("Tempo decorrido: " + tempoDecorridoSegundos + " segundos");
    }

    // Atualização do tempo atual decorrido para SEGUNDOS
    private void atualizarTempoDecorrido() {
        long tempoAtual = System.currentTimeMillis();
        this.tempoDecorridoSegundos = (int) ((tempoAtual - this.tempoInicial) / 1000);
    }

    // Envio do tempo decorrido para formatação
    public int getTempoDecorridoSegundos() {
        return tempoDecorridoSegundos;
    }

    // Formatação do tempo da aventura no formato HH:MM:SS
    private String formatarTempo(int tempoDecorridoSegundos) {
        int horas = tempoDecorridoSegundos / 3600; 
        int minutosRestantes = tempoDecorridoSegundos % 3600; 
        int minutos = minutosRestantes / 60; 
        int segundos = minutosRestantes % 60;
    
        if (horas > 0) { // Verifica se há horas
            return String.format("%02d:%02d:%02d", horas, minutos, segundos);
        } else {
            return String.format("%02d:%02d:%02d", 00, minutos, segundos);
        }
    }

    // Retorno do tempo da aventura já formatado
    public String getTempoFormatado() {
        return formatarTempo(getTempoDecorridoSegundos());
    }
}
