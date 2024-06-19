/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pi.telas;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author muril
 */
public class JogarPage extends JFrame {

    private String perguntaQuestao;
    private String alt1;
    private String alt2;
    private String alt3;
    private String alt4;
    private int escolha;
    private int vidaAliado;
    private int vidaInimigo;
    private int inimigoMaxHealth;

    public void setAlt1(String alt1) {
        this.alt1 = alt1;
        respostaButton1.setText(alt1);
    }

    public void setAlt2(String alt2) {
        this.alt2 = alt2;
        respostaButton2.setText(alt2);
    }

    public void setAlt3(String alt3) {
        this.alt3 = alt3;
        respostaButton3.setText(alt3);
    }

    public void setAlt4(String alt4) {
        this.alt4 = alt4;
        respostaButton4.setText(alt4);
    }

    public void setPerguntaQuestao(String perguntaQuestao) {
        this.perguntaQuestao = perguntaQuestao;
        perguntaTextPane.setText(perguntaQuestao);
    }

    public void setNomeAliado(String nomeAliado){
        personagemName.setText(nomeAliado);

    }

    public void setNomeInimigo(String nomeInimigo){
        inimigoName.setText(nomeInimigo);
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public void setPersonagemHealth(int vidaAliado) {
        this.vidaAliado = vidaAliado;
        personagemHealth.setValue(vidaAliado);
    }

    public void setInimigoHealth(int vidaInimigo) {
        this.vidaInimigo = vidaInimigo;
        inimigoHealth.setValue(vidaInimigo);
    }

    public int getPersonagemHealth() {
        return personagemHealth.getValue();
    }

    public int getInimigoHealth() {
        return inimigoHealth.getValue();
    }

    public void setInimigoMaxHealth(int inimigoMaxHealth) {
        this.inimigoMaxHealth = inimigoMaxHealth;
        inimigoHealth.setMaximum(inimigoMaxHealth);
    }

    public int getInimigoMaxHealth() {
        return inimigoMaxHealth;
    }

    
    public void apagarBotao(int botao) {
        if (botao == 1) {
            respostaButton1.setText("");

        }

        else if (botao == 2) {
            respostaButton2.setText("");

        }

        else if (botao == 3) {
            respostaButton3.setText("");

        }

        else if (botao == 4) {
            respostaButton4.setText("");

        }
    }

    public void vermelhoBotao(int botao) {
        if (botao == 1) {
            respostaButton1.setBackground(new java.awt.Color(255, 0, 0));
            respostaButton1.setForeground(new Color(250, 250, 250));

        }

        else if (botao == 2) {
            respostaButton2.setBackground(new java.awt.Color(255, 0, 0));
            respostaButton2.setForeground(new Color(250, 250, 250));
        } else if (botao == 3) {
            respostaButton3.setBackground(new java.awt.Color(255, 0, 0));
            respostaButton3.setForeground(new Color(250, 250, 250));
        } else if (botao == 4) {

            respostaButton4.setBackground(new java.awt.Color(255, 0, 0));
            respostaButton4.setForeground(new Color(250, 250, 250));
        }
    }

    public void verdeBotao(int botao) {
        if (botao == 1) {
            respostaButton1.setBackground(new java.awt.Color(0, 158, 0));
            respostaButton1.setForeground(new Color(250, 250, 250));
        } else if (botao == 2) {
            respostaButton2.setBackground(new java.awt.Color(0, 158, 0));
            respostaButton2.setForeground(new Color(250, 250, 250));
        } else if (botao == 3) {
            respostaButton3.setBackground(new java.awt.Color(0, 158, 0));
            respostaButton3.setForeground(new Color(250, 250, 250));
        } else if (botao == 4) {
            respostaButton4.setBackground(new java.awt.Color(0, 158, 0));
            respostaButton4.setForeground(new Color(250, 250, 250));

        }
    }

    public void iniciarBotoes() {
        respostaButton1.setBackground(new java.awt.Color(250, 250, 250));
        respostaButton2.setBackground(new java.awt.Color(250, 250, 250));
        respostaButton3.setBackground(new java.awt.Color(250, 250, 250));
        respostaButton4.setBackground(new java.awt.Color(250, 250, 250));
        respostaButton1.setForeground(new Color(0, 0, 0));
        respostaButton2.setForeground(new Color(0, 0, 0));
        respostaButton3.setForeground(new Color(0, 0, 0));
        respostaButton4.setForeground(new Color(0, 0, 0));

    }

    public void exibirDente(){
        denteImage.setVisible(true);
    }
    public void exibirEsofago(){
        esofagoImage.setVisible(true);
    }
    public void exibirEstomago(){
        estomagoImage.setVisible(true);
    }
    public void exibirDelgado(){
        delgadoImage.setVisible(true);
    }
    public void exibirGrosso(){
        grossoImage.setVisible(true);
    }
    public void exibirMaca(){
        macaImage.setVisible(true);
    }
    public void exibirChocolate(){
        chocolateImage.setVisible(true);
    }
    public void exibirBife(){
        bifeImage.setVisible(true);
    }
    public void exibirFundo(){
        jLabel1.setVisible(true);
    }
    public void esconderDente(){
        denteImage.setVisible(false);
    }
    public void esconderEsofago(){
        esofagoImage.setVisible(false);
    }
    public void esconderEstomago(){
        estomagoImage.setVisible(false);
    }
    public void esconderDelgado(){
        delgadoImage.setVisible(false);
    }
    public void esconderGrosso(){
        grossoImage.setVisible(false);
    }
    
    public void esconderMaca(){
        macaImage.setVisible(false);
    }
    public void esconderChocolate(){
        chocolateImage.setVisible(false);
    }
    public void esconderBife(){
        bifeImage.setVisible(false);
    }
    public void esconderFundo(){
        jLabel1.setVisible(false);
    }
    
    


    /**
     * Creates new form
     */

    public JogarPage() {
        setUndecorated(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        denteImage = new javax.swing.JLabel();
        chocolateImage = new javax.swing.JLabel();
        personagemHealth = new javax.swing.JProgressBar();
        personagemHealth.setValue(100);
        personagemHealth.setForeground(Color.RED);
        personagemHealth.setBackground(Color.WHITE);
        inimigoHealth = new javax.swing.JProgressBar();
        inimigoHealth.setValue(0);
        inimigoHealth.setForeground(Color.WHITE);
        inimigoHealth.setBackground(Color.RED);
        personagemName = new javax.swing.JLabel();
        inimigoName = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        timerProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        perguntaTextPane = new javax.swing.JTextPane();
        respostaButton1 = new javax.swing.JButton();
        respostaButton2 = new javax.swing.JButton();
        respostaButton3 = new javax.swing.JButton();
        respostaButton4 = new javax.swing.JButton();
        esofagoImage = new javax.swing.JLabel();
        estomagoImage = new javax.swing.JLabel();
        delgadoImage = new javax.swing.JLabel();
        grossoImage = new javax.swing.JLabel();
        bifeImage = new javax.swing.JLabel();
        macaImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(56, 2, 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        denteImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/DenteV2.png"))); // NOI18N
        jPanel1.add(denteImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 300, 300));

        
        chocolateImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/Chocolate.png"))); // NOI18N
        jPanel1.add(chocolateImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));
        jPanel1.add(personagemHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, 30));
        jPanel1.add(inimigoHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 400, 30));

