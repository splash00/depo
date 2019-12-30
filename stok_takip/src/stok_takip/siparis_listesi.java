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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MorCivciv
 */
public class siparis_listesi extends javax.swing.JFrame implements Goster  {

    /**
     * Creates new form siparis_listesi
     */
    public siparis_listesi() {
        initComponents();
        show_user();
    }
    
    public ArrayList<User3> userList(){
        ArrayList<User3> usersList= new ArrayList<>();
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
           String sql = "insert into hny_stok_takip.siparisko (siparis_no,siparis_tarihi,musteri_no,musteri_ad,musteri_soyad,barkod_no,urun_ad,ali_adet,tutar ) values (?,?,?,?,?,?,?,?,? )";           
           String query1 = "SELECT * FROM hny_stok_takip.siparisko";
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(query1);
           
           User3 user ;
           while(rs.next()){
               user = new User3(rs.getString("siparis_no"),rs.getString("siparis_tarihi"),rs.getString("musteri_no"),rs.getString("musteri_ad"),rs.getString("musteri_soyad"),rs.getString("barkod_no"),rs.getString("urun_ad"),rs.getString("ali_adet"),rs.getString("tutar"));
               usersList.add(user);
              
           }
    }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"HATA OLUŞTU ");
       }
        return usersList;
    }
    
    public void show_user(){
         ArrayList<User3> list = userList() ;
         DefaultTableModel model = (DefaultTableModel)siparis_tablosu.getModel();
         Object [] row = new Object[9];
            for(int i=0 ; i<list.size();i++){
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        siparis_tablosu = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_ekranikapat = new javax.swing.JLabel();
        jLabel_ekranikucult = new javax.swing.JLabel();
        arama_btn_kateg = new javax.swing.JComboBox();
        arama_btn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        siparis_tablosu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        siparis_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sipariş No:", "Sipariş Tarihi:", "Müşteri No:", "Müşteri Adı:", "Müşteri Soyadı:", "Barkod No:", "Ürün Adı:", "Alım Adeti(birim):", "Alım Tutarı:"
            }
        ));
        siparis_tablosu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        siparis_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siparis_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(siparis_tablosu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1100, 550));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<<<");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_ekranikucult, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ekranikapat)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_ekranikapat)
                .addComponent(jLabel_ekranikucult))
        );

        arama_btn_kateg.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        arama_btn_kateg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sipariş No", "Sipariş Tarihi", "Müşteri No", "Müşteri Adı", "Barkod No", "Ürün Adı", " " }));
        arama_btn_kateg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        arama_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        arama_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_btnKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(arama_btn_kateg, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(arama_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arama_btn_kateg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arama_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 180));

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
    }// </editor-fold>//GEN-END:initComponents

    private void siparis_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siparis_tablosuMouseClicked
       int i = siparis_tablosu.getSelectedRow();
        TableModel model = siparis_tablosu.getModel(); 
    }//GEN-LAST:event_siparis_tablosuMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        adminekrani ae= new adminekrani();
        ae.setVisible(true);
        ae.pack();
        ae.setLocationRelativeTo(null);
        ae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void arama_btnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_btnKeyReleased
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
            TableModel model = siparis_tablosu.getModel();
        
        String arama = (String)arama_btn_kateg.getSelectedItem();
            if(arama=="Sipariş No"){
                String yaz1 = arama_btn.getText();
                   String ara1 = "SELECT * FROM hny_stok_takip.siparisko WHERE siparis_no LIKE '"+yaz1+"%'";
                   PreparedStatement pstt = conn.prepareStatement(ara1);
                   ResultSet rs = pstt.executeQuery();
                   siparis_tablosu.setModel(DbUtils.resultSetToTableModel(rs));
                   pstt.close();
                   
            }
             if (arama=="Sipariş Tarihi"){   
                   String yaz2 = arama_btn.getText();
                   String ara2 = "SELECT * FROM hny_stok_takip.siparisko WHERE siparis_tarihi LIKE '"+yaz2+"%'";
                   PreparedStatement pstt2 = conn.prepareStatement(ara2);
                   ResultSet rs1 = pstt2.executeQuery();
                   siparis_tablosu.setModel(DbUtils.resultSetToTableModel(rs1));
                   pstt2.close();
                   
            }
            if(arama=="Müşteri No"){
                  String yaz3 = arama_btn.getText();
                  String ara3 = "SELECT * FROM hny_stok_takip.siparisko WHERE musteri_no LIKE '"+yaz3+"%'";
                  PreparedStatement pstt3 = conn.prepareStatement(ara3);
                  ResultSet rs2 = pstt3.executeQuery();
                  siparis_tablosu.setModel(DbUtils.resultSetToTableModel(rs2));
                  pstt3.close();
            }       
            if(arama=="Müşteri Adı"){
                  String yaz3 = arama_btn.getText();
                  String ara3 = "SELECT * FROM hny_stok_takip.siparisko WHERE musteri_ad LIKE '"+yaz3+"%'";
                  PreparedStatement pstt3 = conn.prepareStatement(ara3);
                  ResultSet rs2 = pstt3.executeQuery();
                  siparis_tablosu.setModel(DbUtils.resultSetToTableModel(rs2));
                  pstt3.close();
            }
            if(arama=="Barkod No"){
                  String yaz3 = arama_btn.getText();
                  String ara3 = "SELECT * FROM hny_stok_takip.siparisko WHERE barkod_no LIKE '"+yaz3+"%'";
                  PreparedStatement pstt3 = conn.prepareStatement(ara3);
                  ResultSet rs2 = pstt3.executeQuery();
                  siparis_tablosu.setModel(DbUtils.resultSetToTableModel(rs2));
                  pstt3.close();
            }
            if(arama=="Ürün Adı"){
                  String yaz3 = arama_btn.getText();
                  String ara3 = "SELECT * FROM hny_stok_takip.siparisko WHERE urun_ad LIKE '%"+yaz3+"%'";
                  PreparedStatement pstt3 = conn.prepareStatement(ara3);
                  ResultSet rs2 = pstt3.executeQuery();
                  siparis_tablosu.setModel(DbUtils.resultSetToTableModel(rs2));
                  pstt3.close();
            }
        }
            
          catch(Exception re){
            JOptionPane.showMessageDialog(null,"HATA ARAMA BAŞARISIZ");}


        
    }//GEN-LAST:event_arama_btnKeyReleased

    private void jLabel_ekranikapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ekranikapatMouseClicked
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
            String query = "DELETE FROM hny_stok_takip.aktif_kullanici where sno=1" ;
            PreparedStatement  pst = conn.prepareStatement(query );
            pst.executeUpdate();
            
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,"HATA OLUŞTU");

        }
        System.exit(0);
    }//GEN-LAST:event_jLabel_ekranikapatMouseClicked

    private void jLabel_ekranikucultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ekranikucultMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_ekranikucultMouseClicked

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
            java.util.logging.Logger.getLogger(siparis_listesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(siparis_listesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(siparis_listesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(siparis_listesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new siparis_listesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_btn;
    private javax.swing.JComboBox arama_btn_kateg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_ekranikapat;
    private javax.swing.JLabel jLabel_ekranikucult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable siparis_tablosu;
    // End of variables declaration//GEN-END:variables
}
