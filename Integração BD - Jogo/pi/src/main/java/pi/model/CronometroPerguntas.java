package pi.model;

import java.util.Timer;
import java.util.TimerTask;

public class CronometroPerguntas {

    // Definição das variáveis
    private int tempoRestante;
    private Timer timer;

    public CronometroPerguntas() {
        this.tempoRestante = 5; // Tempo inicial de 60 segundos
        this.timer = null;
    }

    // Início do cronômetro
    public void iniciar() {
        if (timer == null) {
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    tempoRestante--;
                }
            }, 0, 1000); // Atualiza a cada 1 segundo
        }
    }

    // Atualização do tempo restante a cada segundo
    public int getTempoRestante() {
        return tempoRestante;
    }

    // Interromper cronômetro
    public void parar() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }
}
