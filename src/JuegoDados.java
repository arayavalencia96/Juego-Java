import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Axel Araya
 */
public class JuegoDados extends javax.swing.JDialog {
    
    public JuegoDados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(colorFondo);
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("dados/icono.png")));
    }

    public JuegoDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalScore2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        turnoPlayers = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namePlayer1 = new javax.swing.JTextField();
        namePlayer2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pointParcial1 = new javax.swing.JTextField();
        totalScore1 = new javax.swing.JTextField();
        pointParcial2 = new javax.swing.JTextField();
        btnReiniciar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juego Dados");
        setBackground(new java.awt.Color(0, 51, 51));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/4.png"))); // NOI18N

        totalScore2.setEditable(false);
        totalScore2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("JUGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        turnoPlayers.setEditable(false);
        turnoPlayers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        turnoPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoPlayersActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jugador 1:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jugador 2:");

        namePlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namePlayer1ActionPerformed(evt);
            }
        });

        namePlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namePlayer2ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jugador 1:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jugador 2:");

        pointParcial1.setEditable(false);
        pointParcial1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        totalScore1.setEditable(false);
        totalScore1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pointParcial2.setEditable(false);
        pointParcial2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        menuArchivo.setText("Archivo");

        jMenuItem1.setText("salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuArchivo.add(jMenuItem1);

        jMenuBar1.add(menuArchivo);

        menuAyuda.setText("Ayuda");

        jMenuItem2.setText("Información");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAyuda.add(jMenuItem2);

        jMenuItem3.setText("Reglas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuAyuda.add(jMenuItem3);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(turnoPlayers)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(namePlayer1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(namePlayer2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pointParcial2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pointParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalScore1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(totalScore2))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnReiniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(turnoPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pointParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalScore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalScore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointParcial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReiniciar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int i=1;
    ArrayList<Integer> lista = new ArrayList();
    int sumatotal=0;
    ArrayList<Integer> lista1 = new ArrayList();
    int sumatotal1=0;
    JFrame jFrame = new JFrame();
    Color colorFondo = new Color(119,12,12);
       
    private void limpiar(){
        i=1;
        lista.clear();
        lista1.clear();
        sumatotal=0;
        sumatotal1=0;
        namePlayer1.setText("");
        namePlayer2.setText("");
        turnoPlayers.setText("");
        pointParcial1.setText("");
        pointParcial2.setText("");
        totalScore1.setText("");
        totalScore2.setText("");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int dado1 = (int)(Math.random()*6)+1;
        int dado2 = (int)(Math.random()*6)+1;
        int resultado1 = dado1 + dado2;
        int resultado2 = dado1 + dado2;
        
        Icon uno = new javax.swing.ImageIcon(getClass().getResource("/dados/1.png"));
        Icon dos = new javax.swing.ImageIcon(getClass().getResource("/dados/2.png"));
        Icon tres = new javax.swing.ImageIcon(getClass().getResource("/dados/3.png"));
        Icon cuatro = new javax.swing.ImageIcon(getClass().getResource("/dados/4.png"));
        Icon cinco = new javax.swing.ImageIcon(getClass().getResource("/dados/5.png"));
        Icon seis = new javax.swing.ImageIcon(getClass().getResource("/dados/6.png"));
        
        if(i<=10){
        
            do{
                if(i<=10){
                    switch(dado1){
                        case 1: jLabel1.setIcon(uno); break;
                        case 2: jLabel1.setIcon(dos); break;
                        case 3: jLabel1.setIcon(tres); break;
                        case 4: jLabel1.setIcon(cuatro); break;
                        case 5: jLabel1.setIcon(cinco); break;
                        case 6: jLabel1.setIcon(seis); break;
                    }
                    switch(dado2){
                        case 1: jLabel2.setIcon(uno); break;
                        case 2: jLabel2.setIcon(dos); break;
                        case 3: jLabel2.setIcon(tres); break;
                        case 4: jLabel2.setIcon(cuatro); break;
                        case 5: jLabel2.setIcon(cinco); break;
                        case 6: jLabel2.setIcon(seis); break;
                    }
                    pointParcial1.setText(resultado1+" puntos");
                    turnoPlayers.setText("Turno de Jugador 1");
                    lista.add(resultado1);
                    
                    if(i==10){
                        for(int a=0;a<lista.size();a++){
                            sumatotal+=Integer.parseInt(lista.get(a).toString());
                        }totalScore1.setText(Integer.toString(sumatotal));
                    }
                    break;
                }
                else{
                    turnoPlayers.setText("Turno de Jugador 2");
                }


            }while(i<=10);
            i++;
        }else{

            do{
                if(i>10 && i<=20){
                    switch(dado1){
                        case 1: jLabel1.setIcon(uno); break;
                        case 2: jLabel1.setIcon(dos); break;
                        case 3: jLabel1.setIcon(tres); break;
                        case 4: jLabel1.setIcon(cuatro); break;
                        case 5: jLabel1.setIcon(cinco); break;
                        case 6: jLabel1.setIcon(seis); break;
                    }
                    switch(dado2){
                        case 1: jLabel2.setIcon(uno); break;
                        case 2: jLabel2.setIcon(dos); break;
                        case 3: jLabel2.setIcon(tres); break;
                        case 4: jLabel2.setIcon(cuatro); break;
                        case 5: jLabel2.setIcon(cinco); break;
                        case 6: jLabel2.setIcon(seis); break;
                    }
                    pointParcial2.setText(resultado2+" puntos");
                    turnoPlayers.setText("Turno de Jugador 2");
                    lista1.add(resultado2);
                    
                    if(i==20){
                        for(int a=0;a<lista.size();a++){
                            sumatotal1+=Integer.parseInt(lista1.get(a).toString());
                        }totalScore2.setText(Integer.toString(sumatotal1));
                    }
                    break;
                }
                else{
                    turnoPlayers.setText("FIN DEL JUEGO");
                }


            }while(i>10 && i<=20);
            i++;
            
        if(i>20) {
            if (sumatotal>sumatotal1){ 
                JOptionPane.showMessageDialog(jFrame,"Ganaste "+namePlayer1.getText()+"!!");
            }else if(sumatotal<sumatotal1){
                JOptionPane.showMessageDialog(jFrame,"Ganaste "+namePlayer2.getText()+"!!");
            }else if(sumatotal==sumatotal1){
                JOptionPane.showMessageDialog(jFrame,"Empate");
        }
        }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void turnoPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoPlayersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnoPlayersActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(jFrame,"Producto realizado por Araya Axel.\n Por dudas o consultas comunicarse a arayavalencia96@gmail.com");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void namePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namePlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namePlayer1ActionPerformed

    private void namePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namePlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namePlayer2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(jFrame,"Jugador 1 tira 10 veces los dados y da por pantalla resultado final.\nLo mismo sucede con Jugador 2.\nAl finalizar se dirá el ganador. Suerte!");
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JuegoDados dialog = new JuegoDados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JTextField namePlayer1;
    private javax.swing.JTextField namePlayer2;
    private javax.swing.JTextField pointParcial1;
    private javax.swing.JTextField pointParcial2;
    private javax.swing.JTextField totalScore1;
    private javax.swing.JTextField totalScore2;
    private javax.swing.JTextField turnoPlayers;
    // End of variables declaration//GEN-END:variables
}
