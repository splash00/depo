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
class User1 {
    private String  musteri_no, giris_kimlik, giris_sifre, musteri_ad, musteri_soyad, musteri_telefon, musteri_eposta ;
    
    public User1(  String musteri_no ,String giris_kimlik , String  giris_sifre , String musteri_ad , String musteri_soyad , String musteri_telefon,String musteri_eposta) {
        this.musteri_no = musteri_no ;
        this.giris_kimlik = giris_kimlik;
        this.giris_sifre = giris_sifre ;
        this.musteri_ad = musteri_ad;
        this.musteri_soyad = musteri_soyad;
        this.musteri_telefon= musteri_telefon;
        //this.sira_no = sira_no;
        this.musteri_eposta = musteri_eposta;
   }
    
    public String getmusteri_no() {
    return musteri_no;
    }
    public String getgiris_kimlik() {
    return giris_kimlik;
    }
    public String getgiris_sifre() {
    return giris_sifre;
    }
    public String getmusteri_ad() {
    return musteri_ad;
    }
    public String getmusteri_soyad() {
    return musteri_soyad;
    }
    public String getmusteri_telefon() {
    return musteri_telefon;
    }
    public String getmusteri_eposta() {
    return musteri_eposta;
    }
    /*public String getsira_no() {
    return sira_no;
    }*/
    
    
    
}//user
