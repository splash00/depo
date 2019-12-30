/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stok_takip;

/**
 *
 * @author MorCivciv
 */
public class User3 {
      private String siparis_no,siparis_tarihi,musteri_no,musteri_ad,musteri_soyad,barkod_no,urun_ad,ali_adet,tutar ;
    
    public User3( String siparis_no ,String siparis_tarihi,String musteri_no , String  musteri_ad , String musteri_soyad , String barkod_no , String urun_ad ,String ali_adet,String tutar) {
        //this.sira_no = sira_no;//5555555555555555555555
        this.siparis_no = siparis_no;
        this.siparis_tarihi = siparis_tarihi;
        this.urun_ad = urun_ad;
        this.musteri_no = musteri_no;
        this.musteri_ad = musteri_ad;
        this.musteri_soyad = musteri_soyad;
        this.barkod_no = barkod_no ;
        this.urun_ad = urun_ad;
        this.ali_adet = ali_adet;
        this.tutar = tutar;
        //this.musteri_iletisim=musteri_iletisim;
        
   }
    
  /*  public String getsira_no() {
    return sira_no;
    }*/
    public String getsiparis_no() {
    return siparis_no;
    }
    public String getsiparis_tarihi() {
    return siparis_tarihi;
    }
    public String getmusteri_no() {
    return musteri_no;
    }
    public String getmusteri_ad() {
    return musteri_ad;
    }
    public String getmusteri_soyad() {
    return musteri_soyad;
    }
    public String getbarkod_no() {
    return barkod_no;
    }
    public String geturun_ad() {
    return urun_ad;
    }
    public String getali_adet() {
    return ali_adet;
    }
    public String gettutar() {
    return tutar;
    }
   /* public String getmusteri_iletisim() {
    return musteri_iletisim;*/
    }
    
    
    //88
    
    


/* String arama = (String)arama_btn_kateg.getSelectedItem();
            switch(arama){
                case "Müşteri No":
                   String tt = arama_btn.getText();
                    String ara1 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_no LIKE '"+tt+"%'";
                   PreparedStatement pstt = conn.prepareStatement(ara1);
                   
                   ResultSet rs = pstt.executeQuery();
                   
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs));
                   pstt.close();
                    break;
                case "Giriş Kimliği":
                    String ara2 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE giris_kimlik=? ";
                    PreparedStatement pstt2 = conn.prepareStatement(ara2);
                   pstt2.setString(1, arama_btn.getText());
                   ResultSet rs2 = pstt2.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs2));
                   pstt2.close();
                    break;
                case "Müşteri Adı":
                    String ara3 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_ad=? ";
                    PreparedStatement pstt3 = conn.prepareStatement(ara3);
                   pstt3.setString(1, arama_btn.getText());
                   ResultSet rs3 = pstt3.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs3));
                   pstt3.close();
                    break;
                case "Müşteri Soyadı":
                   String ara4 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_soyad=? ";
                   PreparedStatement pstt4 = conn.prepareStatement(ara4);
                   pstt4.setString(1, arama_btn.getText());
                   ResultSet rs4 = pstt4.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs4));
                   pstt4.close();
                    break;  
                case "Telefon No":
                    String ara5 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_telefon=? ";
                    PreparedStatement pstt5 = conn.prepareStatement(ara5);
                   pstt5.setString(1, arama_btn.getText());
                   ResultSet rs5 = pstt5.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs5));
                   pstt5.close();
                    break;
                case "E-posta":
                    String ara6 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_eposta=? ";
                    PreparedStatement pstt6 = conn.prepareStatement(ara6);
                   pstt6.setString(1, arama_btn.getText());
                   ResultSet rs6 = pstt6.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs6));
                   pstt6.close();
                    break;  
                   
                
          }*/
    
    
