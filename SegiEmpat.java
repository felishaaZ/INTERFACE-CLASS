/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrak;

/**
 *
 * @author msi 14
 */
public class SegiEmpat extends BangunDatar implements Resizeable{
    public int panjang, lebar;

    @Override
    public void hitungLuas() {
        this.luas = panjang * lebar;
    }

    @Override
    public void hitungKeliling() {
        this.keliling = (2 * panjang) + 2 * lebar;
    }
    
    public void perbesar(){
        this.panjang = this.panjang * 2;
        this.lebar = this.lebar * 2;
    }
    
    public void perkecil(){
        this.panjang = this.panjang / 2;
        this.lebar = this.lebar / 2;       
    }
}
