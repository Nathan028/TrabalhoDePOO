/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.diagrama;

import br.edu.ifpr.thecoxinhagame.conexao.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CadastroMago extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPersonagem
     */
    public CadastroMago() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        int ataque = (int) (Math.random() * (20 - 15 + 1) + 15);
        txtPontosAtaque.setText("" + ataque);

        int defesa = (int) (Math.random() * (15 - 10 + 1) + 10);
        txtPontosDefesa.setText("" + defesa);

        int inteligencia = (int) (Math.random() * (10 - 2 + 1) + 2);
        txtInteligencia.setText("" + inteligencia);

        int recuperacao = (int) (Math.random() * (10 - 2 + 1) + 2);
        txtRecuperacao.setText("" + recuperacao);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtRecuperacao = new javax.swing.JTextField();
        txtPontosVida = new javax.swing.JTextField();
        txtPontosAtaque = new javax.swing.JTextField();
        txtPontosDefesa = new javax.swing.JTextField();
        txtInteligencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(422, 432));
        setMinimumSize(new java.awt.Dimension(422, 432));
        setPreferredSize(new java.awt.Dimension(422, 432));
        setSize(new java.awt.Dimension(422, 432));
        getContentPane().setLayout(null);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 36, 16);

        jLabel3.setText("Pontos de Vida");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 79, 16);

        jLabel4.setText("Pontos de Ataque");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 94, 16);

        jLabel5.setText("Pontos de Defesa");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 190, 91, 16);

        jLabel6.setText("Inteligencia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 250, 70, 16);

        jLabel7.setText("Recuperação");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 310, 80, 16);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/guerreiro fofo.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 110, 230, 250);

        jButton1.setText("Salvar Mago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 380, 150, 30);

        txtNome.setText("Saori");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(10, 30, 170, 22);

        txtRecuperacao.setEditable(false);
        txtRecuperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecuperacaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtRecuperacao);
        txtRecuperacao.setBounds(10, 330, 170, 22);

        txtPontosVida.setEditable(false);
        txtPontosVida.setText("100");
        txtPontosVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPontosVidaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPontosVida);
        txtPontosVida.setBounds(10, 90, 170, 22);

        txtPontosAtaque.setEditable(false);
        txtPontosAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPontosAtaqueActionPerformed(evt);
            }
        });
        getContentPane().add(txtPontosAtaque);
        txtPontosAtaque.setBounds(10, 150, 170, 22);

        txtPontosDefesa.setEditable(false);
        txtPontosDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPontosDefesaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPontosDefesa);
        txtPontosDefesa.setBounds(10, 210, 170, 22);

        txtInteligencia.setEditable(false);
        txtInteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInteligenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtInteligencia);
        txtInteligencia.setBounds(10, 270, 170, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/FUNDOSSS.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 430, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPontosVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPontosVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPontosVidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mago mago = new Mago();

        mago.setNome(txtNome.getText());
        mago.setPontosVida(Integer.parseInt(txtPontosVida.getText()));
        mago.setPontosAtaque(Integer.parseInt(txtPontosAtaque.getText()));
        mago.setPontosDefesa(Integer.parseInt(txtPontosDefesa.getText()));
        mago.setInteligencia(Integer.parseInt(txtInteligencia.getText()));
        mago.setRecuperacao(Integer.parseInt(txtRecuperacao.getText()));

        salvar(mago);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPontosAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPontosAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPontosAtaqueActionPerformed

    private void txtPontosDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPontosDefesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPontosDefesaActionPerformed

    private void txtInteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInteligenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteligenciaActionPerformed

    private void txtRecuperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecuperacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecuperacaoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtInteligencia;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPontosAtaque;
    private javax.swing.JTextField txtPontosDefesa;
    private javax.swing.JTextField txtPontosVida;
    private javax.swing.JTextField txtRecuperacao;
    // End of variables declaration//GEN-END:variables

    private void salvar(Mago mago) {
        String sql = "INSERT "
                + "INTO `tb_mago` "
                + "(`nome`, `ponto_vida`, `ponto_ataque`, `ponto_defesa`, `inteligencia`, `recuperacao`) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?);";
        try {
                PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(sql);
                preparacaoDaInstrucao.setString(1, mago.getNome());
                preparacaoDaInstrucao.setInt(2, mago.getPontosVida());
                preparacaoDaInstrucao.setInt(3, mago.getPontosAtaque());
                preparacaoDaInstrucao.setInt(4, mago.getPontosDefesa());
                preparacaoDaInstrucao.setInt(5, mago.getInteligencia());
                preparacaoDaInstrucao.setInt(6, mago.getRecuperacao());
                preparacaoDaInstrucao.executeUpdate();
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                this.dispose(); // libera a memória da janela
                new TelaDeCadastro().setVisible(true); // exibe a tela inicial
        } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao salvar!");
        }
    }


}
