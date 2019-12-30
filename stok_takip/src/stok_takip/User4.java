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
public class User4 {
    private String sira_no, yonetici_kimlik ,yonetici_sifre , yonetici_adi_soyadi , yonetici_telefon ;
    
    public User4(String sira_no , String yonetici_kimlik  ,String yonetici_sifre , String yonetici_adi_soyadi , String  yonetici_telefon) {
        this.sira_no = sira_no;//5555555555555555555555
        this.yonetici_kimlik = yonetici_kimlik;
        this.yonetici_sifre = yonetici_sifre ;
        this.yonetici_adi_soyadi = yonetici_adi_soyadi;
        this.yonetici_telefon = yonetici_telefon;
        
   }
    
    public String getsira_no() {
    return sira_no;
    }
    public String getyonetici_kimlik() {
    return yonetici_kimlik;
    }
    public String getyonetici_sifre() {
    return yonetici_sifre;
    }
    public String getyonetici_adi_soyadi() {
    return yonetici_adi_soyadi;
    }
    public String getyonetici_telefon() {
    return yonetici_telefon;
    }
   
    }

