/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;


import java.util.Scanner;


public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Assalamualaikum");
      //  System.out.println("Masukkan namamu : ");
      //  String nama = inp.nextLine();
      //  System.out.println("Hai, " + nama);
        System.out.println("Masukkan pilihan program yang anda inginkan :");
        System.out.println("1.Penghitung gaji\n2.Membuat segitiga\n3.Penghitung luas");
        
        int pilihan = inp.nextInt();
        if (pilihan==1) {
           // System.out.println("Anda memilih penghitung gaji.");
            Gaji orang1=new Gaji();
            orang1.masukkan();
            orang1.tampilkan();
        }
        else if(pilihan==2) {
            BuatSegitiga seg1=new BuatSegitiga();
        }
        else if(pilihan==3) {
            HitungLuas bangun1=new HitungLuas();
            bangun1.hitung();
        }
        else {
            System.out.println("Pilihan anda salah!");
        }
         
    }
    
}
