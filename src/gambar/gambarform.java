/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gambar;

import javax.swing.JFileChooser;

/**
 *
 * @author DELL
 */
public class gambarform extends javax.swing.JFrame {

    /**
     * Creates new form gambarform
     */
    public ClassGambar gambar;
    public gambarform() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        miBuka = new javax.swing.JMenuItem();
        miSimpan = new javax.swing.JMenuItem();
        miKeluar = new javax.swing.JMenuItem();
        asdasd = new javax.swing.JMenu();
        miGrayscale = new javax.swing.JMenuItem();
        miBiner = new javax.swing.JMenuItem();
        miDefault = new javax.swing.JMenuItem();
        miBrightness = new javax.swing.JMenuItem();
        mnGeometri = new javax.swing.JMenu();
        zoomin = new javax.swing.JMenuItem();
        zoomout = new javax.swing.JMenuItem();
        flipv = new javax.swing.JMenuItem();
        fliph = new javax.swing.JMenuItem();
        mnRotation = new javax.swing.JMenu();
        mirotation90 = new javax.swing.JMenuItem();
        mirotation180 = new javax.swing.JMenuItem();
        mirotation270 = new javax.swing.JMenuItem();
        mirotation360 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PCD 1");

        jLabel1.setText("foto ne ini ya guys");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        mnFile.setText("File");

        miBuka.setText("Buka");
        miBuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBukaActionPerformed(evt);
            }
        });
        mnFile.add(miBuka);

        miSimpan.setText("Simpan");
        miSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSimpanActionPerformed(evt);
            }
        });
        mnFile.add(miSimpan);

        miKeluar.setText("Keluar");
        miKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKeluarActionPerformed(evt);
            }
        });
        mnFile.add(miKeluar);

        jMenuBar1.add(mnFile);

        asdasd.setText("Edit");

        miGrayscale.setText("Grayscale");
        miGrayscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGrayscaleActionPerformed(evt);
            }
        });
        asdasd.add(miGrayscale);

        miBiner.setText("Biner");
        miBiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBinerActionPerformed(evt);
            }
        });
        asdasd.add(miBiner);

        miDefault.setText("Default");
        miDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDefaultActionPerformed(evt);
            }
        });
        asdasd.add(miDefault);

        miBrightness.setText("Brightness");
        miBrightness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBrightnessActionPerformed(evt);
            }
        });
        asdasd.add(miBrightness);

        jMenuBar1.add(asdasd);

        mnGeometri.setText("Geometri");

        zoomin.setText("Zoom In");
        zoomin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoominActionPerformed(evt);
            }
        });
        mnGeometri.add(zoomin);

        zoomout.setText("Zoom Out");
        zoomout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomoutActionPerformed(evt);
            }
        });
        mnGeometri.add(zoomout);

        flipv.setText("Flip Vertical");
        flipv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flipvActionPerformed(evt);
            }
        });
        mnGeometri.add(flipv);

        fliph.setText("Flip Horizontal");
        fliph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fliphActionPerformed(evt);
            }
        });
        mnGeometri.add(fliph);

        jMenuBar1.add(mnGeometri);

        mnRotation.setText("Rotation");

        mirotation90.setText("90");
        mirotation90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirotation90ActionPerformed(evt);
            }
        });
        mnRotation.add(mirotation90);

        mirotation180.setText("180");
        mirotation180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirotation180ActionPerformed(evt);
            }
        });
        mnRotation.add(mirotation180);

        mirotation270.setText("270");
        mirotation270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirotation270ActionPerformed(evt);
            }
        });
        mnRotation.add(mirotation270);

        mirotation360.setText("360");
        mirotation360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirotation360ActionPerformed(evt);
            }
        });
        mnRotation.add(mirotation360);

        jMenuBar1.add(mnRotation);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miGrayscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGrayscaleActionPerformed
        // TODO add your handling code here:
        gambar.Grayscale();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miGrayscaleActionPerformed

    private void miDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDefaultActionPerformed
        // TODO add your handling code here:
        gambar.Default();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miDefaultActionPerformed

    private void miBukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBukaActionPerformed
        // TODO add your handling code here:
        JFileChooser TDialog=new JFileChooser();
        if(TDialog.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            gambar=new ClassGambar(TDialog.getSelectedFile().getAbsolutePath(),355,355);
            jLabel1.setIcon(gambar.GetIcon());
        }
    }//GEN-LAST:event_miBukaActionPerformed

    private void miSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSimpanActionPerformed
        // TODO add your handling code here:
        JFileChooser TDialog=new JFileChooser();
        if(TDialog.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            gambar.SaveImage(TDialog.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_miSimpanActionPerformed

    private void miKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_miKeluarActionPerformed

    private void miBinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBinerActionPerformed
        // TODO add your handling code here:
        gambar.Biner();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miBinerActionPerformed

    private void miBrightnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBrightnessActionPerformed
        // TODO add your handling code here:
        gambar.Brightness();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miBrightnessActionPerformed

    private void zoominActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoominActionPerformed
        // TODO add your handling code here:
        gambar.zoomin();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_zoominActionPerformed

    private void flipvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flipvActionPerformed
        // TODO add your handling code here:
        gambar.flipv();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_flipvActionPerformed

    private void fliphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fliphActionPerformed
        // TODO add your handling code here:
        gambar.fliph();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_fliphActionPerformed

    private void zoomoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomoutActionPerformed
        // TODO add your handling code here:
        gambar.zoomout();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_zoomoutActionPerformed

    private void mirotation90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirotation90ActionPerformed
        // TODO add your handling code here:
        gambar.rotation (90, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_mirotation90ActionPerformed

    private void mirotation180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirotation180ActionPerformed
        // TODO add your handling code here:
        gambar.rotation (180, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_mirotation180ActionPerformed

    private void mirotation270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirotation270ActionPerformed
        // TODO add your handling code here:
        gambar.rotation (270, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_mirotation270ActionPerformed

    private void mirotation360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirotation360ActionPerformed
        // TODO add your handling code here:
        gambar.rotation (360, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_mirotation360ActionPerformed

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
            java.util.logging.Logger.getLogger(gambarform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gambarform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gambarform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gambarform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gambarform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu asdasd;
    private javax.swing.JMenuItem fliph;
    private javax.swing.JMenuItem flipv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miBiner;
    private javax.swing.JMenuItem miBrightness;
    private javax.swing.JMenuItem miBuka;
    private javax.swing.JMenuItem miDefault;
    private javax.swing.JMenuItem miGrayscale;
    private javax.swing.JMenuItem miKeluar;
    private javax.swing.JMenuItem miSimpan;
    private javax.swing.JMenuItem mirotation180;
    private javax.swing.JMenuItem mirotation270;
    private javax.swing.JMenuItem mirotation360;
    private javax.swing.JMenuItem mirotation90;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnGeometri;
    private javax.swing.JMenu mnRotation;
    private javax.swing.JMenuItem zoomin;
    private javax.swing.JMenuItem zoomout;
    // End of variables declaration//GEN-END:variables
}
