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

public class menu1 extends javax.swing.JFrame {

    public menu1() {
            initComponents();
            kosong_kolom();
            setTablebuku();
    }
private void setTablebuku(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("ID BUKU");
        model.addColumn("NAMA BUKU");
        model.addColumn("STOCK");
        model.addColumn("HARGA");
       
        try{
            //Ambil data dari Database
            int no = 1;
            String sql = "SELECT * FROM buku";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uaspbo", "root", "");
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(sql);
            //Menampilkan Tabel
            while(res.next()){
                model.addRow(new Object[]{no++, res.getString(1),
                                                res.getString(2),
                                                res.getString(3),
                                                res.getString(4)}); 
            }
            tabelbuku.setModel(model);
        }catch(SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    private void kosong_kolom(){
            fieldidbuku.setText(null);
            fieldnamabuku.setText(null);
            fieldstock.setText(null);
            fieldharga.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelbuku = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldidbuku = new javax.swing.JTextField();
        fieldnamabuku = new javax.swing.JTextField();
        fieldstock = new javax.swing.JTextField();
        fieldharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbuku = new javax.swing.JTable();
        buttontambah = new javax.swing.JButton();
        buttonedit = new javax.swing.JButton();
        buttonhapus = new javax.swing.JButton();
        buttonnext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU BUKU");

        panelbuku.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID_BUKU");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAMA BUKU");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STOCK");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HARGA");

        fieldidbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldidbukuActionPerformed(evt);
            }
        });

        tabelbuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_BUKU", "NAMA BUKU", "STOCK", "HARGA"
            }
        ));
        tabelbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbuku);

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

        buttonnext.setText("NEXT");
        buttonnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbukuLayout = new javax.swing.GroupLayout(panelbuku);
        panelbuku.setLayout(panelbukuLayout);
        panelbukuLayout.setHorizontalGroup(
            panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbukuLayout.createSequentialGroup()
                        .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGroup(panelbukuLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)))
                        .addGap(25, 25, 25)
                        .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldidbuku, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(fieldnamabuku)
                            .addComponent(fieldstock)
                            .addComponent(fieldharga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonnext)
                        .addContainerGap())
                    .addGroup(panelbukuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(panelbukuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttontambah)
                        .addGap(29, 29, 29)
                        .addComponent(buttonedit)
                        .addGap(31, 31, 31)
                        .addComponent(buttonhapus)
                        .addGap(69, 69, 69))))
        );
        panelbukuLayout.setVerticalGroup(
            panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbukuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldidbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonnext))
                .addGap(18, 18, 18)
                .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldnamabuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttontambah)
                    .addComponent(buttonedit)
                    .addComponent(buttonhapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void fieldidbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldidbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldidbukuActionPerformed

    private void buttontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontambahActionPerformed
        if(panelbuku.isShowing()){
        try{
            String sql = "INSERT INTO buku VALUES ('"+fieldidbuku.getText()+"','"
                                                           +fieldnamabuku.getText()+"','"
                                                           +fieldstock.getText()+"','"
                                                           +fieldharga.getText()+"')";
            java.sql.Connection conn = (Connection)database.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Buku berhasil disimpan");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        setTablebuku();
        kosong_kolom();
        }

    }//GEN-LAST:event_buttontambahActionPerformed

    private void buttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneditActionPerformed
       if(panelbuku.isShowing()){
        try{
            String sql = "UPDATE buku SET ID_BUKU='"+fieldidbuku.getText()+"',NAMA_BUKU='"
                                                         +fieldnamabuku.getText()+"',STOCK='"
                                                         +fieldstock.getText()+"',HARGA='"
                                                         +fieldharga.getText()+"' WHERE ID_BUKU='"+fieldidbuku.getText()+"'";
            java.sql.Connection conn = (Connection)database.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data BUKU berhasil diperbarui");
            kosong_kolom();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong_kolom();
        setTablebuku();
       }
    }//GEN-LAST:event_buttoneditActionPerformed

    private void buttonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhapusActionPerformed
        if(panelbuku.isShowing()){
        try{
            String sql = "DELETE FROM buku WHERE ID_BUKU='"+fieldidbuku.getText()+"'";
            java.sql.Connection conn = (Connection)database.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Buku berhasil dihapus");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong_kolom();
        setTablebuku();
        }
    }//GEN-LAST:event_buttonhapusActionPerformed

    private void tabelbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbukuMouseClicked
        int baris = tabelbuku.rowAtPoint(evt.getPoint());
        
        String idbuku  = tabelbuku.getValueAt(baris, 1).toString();
        fieldidbuku.setText(idbuku);

        String namabuku = tabelbuku.getValueAt(baris, 2).toString();
        fieldnamabuku.setText(namabuku);

        String stok = tabelbuku.getValueAt(baris, 3).toString();
        fieldstock.setText(stok); 
        
        String harga = tabelbuku.getValueAt(baris, 4).toString();
        fieldharga.setText(harga);
    }//GEN-LAST:event_tabelbukuMouseClicked

    private void buttonnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnextActionPerformed
        new menu2().show();
            this.dispose();
    }//GEN-LAST:event_buttonnextActionPerformed

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
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonhapus;
    private javax.swing.JButton buttonnext;
    private javax.swing.JButton buttontambah;
    private javax.swing.JTextField fieldharga;
    private javax.swing.JTextField fieldidbuku;
    private javax.swing.JTextField fieldnamabuku;
    private javax.swing.JTextField fieldstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelbuku;
    private javax.swing.JTable tabelbuku;
    // End of variables declaration//GEN-END:variables
}
