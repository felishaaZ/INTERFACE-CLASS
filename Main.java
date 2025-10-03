/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrak;

/**
 *
 * @author msi 14
 */
public class Main {
    public static void main (String[] args){
        System.out.println("SEGI EMPAT");
        SegiEmpat se = new SegiEmpat();
        
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        
        System.out.println("Luas Sebelum Diperbesar = "+se.luas);
        System.out.println("Keliling Sebelum Diperbesar = "+se.keliling);
        
        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        
        System.out.println("Luas Setelah Diperbesar = "+se.luas);
        System.out.println("Keliling Setelah Diperbesar = "+se.keliling);
        
        System.out.println(" ");
        System.out.println("LINGKARAN");
        Lingkaran li = new Lingkaran();
        
        li.jariJari = 10;
        li.keliling = 8;
        li.luas = 8;
        li.hitungKeliling();
        li.hitungLuas();
        
        System.out.println("Luas Sebelum Diperbesar = "+li.luas);
        System.out.println("Keliling Sebelum Diperbesar = "+li.keliling);
    }   
}