        personagemName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        personagemName.setForeground(new java.awt.Color(255, 255, 255));
        personagemName.setText("Dentuce");
        jPanel1.add(personagemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        inimigoName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inimigoName.setForeground(new java.awt.Color(255, 255, 255));
        inimigoName.setText("Chocolatudx");
        jPanel1.add(inimigoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        sairButton.setText("SAIR");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));
        jPanel1.add(timerProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1080, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/Fundo_recortado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        perguntaTextPane.setEditable(false);
        perguntaTextPane.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        perguntaTextPane.setText("Qual dos seguintes órgãos NÃO faz parte do sistema digestivo humano?");
        jScrollPane1.setViewportView(perguntaTextPane);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1080, 50));

        respostaButton1.setText("Intestino");
        respostaButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respostaButton1MouseClicked(evt);
            }
        });
        respostaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(respostaButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 540, 80));

        respostaButton2.setText("Pulmão");
        respostaButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respostaButton2MouseClicked(evt);
            }
        });
        respostaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(respostaButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 540, 80));

        respostaButton3.setText("Estômago");
        respostaButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respostaButton3MouseClicked(evt);
            }
        });
        respostaButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(respostaButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 540, 80));

        respostaButton4.setText("Esôfago");
        respostaButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respostaButton4MouseClicked(evt);
            }
        });
        respostaButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(respostaButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 540, 80));

        esofagoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/EsôfagoV3.png")));
        jPanel1.add(esofagoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 300, 300));

        estomagoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/EstômagoV3.png")));
        jPanel1.add(estomagoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 300, 300));

        delgadoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/DelgadoV3.png")));
        jPanel1.add(delgadoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 300, 300));

        grossoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/GrossoV3.png")));
        jPanel1.add(grossoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 300, 300));

        bifeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/Bife2.png")));
        jPanel1.add(bifeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 260, 311));

        macaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/newpackage/Maçã2.png")));
        jPanel1.add(macaImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 260, 311));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void respostaButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_respostaButton1MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_respostaButton1MouseClicked

    private void respostaButton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_respostaButton2MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_respostaButton2MouseClicked

    private void respostaButton3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_respostaButton3MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_respostaButton3MouseClicked

    private void respostaButton4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_respostaButton4MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_respostaButton4MouseClicked

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.setVisible(true);
        dispose();
    }// GEN-LAST:event_sairButtonActionPerformed

    private void muteButtonStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_muteButtonStateChanged
        // TODO add your handling code here:
    }// GEN-LAST:event_muteButtonStateChanged

    private void muteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_muteButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_muteButtonActionPerformed

    private void respostaButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_respostaButton1ActionPerformed
        escolha = 1;
    }// GEN-LAST:event_respostaButton1ActionPerformed

    private void respostaButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_respostaButton3ActionPerformed
        escolha = 3;
    }// GEN-LAST:event_respostaButton3ActionPerformed

    private void respostaButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_respostaButton2ActionPerformed

        escolha = 2;
    }// GEN-LAST:event_respostaButton2ActionPerformed

    private void respostaButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_respostaButton4ActionPerformed
        escolha = 4;
    }// GEN-LAST:event_respostaButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new JogarPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bifeImage;
    private javax.swing.JLabel chocolateImage;
    private javax.swing.JLabel delgadoImage;
    private javax.swing.JLabel denteImage;
    private javax.swing.JLabel esofagoImage;
    private javax.swing.JLabel estomagoImage;
    private javax.swing.JLabel grossoImage;
    private javax.swing.JProgressBar inimigoHealth;
    private javax.swing.JLabel inimigoName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel macaImage;
    private javax.swing.JTextPane perguntaTextPane;
    private javax.swing.JProgressBar personagemHealth;
    private javax.swing.JLabel personagemName;
    private javax.swing.JButton respostaButton1;
    private javax.swing.JButton respostaButton2;
    private javax.swing.JButton respostaButton3;
    private javax.swing.JButton respostaButton4;
    private javax.swing.JButton sairButton;
    private javax.swing.JProgressBar timerProgressBar;
    // End of variables declaration//GEN-END:variables
}