/*try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hny_stok_takip","root","admin");
            //String sql = "insert into hny_stok_takip.kayitli_musteriler ( musteri_no, giris_kimlik, giris_sifre, musteri_ad, musteri_soyad, musteri_telefon, musteri_eposta) values (?,?,?,?,?,?,?)";           
             TableModel model = kayitli_musteri_tablosu.getModel();
        
        String arama = (String)arama_btn_kateg.getSelectedItem();
            switch(arama){
                
                case "Giriş Kimliği":
                    String yaz2 = arama_btn.getText();
                    String ara2 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE giris_kimlik LIKE '%"+yaz2+"%' ";
                    PreparedStatement pstt2 = conn.prepareStatement(ara2);
                   pstt2.setString(1, arama_btn.getText());
                   ResultSet rs2 = pstt2.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs2));
                   pstt2.close();
                    break;
                case "Müşteri Adı":
                    String yaz3 = arama_btn.getText();
                    String ara3 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_ad LIKE '"+yaz3+"%'";
                    PreparedStatement pstt3 = conn.prepareStatement(ara3);
                   pstt3.setString(1, arama_btn.getText());
                   ResultSet rs3 = pstt3.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs3));
                   pstt3.close();
                    break;
                case "Müşteri Soyadı":
                    String yaz4 = arama_btn.getText();
                   String ara4 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_soyad LIKE '"+yaz4+"%'";
                   PreparedStatement pstt4 = conn.prepareStatement(ara4);
                   pstt4.setString(1, arama_btn.getText());
                   ResultSet rs4 = pstt4.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs4));
                   pstt4.close();
                    break;  
                case "Telefon No":
                    String yaz5 = arama_btn.getText();
                    String ara5 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_telefon LIKE '"+yaz5+"%' ";
                    PreparedStatement pstt5 = conn.prepareStatement(ara5);
                   pstt5.setString(1, arama_btn.getText());
                   ResultSet rs5 = pstt5.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs5));
                   pstt5.close();
                    break;
                case "E-posta":
                    String yaz6 = arama_btn.getText();
                    String ara6 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE  musteri_eposta LIKE '"+yaz6+"%' ";
                    PreparedStatement pstt6 = conn.prepareStatement(ara6);
                   pstt6.setString(1, arama_btn.getText());
                   ResultSet rs6 = pstt6.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs6));
                   pstt6.close();
                    break;  
                    case "Müşteri No":
                   String yaz1 = arama_btn.getText();
                   String ara1 = "SELECT * FROM hny_stok_takip.kayitli_musteriler WHERE musteri_no LIKE '"+yaz1+"%'";
                   PreparedStatement pstt = conn.prepareStatement(ara1);
                   ResultSet rs = pstt.executeQuery();
                   kayitli_musteri_tablosu.setModel(DbUtils.resultSetToTableModel(rs));
                   //pstt.close();
                    break;
                   
                
          }*/


/*//String sql = "insert into hny_stok_takip.kayitli_musteriler ( musteri_no, giris_kimlik, giris_sifre, musteri_ad, musteri_soyad, musteri_telefon, musteri_eposta) values (?,?,?,?,?,?,?)";           
            String a ="SELECT kayitli_musteriler.musteri_ad FROM kayitli_musteriler";
            //PreparedStatement pst = conn.prepareStatement(sql);
            //PreparedStatement pstt = conn.prepareStatement(a);
            //ResultSet rs = pstt.executeQuery();
            //String kategorim = kategori.getSelectedItem().toString();
            //pstt.setString(1, sirano_t.getText());
           //88888888 pstt.setString(1, labelmusterino.getText());
            //pstt.setString(2, giriskimlik_t.getText() );
            //pstt.setString(3, girissifre_t.getText() );
           //8888888 pstt.setString(2, labelmusteriad.getText() );
            //888888888 pstt.setString(3, labelmusterisoyad.getText() );
            String b = conn.prepareStatement(a).toString();
            labelmusterino.setText(b);
//pstt.setString(6, telefon_t.getText() );
            //pstt.setString(7, eposta_t.getText() );
            //pstt.executeUpdate();
            //DefaultTableModel model = (DefaultTableModel)siparis_verme_tablosu.getModel();
            //model.setRowCount(0);
            //show_user();
            //JOptionPane.showMessageDialog(null,"ekleme basarılı");
            //ResultSet rs = pst.executeQuery();
            //pstt.getResultSet();*/
