package buku;
import database.database;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

    public class menu2 extends javax.swing.JFrame {

        public menu2() {
            initComponents();
            kosong_kolom();
            setTablejenis();
        }
  
    private void setTablejenis(){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No.");
            model.addColumn("ID_JENIS");
            model.addColumn("JENIS_BUKU");
            model.addColumn("ID_BUKU");

            try{
                //Ambil data dari Database
                int no = 1;
                String sql = "SELECT * FROM jenis_buku";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uaspbo", "root", "");
                Statement st = con.createStatement();
                ResultSet res = st.executeQuery(sql);
                //Menampilkan Tabel
                while(res.next()){
                    model.addRow(new Object[]{no++, res.getString(1),
                                                    res.getString(2),
                                                    res.getString(3)}); 
                }
                tabeljenis.setModel(model);
            }catch(SQLException e){
                System.out.println("Error : " + e.getMessage());
            }
    }

    private void kosong_kolom(){
            fieldidjenis.setText(null);
            fieldjenisbuku.setText(null);
            fieldidbuku2.setText(null);
    }
    
    public void getExit(){
        int confirm =JOptionPane.showConfirmDialog(this,"Anda yakin ingin keluar dari aplikasi ?","Keluar Aplikasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            System.exit(0);
            }
        if(confirm == JOptionPane.NO_OPTION){   
            } 
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paneljenis = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldidjenis = new javax.swing.JTextField();
        fieldjenisbuku = new javax.swing.JTextField();
        fieldidbuku2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeljenis = new javax.swing.JTable();
        buttontambah = new javax.swing.JButton();
        buttonedit = new javax.swing.JButton();
        buttonhapus = new javax.swing.JButton();
        buttonlogout = new javax.swing.JButton();
        buttonback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU JENIS BUKU");

        paneljenis.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID_JENIS");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JENIS_BUKU");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID_BUKU");

        tabeljenis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_JENIS", "JENIS_BUKU", "ID_BUKU"
            }
        ));
        tabeljenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeljenisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeljenis);

        buttontambah.setText("TAMBAH");
        buttontambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontambahActionPerformed(evt);
            }
        });

        buttonedit.setText("EDIT");
        buttonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneditActionPerformed(evt);
            }
        });

        buttonhapus.setText("HAPUS");
        buttonhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhapusActionPerformed(evt);
            }
        });

        buttonlogout.setForeground(new java.awt.Color(255, 0, 0));
        buttonlogout.setText("LOGOUT");
        buttonlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonlogoutActionPerformed(evt);
            }
        });

        buttonback.setText("BACK");
        buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneljenisLayout = new javax.swing.GroupLayout(paneljenis);
        paneljenis.setLayout(paneljenisLayout);
        paneljenisLayout.setHorizontalGroup(
            paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneljenisLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneljenisLayout.createSequentialGroup()
                        .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paneljenisLayout.createSequentialGroup()
                                .addComponent(buttontambah)
                                .addGap(18, 18, 18)
                                .addComponent(buttonedit)
                                .addGap(18, 18, 18)
                                .addComponent(buttonhapus)
                                .addGap(18, 18, 18)
                                .addComponent(buttonlogout))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(paneljenisLayout.createSequentialGroup()
                        .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paneljenisLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(fieldidjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneljenisLayout.createSequentialGroup()
                                .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldjenisbuku)
                                    .addComponent(fieldidbuku2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonback)
                        .addGap(16, 16, 16))))
        );
        paneljenisLayout.setVerticalGroup(
            paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneljenisLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldidjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonback))
                .addGap(18, 18, 18)
                .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldjenisbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldidbuku2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(paneljenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttontambah)
                    .addComponent(buttonhapus)
                    .addComponent(buttonlogout)
                    .addComponent(buttonedit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(paneljenis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneljenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontambahActionPerformed
        if(paneljenis.isShowing()){
        try{
            String sql = "INSERT INTO jenis_buku VALUES ('"+fieldidjenis.getText()+"','"
                                                           +fieldjenisbuku.getText()+"','"
                                                           +fieldidbuku2.getText()+"')";
            java.sql.Connection conn = (Connection)database.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Jenis Buku berhasil disimpan");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        setTablejenis();
        kosong_kolom();
        }
    }//GEN-LAST:event_buttontambahActionPerformed

    private void buttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneditActionPerformed
        if(paneljenis.isShowing()){
        try{
            String sql = "UPDATE jenis_buku SET ID_JENIS='"+fieldidjenis.getText()+"',JENIS_BUKU='"
                                                         +fieldjenisbuku.getText()+"',ID_BUKU='"
                                                         +fieldidbuku2.getText()+"' WHERE ID_JENIS='"+fieldidjenis.getText()+"'";
            java.sql.Connection conn = (Connection)database.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Jenis Buku berhasil diperbarui");
            kosong_kolom();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong_kolom();
        setTablejenis();
        }
    }//GEN-LAST:event_buttoneditActionPerformed

    private void buttonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhapusActionPerformed
        if(paneljenis.isShowing()){
        try{
            String sql = "DELETE FROM jenis_buku WHERE ID_JENIS='"+fieldidjenis.getText()+"'";
            java.sql.Connection conn = (Connection)database.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Jenis Buku berhasil dihapus");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong_kolom();
        setTablejenis();
        }
    }//GEN-LAST:event_buttonhapusActionPerformed

    private void tabeljenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeljenisMouseClicked
        int baris = tabeljenis.rowAtPoint(evt.getPoint());
        
        String idjenis  = tabeljenis.getValueAt(baris, 1).toString();
        fieldidjenis.setText(idjenis);

        String jenisbuku = tabeljenis.getValueAt(baris, 2).toString();
        fieldjenisbuku.setText(jenisbuku);

        String idbuku = tabeljenis.getValueAt(baris, 3).toString();
        fieldidbuku2.setText(idbuku);
    }//GEN-LAST:event_tabeljenisMouseClicked

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        new menu1().show();
            this.dispose();
    }//GEN-LAST:event_buttonbackActionPerformed

    private void buttonlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonlogoutActionPerformed
        getExit();
    }//GEN-LAST:event_buttonlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonback;
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonhapus;
    private javax.swing.JButton buttonlogout;
    private javax.swing.JButton buttontambah;
    private javax.swing.JTextField fieldidbuku2;
    private javax.swing.JTextField fieldidjenis;
    private javax.swing.JTextField fieldjenisbuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paneljenis;
    private javax.swing.JTable tabeljenis;
    // End of variables declaration//GEN-END:variables
}
