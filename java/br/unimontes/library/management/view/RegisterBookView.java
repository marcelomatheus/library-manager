/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.view;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author marce
 */
public class RegisterBookView extends javax.swing.JFrame {

    /**
     * Creates new form RegisterBookView
     */
    public RegisterBookView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bBackBook = new javax.swing.JButton();
        iIsbnSignupBook = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iNameSignupBook = new javax.swing.JTextField();
        iPagesSignupBook = new javax.swing.JTextField();
        iPublisherSignupBook = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iAuthorSignupBook = new javax.swing.JTextField();
        bSubmitBook = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bBackBook.setText("Voltar");
        bBackBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackBookActionPerformed(evt);
            }
        });

        jLabel1.setText("ISBN do livro");

        jLabel2.setText("Nome do livro");

        jLabel3.setText("Nº de Páginas");

        iNameSignupBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iNameSignupBookActionPerformed(evt);
            }
        });

        iPublisherSignupBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iPublisherSignupBookActionPerformed(evt);
            }
        });

        jLabel4.setText("CNPJ Editora");

        jLabel5.setText("Nome Autor");

        bSubmitBook.setText("Registrar");
        bSubmitBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitBookActionPerformed(evt);
            }
        });

        jLabel6.setText("Cadastro de Livros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(iAuthorSignupBook, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(iPagesSignupBook, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iIsbnSignupBook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(iNameSignupBook)
                            .addComponent(jLabel4)
                            .addComponent(iPublisherSignupBook, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(bBackBook, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(bSubmitBook)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBackBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iIsbnSignupBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iPagesSignupBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iNameSignupBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iPublisherSignupBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iAuthorSignupBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSubmitBook)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBackBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBackBookActionPerformed

    private void iNameSignupBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iNameSignupBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iNameSignupBookActionPerformed

    private void iPublisherSignupBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iPublisherSignupBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iPublisherSignupBookActionPerformed

    private void bSubmitBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSubmitBookActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterBookView().setVisible(true);
            }
        });
    }

    public JButton getbBackBook() {
        return bBackBook;
    }

    public void setbBackBook(JButton bBackBook) {
        this.bBackBook = bBackBook;
    }

    public JButton getbSubmitBook() {
        return bSubmitBook;
    }

    public void setbSubmitBook(JButton bSubmitBook) {
        this.bSubmitBook = bSubmitBook;
    }

    public JTextField getiAuthorSignupBook() {
        return iAuthorSignupBook;
    }

    public void setiAuthorSignupBook(JTextField iAuthorSignupBook) {
        this.iAuthorSignupBook = iAuthorSignupBook;
    }

    public JTextField getiIsbnSignupBook() {
        return iIsbnSignupBook;
    }

    public void setiIsbnSignupBook(JTextField iIsbnSignupBook) {
        this.iIsbnSignupBook = iIsbnSignupBook;
    }

    public JTextField getiNameSignupBook() {
        return iNameSignupBook;
    }

    public void setiNameSignupBook(JTextField iNameSignupBook) {
        this.iNameSignupBook = iNameSignupBook;
    }

    public JTextField getiPagesSignupBook() {
        return iPagesSignupBook;
    }

    public void setiPagesSignupBook(JTextField iPagesSignupBook) {
        this.iPagesSignupBook = iPagesSignupBook;
    }

    public JTextField getiPublisherSignupBook() {
        return iPublisherSignupBook;
    }

    public void setiPublisherSignupBook(JTextField iPublisherSignupBook) {
        this.iPublisherSignupBook = iPublisherSignupBook;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBackBook;
    private javax.swing.JButton bSubmitBook;
    private javax.swing.JTextField iAuthorSignupBook;
    private javax.swing.JTextField iIsbnSignupBook;
    private javax.swing.JTextField iNameSignupBook;
    private javax.swing.JTextField iPagesSignupBook;
    private javax.swing.JTextField iPublisherSignupBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
