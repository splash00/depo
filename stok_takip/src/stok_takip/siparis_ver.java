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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MorCivciv
 */
public class siparis_ver extends javax.swing.JFrame implements Goster  {
double para =0;
int torba = 0;
double odenek = 0 ;
boolean onaykutu = false ;
boolean alim_tusu = false ;
    /**
     * Creates new form siparis_ver
     */
    public siparis_ver() {
        initComponents();
        show_user();
        show_user1();
        metod();
     
        Thread thread = new Thread(){
        public void run() {
            while(true) {
                DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                String dateString = date.format(new Date()).toString() ;
                tarih.setText(dateString);
            try{
                    Thread.sleep(1);
                }
                catch(Exception es){
                }
            }
        }
    };
    
thread.start();
        
    }
  public void metod(){ 
  
  }
    
     public ArrayList<User2> userList(){
        ArrayList<User2> usersList= new ArrayList<>();
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
           String sql = "insert into hny_stok_takip.urunler2 (sira_no, kategori, barkod_no, urun_ad, urun_ut, urun_stt, urun_gramaj, satis_fiyati, urun_adeti) values (?,?,?,?,?,?,?,?,?)";           
           String query1 = "SELECT * FROM hny_stok_takip.urunler2";
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(query1);
           
           User2 user ;
           while(rs.next()){
               user = new User2(rs.getString("sira_no"),rs.getString("kategori"),rs.getString("barkod_no"),rs.getString("urun_ad"),rs.getString("urun_ut"),rs.getString("urun_stt"),rs.getString("urun_gramaj"),rs.getString("satis_fiyati"),rs.getString("urun_adeti"));
               usersList.add(user);
            }
    }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"HATA OLUŞTU ");
       }
        return usersList;
    }
    
    public void show_user(){
         ArrayList<User2> list = userList() ;
         DefaultTableModel model = (DefaultTableModel)siparis_verme_tablosu.getModel();
         Object [] row = new Object[9];
            for(int i=0 ; i<list.size();i++){
                row[0] = list.get(i).getsira_no();
                row[1] = list.get(i).getkategori();
                row[2] = list.get(i).getbarkod_no();
                row[3] = list.get(i).geturun_ad();
                row[4] = list.get(i).geturun_ut();
                row[5] = list.get(i).geturun_stt();
                row[6] = list.get(i).geturun_gramaj();
                row[7] = list.get(i).getsatis_fiyati();
                row[8] = list.get(i).geturun_adeti();
                model.addRow(row);
            }
     }
    
    
    public ArrayList<User6> userList1(){
        ArrayList<User6> usersList1= new ArrayList<>();
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
          String query1 = "SELECT hny_stok_takip.kayitli_musteri.musteri_no , hny_stok_takip.kayitli_musteri.musteri_ad , hny_stok_takip.kayitli_musteri.musteri_soyad\n" +
"  FROM hny_stok_takip.kayitli_musteri , \n" +
"hny_stok_takip.aktif_kullanici WHERE hny_stok_takip.kayitli_musteri.giris_kimlik=hny_stok_takip.aktif_kullanici.aktif_kimlik";
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(query1);
           
           User6 user ;
           while(rs.next()){
               user = new User6(rs.getString("musteri_no"),rs.getString("musteri_ad"),rs.getString("musteri_soyad"));
               usersList1.add(user);
            }
    }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"HATA OLUŞTU ");
       }
        return usersList1;
    }
 
  public void show_user1(){
         ArrayList<User6> list = userList1() ;
         DefaultTableModel model = (DefaultTableModel)tablos.getModel();
         Object [] row = new Object[3];
            for(int i=0 ; i<list.size();i++){
                
                row[0] = list.get(i).getmusteri_no();
                row[1] = list.get(i).getmusteri_ad();
                row[2] = list.get(i).getmusteri_soyad();
               
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
        siparis_verme_tablosu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelmusteriad = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelmusterisoyad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        labelbarkodno = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        labelurunad = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        labelsatisfiyat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tarih = new javax.swing.JLabel();
        labelalimadet = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        labelmusterino = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        labeltutar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablos = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel_ekranikapat = new javax.swing.JLabel();
        jLabel_ekranikucult = new javax.swing.JLabel();
        kategorisel = new javax.swing.JComboBox();
        arama_btn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        siparis_verme_tablosu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        siparis_verme_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra No", "Kategori", "Barkod No", "Ürün Ad", "Urun U.T", "Ürün S.T.T", "Ürün Gramaj", "Satış Fiyatı", "Stoktaki Adet"
            }
        ));
        siparis_verme_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siparis_verme_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(siparis_verme_tablosu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 800, 430));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<<<");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText(" Sipariş Tarihi:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        labelmusteriad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelmusteriad, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelmusteriad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 218, 30));

        labelmusterisoyad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelmusterisoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelmusterisoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 218, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText(" Müşteri No:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText(" Müşteri Ad:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Musteri Soyad:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 280, 120, -1));

        labelbarkodno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelbarkodno, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelbarkodno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 30));

        labelurunad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelurunad, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelurunad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 218, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText(" Barkod No:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Ürün Adı:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelsatisfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelsatisfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(" Alım Adeti:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 580, 80, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tarih, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 30));

        labelalimadet.setBackground(new java.awt.Color(153, 153, 153));
        labelalimadet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelalimadet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelalimadetMouseClicked(evt);
            }
        });
        labelalimadet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelalimadetActionPerformed(evt);
            }
        });
        jPanel2.add(labelalimadet, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 140, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText(" Birim Satış Fiyatı:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        labelmusterino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelmusterino, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelmusterino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Tabloda Yer Alan Müşteri Numaranızın Üzerine Tıklayarak Kimliğiniz Onaylayınız !");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 430, 20));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Satın Al");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 150, 70));

        jPanel11.setBackground(new java.awt.Color(255, 204, 153));

        labeltutar.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        labeltutar.setText(" ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("TL");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(labeltutar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltutar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 160, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Ödenecek Tutar:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, -1, -1));

        tablos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Müşteri No", "Müşteri Adı", "Müşteri Soyadı"
            }
        ));
        tablos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, -1, 50));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(723, Short.MAX_VALUE)
                .addComponent(jLabel_ekranikucult, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ekranikapat)
                .addGap(19, 19, 19))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ekranikapat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ekranikucult))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 800, 40));

        kategorisel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kategorisel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kategori", "Barkod No", "Ürün Adı", " " }));
        kategorisel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(kategorisel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 260, 40));

        arama_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        arama_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_btnKeyReleased(evt);
            }
        });
        jPanel1.add(arama_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 330, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    private void siparis_verme_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siparis_verme_tablosuMouseClicked
        
        
        if(alim_tusu == true) {
        int i = siparis_verme_tablosu.getSelectedRow();
        TableModel model = siparis_verme_tablosu.getModel();
        
       
        labelbarkodno.setText(model.getValueAt(i, 2).toString());
        labelurunad.setText(model.getValueAt(i, 3).toString());
        labelsatisfiyat.setText(model.getValueAt(i, 7).toString());
        torba = Integer.valueOf(labelalimadet.getText());
        String satis = labelsatisfiyat.getText();
        
        para = Double.valueOf(satis); 
        odenek = torba * para ;
        labeltutar.setText(String.valueOf(odenek));
      }
      else {
          JOptionPane.showMessageDialog(null,"Ürün Seçmeden Önce Alim Adetini Belirleyiniz !");
          
           labelalimadet.setText(null);
      }
     
    }//GEN-LAST:event_siparis_verme_tablosuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
           //String sql = "insert into hny_stok_takip.kayitli_musteri ( musteri_no, giris_kimlik, giris_sifre, musteri_ad, musteri_soyad, musteri_telefon, musteri_eposta) values (?,?,?,?,?,?,?)";
           int row = siparis_verme_tablosu.getSelectedRow();
           String value =( siparis_verme_tablosu.getModel().getValueAt(row,2).toString());
           int stoktaki = Integer.parseInt(siparis_verme_tablosu.getModel().getValueAt(row,8).toString());
           int alinmak_istenen = Integer.parseInt(labelalimadet.getText());
           String  ifade  = "UPDATE hny_stok_takip.urunler2 SET  urun_adeti=?  where barkod_no="+value ;
           PreparedStatement pstt1 = conn4.prepareStatement(ifade );
           int yeni = stoktaki-alinmak_istenen ;

         if(stoktaki >= alinmak_istenen) {
            try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
           String sql = "insert into hny_stok_takip.siparisko (siparis_tarihi,musteri_no,musteri_ad,musteri_soyad,barkod_no,urun_ad,ali_adet,tutar) values (?,?,?,?,?,?,?,?)";           
           
           PreparedStatement pstt = conn.prepareStatement(sql);
        
           pstt.setString(1, tarih.getText() );
           pstt.setString(2, labelmusterino.getText() );
           pstt.setString(3, labelmusteriad.getText() );
           pstt.setString(4, labelmusterisoyad.getText() );
           pstt.setString(5, labelbarkodno.getText());
           pstt.setString(6, labelurunad.getText());
           pstt.setString(7, labelalimadet.getText());
           pstt.setString(8, labeltutar.getText());
           pstt.executeUpdate();
           JOptionPane.showMessageDialog(null,"BAŞARIYLA SATIN ALDINIZ , SİPARİŞLERİMDEN İPTAL EDEBİLİRSİNİZ");
           
           pstt1.setString(1,String.valueOf(yeni) );
           pstt1.executeUpdate();
           
           DefaultTableModel model = (DefaultTableModel)siparis_verme_tablosu.getModel();
           model.setRowCount(0);
           show_user();
          // JOptionPane.showMessageDialog(null,"EKSİLTİLDİ" );
           
        } 
         catch(Exception e){
        JOptionPane.showMessageDialog(null,"HATA SATIN ALIM BAŞARISIZ");
       }}
        else {
             JOptionPane.showMessageDialog(null,"Almak İstediğiniz Miktarda Ürün Stokta Bulunmamamtadır" );
        } 
        }
        
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"HATA Siparişiniz Oluşturuamadı");
       }
                                      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablosMouseClicked
        int i = tablos.getSelectedRow();
        TableModel model = tablos.getModel();
        
       labelmusterino.setText(model.getValueAt(i, 0).toString());
        labelmusteriad.setText(model.getValueAt(i, 1).toString());
        labelmusterisoyad.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_tablosMouseClicked

    private void jLabel_ekranikapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ekranikapatMouseClicked
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
            String query = "DELETE FROM hny_stok_takip.aktif_kullanici where sno=1" ;
            PreparedStatement  pst = conn.prepareStatement(query );
            pst.executeUpdate();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"HATA OLUŞTU ");
        }
        System.exit(0);
    }//GEN-LAST:event_jLabel_ekranikapatMouseClicked

    private void jLabel_ekranikucultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ekranikucultMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_ekranikucultMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        musteri_ekrani gp= new musteri_ekrani();
        gp.setVisible(true);
        gp.pack();
        gp.setLocationRelativeTo(null);
        gp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void labelalimadetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelalimadetMouseClicked
       String a = String.valueOf(labelalimadet);
        if(a==null){
            if(labelalimadet.isEnabled()){
            alim_tusu = false;
            labelalimadet.setText(null);
            }
        }
        else if(a!=null){
            alim_tusu = true ;
        }
        
    }//GEN-LAST:event_labelalimadetMouseClicked

    private void labelalimadetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelalimadetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelalimadetActionPerformed

    private void arama_btnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_btnKeyReleased
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
            TableModel model = siparis_verme_tablosu.getModel();

            String arama = (String)kategorisel.getSelectedItem();
            if(arama=="Kategori"){
                String yaz1 = arama_btn.getText();
                String ara1 = "SELECT * FROM hny_stok_takip.urunler2 WHERE kategori LIKE '"+yaz1+"%'";
                PreparedStatement pstt = conn.prepareStatement(ara1);
                ResultSet rs = pstt.executeQuery();
                siparis_verme_tablosu.setModel(DbUtils.resultSetToTableModel(rs));
                pstt.close();

            }
            if (arama=="Barkod No"){
                String yaz2 = arama_btn.getText();
                String ara2 = "SELECT * FROM hny_stok_takip.urunler2 WHERE barkod_no LIKE '"+yaz2+"%'";
                PreparedStatement pstt2 = conn.prepareStatement(ara2);
                ResultSet rs1 = pstt2.executeQuery();
                siparis_verme_tablosu.setModel(DbUtils.resultSetToTableModel(rs1));
                pstt2.close();

            }
            if(arama=="Ürün Adı"){
                String yaz3 = arama_btn.getText();
                String ara3 = "SELECT * FROM hny_stok_takip.urunler2 WHERE urun_ad LIKE '%"+yaz3+"%'";
                PreparedStatement pstt3 = conn.prepareStatement(ara3);
                ResultSet rs2 = pstt3.executeQuery();
                siparis_verme_tablosu.setModel(DbUtils.resultSetToTableModel(rs2));
                pstt3.close();
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"HATA ARAMA İŞLEMİ BASARISIZ");

        }

    }//GEN-LAST:event_arama_btnKeyReleased
 
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
            java.util.logging.Logger.getLogger(siparis_ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(siparis_ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(siparis_ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(siparis_ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new siparis_ver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_ekranikapat;
    private javax.swing.JLabel jLabel_ekranikucult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox kategorisel;
    private javax.swing.JTextField labelalimadet;
    private javax.swing.JLabel labelbarkodno;
    private javax.swing.JLabel labelmusteriad;
    private javax.swing.JLabel labelmusterino;
    private javax.swing.JLabel labelmusterisoyad;
    private javax.swing.JLabel labelsatisfiyat;
    private javax.swing.JLabel labeltutar;
    private javax.swing.JLabel labelurunad;
    private javax.swing.JTable siparis_verme_tablosu;
    private javax.swing.JTable tablos;
    private javax.swing.JLabel tarih;
    // End of variables declaration//GEN-END:variables
}
