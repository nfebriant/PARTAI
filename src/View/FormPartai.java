/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPartai;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author nanan
 */
public class FormPartai extends javax.swing.JFrame {
    ControllerPartai cp;
    /**
     * Creates new form FormPartai
     */
    public FormPartai() {
        initComponents();
        tf_no.setEditable(false);
        tf_no.setEnabled(false);
        cp =  new ControllerPartai(this);
        cp.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_hapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_perbarui = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_no = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_komoditas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_daerah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_harga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_partai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_hapus.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btn_hapus.setLabel("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("HASIL");

        btn_perbarui.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btn_perbarui.setText("Perbarui");
        btn_perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perbaruiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("MASUKKAN DATA");

        btn_tambah.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_tambah.setLabel("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_batal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Cari Daerah");

        tf_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cariActionPerformed(evt);
            }
        });

        btn_cari.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("PARTAI");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel2.setText("No");

        tf_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_noActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel3.setText("Komoditas");

        tf_komoditas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_komoditasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel4.setText("Daerah");

        tf_daerah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_daerahActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel5.setText("Harga");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel7.setText("Pantau Harga Tani");

        tf_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hargaActionPerformed(evt);
            }
        });

        tbl_partai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_partai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_partaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_partai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(64, 64, 64)
                                    .addComponent(tf_komoditas))
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(122, 122, 122)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_daerah, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_no, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(98, 98, 98)
                                .addComponent(tf_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(379, 379, 379)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_perbarui, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_no))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_komoditas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_daerah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btn_batal)
                        .addContainerGap(248, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        cp.insert();
        cp.isiTable();
        cp.reset();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void tf_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cariActionPerformed

    private void tf_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_noActionPerformed

    private void tf_komoditasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_komoditasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_komoditasActionPerformed

    private void tf_daerahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_daerahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_daerahActionPerformed

    private void tf_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hargaActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        cp.reset();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void tbl_partaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_partaiMouseClicked
        // TODO add your handling code here:
        cp.isiField(tbl_partai.getSelectedRow());
    }//GEN-LAST:event_tbl_partaiMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        cp.delete();
        cp.isiTable();
        cp.reset();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perbaruiActionPerformed
        // TODO add your handling code here:
        cp.update();
        cp.isiTable();
        cp.reset();
    }//GEN-LAST:event_btn_perbaruiActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        cp.cariDaerah();
    }//GEN-LAST:event_btn_cariActionPerformed

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
            java.util.logging.Logger.getLogger(FormPartai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPartai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPartai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPartai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPartai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_perbarui;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_partai;
    private javax.swing.JTextField tf_cari;
    private javax.swing.JTextField tf_daerah;
    private javax.swing.JTextField tf_harga;
    private javax.swing.JTextField tf_komoditas;
    private javax.swing.JTextField tf_no;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_batal() {
        return btn_batal;
    }

    public void setBtn_batal(JButton btn_batal) {
        this.btn_batal = btn_batal;
    }

    public JButton getBtn_cari() {
        return btn_cari;
    }

    public void setBtn_cari(JButton btn_cari) {
        this.btn_cari = btn_cari;
    }

    public JButton getBtn_hapus() {
        return btn_hapus;
    }

    public void setBtn_hapus(JButton btn_hapus) {
        this.btn_hapus = btn_hapus;
    }

    public JButton getBtn_perbarui() {
        return btn_perbarui;
    }

    public void setBtn_perbarui(JButton btn_perbarui) {
        this.btn_perbarui = btn_perbarui;
    }

    public JButton getBtn_tambah() {
        return btn_tambah;
    }

    public void setBtn_tambah(JButton btn_tambah) {
        this.btn_tambah = btn_tambah;
    }

    public JTable getTbl_partai() {
        return tbl_partai;
    }

    public void setTbl_partai(JTable tbl_partai) {
        this.tbl_partai = tbl_partai;
    }

    

    public JTextField getTf_cari() {
        return tf_cari;
    }

    public void setTf_cari(JTextField tf_cari) {
        this.tf_cari = tf_cari;
    }

    public JTextField getTf_daerah() {
        return tf_daerah;
    }

    public void setTf_daerah(JTextField tf_daerah) {
        this.tf_daerah = tf_daerah;
    }

    public JTextField getTf_harga() {
        return tf_harga;
    }

    public void setTf_harga(JTextField tf_harga) {
        this.tf_harga = tf_harga;
    }

    public JTextField getTf_komoditas() {
        return tf_komoditas;
    }

    public void setTf_komoditas(JTextField tf_komoditas) {
        this.tf_komoditas = tf_komoditas;
    }

    public JTextField getTf_no() {
        return tf_no;
    }

    public void setTf_no(JTextField tf_no) {
        this.tf_no = tf_no;
    }
    

}
