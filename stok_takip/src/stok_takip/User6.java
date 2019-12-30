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
public class User6 {
    private String  musteri_no ,musteri_ad,musteri_soyad ;
    
    public User6(  String musteri_no ,String musteri_ad, String musteri_soyad) {
        this.musteri_no = musteri_no ;
        this.musteri_soyad= musteri_soyad;
        this.musteri_ad = musteri_ad ;
      
   }
    
    public String getmusteri_no() {
    return musteri_no;
    }
    public String getmusteri_soyad() {
    return musteri_soyad;
    }
    public String getmusteri_ad() {
    return musteri_ad;
    }
}
