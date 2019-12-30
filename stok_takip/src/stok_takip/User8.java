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
public class User8 {
     private String  barkod_no ,urun_adeti ;
    
    public User8(  String barkod_no ,String urun_adeti) {
        this.barkod_no = barkod_no ;
        this.urun_adeti= urun_adeti;
        //this.musteri_ad = musteri_ad ;
      
   }
    
    public String getbarkod_no() {
    return barkod_no;
    }
    public String geturun_adeti() {
    return urun_adeti;
    }
    
}
