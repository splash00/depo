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
public class User5 {
    private String  sno ,aktif_kimlik,aktif_sifre ;
    
    public User5(  String sno ,String aktif_kimlik, String  aktif_sifre) {
        this.sno = sno ;
        this.aktif_kimlik = aktif_kimlik;
        this.aktif_sifre = aktif_sifre ;
      
   }
    
    public String getsno() {
    return sno;
    }
    public String getaktif_kimlik() {
    return aktif_kimlik;
    }
    public String getaktif_sifre() {
    return aktif_sifre;
    }

}
