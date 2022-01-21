/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author TOSHIBA
 */
    import java.util.Scanner;
public class Gaji {
    String nama;
    int total, tunjangan,  jabatan, jmlMasuk, jmlTidak;
    Scanner masuk = new Scanner(System.in);
    
    public Gaji() {
        System.out.println("Anda memilih Penghitung gaji karyawan.");
    }
    
    void masukkan() {
        System.out.println("Nama : ");
        nama = masuk.nextLine();
        System.out.println("Jabatan : (Masukkan angkanya saja)\n1. Pimpinan\n2. Manajer\n3. Karyawan");
        jabatan = masuk.nextInt();
        System.out.println("Jumlah Masuk : ");
        jmlMasuk = masuk.nextInt();
        System.out.println("Tidak Masuk : ");
        jmlTidak = masuk.nextInt();
        
        penentuan(jabatan, jmlMasuk, jmlTidak);
    }
    void penentuan(int jab, int jml_msk, int tdk_msk) {
        if (jab==1) {
            total = (jml_msk * 100000) - (tdk_msk * 10000);
        }
        else if(jab==2) {
            total = (jml_msk * 80000) - (tdk_msk * 9000);
        }
        else if(jab==3) {
            total = (jml_msk * 70000) - (tdk_msk * 7000);
        }
    }
    
    void tampilkan() {
        System.out.println("Total Gaji "+nama+" adalah : "+total);
    }
}
