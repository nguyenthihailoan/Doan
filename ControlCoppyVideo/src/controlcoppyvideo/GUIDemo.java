/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcoppyvideo;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author nguye
 */
public class GUIDemo extends javax.swing.JFrame {

    public static final int DIRECTORIES = 1;
    public static final int FILE = 2;
    private String pathVideo, pathEmbbed;
    private String hashMd5Video;

    /**
     * Creates new form GUIDemo
     */
    public GUIDemo() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txt_pathin = new javax.swing.JTextField();
        btn_brower = new javax.swing.JButton();
        btn_hashvideo = new javax.swing.JButton();
        txt_hashmd5 = new javax.swing.JLabel();
        btn_embbedwithkey = new javax.swing.JButton();
        txt_pathembbed = new javax.swing.JTextField();
        btn_selectvideo = new javax.swing.JButton();
        btn_extra = new javax.swing.JButton();
        btn_check_video = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_pathin.setText("Select video");

        btn_brower.setText(" Brower");
        btn_brower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browerActionPerformed(evt);
            }
        });

        btn_hashvideo.setText("Hash video");
        btn_hashvideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hashvideoActionPerformed(evt);
            }
        });

        txt_hashmd5.setText("Key");

        btn_embbedwithkey.setText("Embbed With Key");

        txt_pathembbed.setText("video embbed");

        btn_selectvideo.setText("Select Video");
        btn_selectvideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectvideoActionPerformed(evt);
            }
        });

        btn_extra.setText("Extra hidden information");

        btn_check_video.setText("Legal Video");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Decode");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Encode");

        jLabel4.setText("Result");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pathin, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_embbedwithkey)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addComponent(btn_extra)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_pathembbed, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_brower))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_hashvideo)
                        .addGap(18, 18, 18)
                        .addComponent(txt_hashmd5))
                    .addComponent(btn_check_video)
                    .addComponent(jLabel3))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(377, Short.MAX_VALUE)
                    .addComponent(btn_selectvideo)
                    .addGap(20, 20, 20)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pathin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hashvideo)
                    .addComponent(txt_hashmd5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_pathembbed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_brower))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_embbedwithkey)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_extra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_check_video)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(btn_selectvideo)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Test", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selectvideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectvideoActionPerformed
        // TODO add your handling code here:
        pathVideo = showChooserFileorFolder(FILE);
        if (pathVideo != null) {
            txt_pathin.setText(pathVideo);
        }
        System.out.println(pathVideo);
    }//GEN-LAST:event_btn_selectvideoActionPerformed
    /**
     * action hash md5 video
     *
     * @param evt
     */
    private void btn_hashvideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hashvideoActionPerformed
        // TODO add your handling code here:
        hashMd5Video = HashMD5.getMd5FromVideo(pathVideo);
        txt_hashmd5.setText(hashMd5Video);
    }//GEN-LAST:event_btn_hashvideoActionPerformed
    /**
     * action creat file embbed
     *
     * @param evt
     */
    private void btn_browerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browerActionPerformed
        // TODO add your handling code here:
        String folder = showChooserFileorFolder(DIRECTORIES);
        if (folder != null) {
            pathEmbbed = folder + "/videoembbed.mp4";
            txt_pathembbed.setText(pathEmbbed);
        }

    }//GEN-LAST:event_btn_browerActionPerformed

    public String showChooserFileorFolder(int type) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Select video");
        jfc.setMultiSelectionEnabled(false);
        if (type == DIRECTORIES) {
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        } else {
            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        }
        int value = jfc.showOpenDialog(null);
        if (value == JFileChooser.APPROVE_OPTION) {
            return jfc.getSelectedFile().getAbsolutePath();
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(GUIDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_brower;
    private javax.swing.JButton btn_check_video;
    private javax.swing.JButton btn_embbedwithkey;
    private javax.swing.JButton btn_extra;
    private javax.swing.JButton btn_hashvideo;
    private javax.swing.JButton btn_selectvideo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txt_hashmd5;
    private javax.swing.JTextField txt_pathembbed;
    private javax.swing.JTextField txt_pathin;
    // End of variables declaration//GEN-END:variables
}
