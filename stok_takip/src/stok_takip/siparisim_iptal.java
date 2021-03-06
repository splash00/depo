/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stok_takip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author MorCivciv
 */
public class siparisim_iptal extends javax.swing.JFrame implements Goster {

    /**
     * Creates new form siparisim_iptal
     */
    public siparisim_iptal() {
        initComponents();
        show_user();
    }

    public ArrayList<User3> userList() {
        ArrayList<User3> usersList = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip", "root", "admin");
            String sql = "insert into hny_stok_takip.siparisko (siparis_no,siparis_tarihi,musteri_no,musteri_ad,musteri_soyad,barkod_no,urun_ad,ali_adet,tutar ) values (?,?,?,?,?,?,?,?,? )";
            String query1 = "SELECT siparisko.siparis_no , siparisko.siparis_tarihi, kayitli_musteri.musteri_no , kayitli_musteri.musteri_ad,\n"
                    + "kayitli_musteri.musteri_soyad, siparisko.barkod_no , siparisko.urun_ad,siparisko.ali_adet,siparisko.tutar\n"
                    + "FROM siparisko ,kayitli_musteri , aktif_kullanici WHERE kayitli_musteri.giris_kimlik=aktif_kullanici.aktif_kimlik\n"
                    + "and kayitli_musteri.musteri_ad=siparisko.musteri_ad";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);

            User3 user;
            while (rs.next()) {
                user = new User3(rs.getString("siparis_no"), rs.getString("siparis_tarihi"), rs.getString("musteri_no"), rs.getString("musteri_ad"), rs.getString("musteri_soyad"), rs.getString("barkod_no"), rs.getString("urun_ad"), rs.getString("ali_adet"), rs.getString("tutar"));
                usersList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA OLUŞTU ");
        }
        return usersList;
    }

    public void show_user() {
        ArrayList<User3> list = userList();
        DefaultTableModel model = (DefaultTableModel) tablo.getModel();
        Object[] row = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getsiparis_no();
            row[1] = list.get(i).getsiparis_tarihi();
            row[2] = list.get(i).getmusteri_no();
            row[3] = list.get(i).getmusteri_ad();
            row[4] = list.get(i).getmusteri_soyad();
            row[5] = list.get(i).getbarkod_no();
            row[6] = list.get(i).geturun_ad();
            row[7] = list.get(i).getali_adet();
            row[8] = list.get(i).gettutar();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_ekranikapat = new javax.swing.JLabel();
        jLabel_ekranikucult = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sipariş No", "Sipariş Tarihi", "Müşteri No", "Müşteri Adı", "Müşteri Soyadı", "Barkod No", "Ürün Adı", "Alım Adet", "Tutar"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<<<");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel_ekranikapat.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel_ekranikapat.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ekranikapat.setText("X");
        jLabel_ekranikapat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ekranikapat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ekranikapatMouseClicked(evt);
            }
        });

        jLabel_ekranikucult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_ekranikucult.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ekranikucult.setText("-");
        jLabel_ekranikucult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ekranikucult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ekranikucultMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_ekranikucult, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ekranikapat)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_ekranikapat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(jLabel_ekranikucult))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seçili Siparişimi İptal Et");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int emin = JOptionPane.showConfirmDialog(null,"silmek istediğinizden emin misiniz","Delete", JOptionPane.YES_NO_OPTION) ;
        if(emin==0){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
            int row = tablo.getSelectedRow();

            String value =( tablo.getModel().getValueAt(row,5).toString());
       
            int talep = Integer.parseInt(tablo.getModel().getValueAt(row,7).toString());
            String hh = "SELECT hny_stok_takip.urunler2.urun_adeti FROM urunler2 WHERE barkod_no="+value;
            Statement stmt = null;
            stmt = conn4.createStatement();

            ResultSet rs = stmt.executeQuery(hh);
         
            while(rs.next()){
             int depo = Integer.parseInt(rs.getString("urun_adeti")); 
             String  ifade  = "UPDATE hny_stok_takip.urunler2 SET  urun_adeti=?  where barkod_no="+value ;
            PreparedStatement pstt1 = conn4.prepareStatement(ifade );
            int yeni = talep + depo ;
            pstt1.setString(1,String.valueOf(yeni));
            pstt1.executeUpdate();
            }
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip", "root", "admin");
                int rowX = tablo.getSelectedRow();
                String value1 =( tablo.getModel().getValueAt(rowX,0).toString());
                String query = "DELETE FROM hny_stok_takip.siparisko where siparis_no="+value1 ;
                PreparedStatement  pst = conn1.prepareStatement(query );
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)tablo.getModel();
                model.setRowCount(0);
                show_user();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "HATA İPTAL İŞLEMİ BAŞARISIZ  ");
             }
        }
        catch (Exception ef) {
            JOptionPane.showMessageDialog(null, "HATA İPTAL İŞLEMİ BASARISIZ");
            ef.printStackTrace();
        }
        }            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        musteri_ekrani ae = new musteri_ekrani();
        ae.setVisible(true);
        ae.pack();
        ae.setLocationRelativeTo(null);
        ae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel_ekranikapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ekranikapatMouseClicked
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip", "root", "admin");
            String query = "DELETE FROM hny_stok_takip.aktif_kullanici where sno=1";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA OLUŞTU ");
        }
        System.exit(0);
    }//GEN-LAST:event_jLabel_ekranikapatMouseClicked

    private void jLabel_ekranikucultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ekranikucultMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_ekranikucultMouseClicked

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        int i = tablo.getSelectedRow();
        TableModel model = tablo.getModel();

    }//GEN-LAST:event_tabloMouseClicked

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
            java.util.logging.Logger.getLogger(siparisim_iptal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(siparisim_iptal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(siparisim_iptal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(siparisim_iptal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new siparisim_iptal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_ekranikapat;
    private javax.swing.JLabel jLabel_ekranikucult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables

  
    
}
