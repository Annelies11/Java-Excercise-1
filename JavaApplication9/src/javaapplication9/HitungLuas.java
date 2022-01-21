/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

public class HitungLuas {
    Scanner inp = new Scanner(System.in);
    int pilihan, hasil, a, b, c;
    
    
    
    public  HitungLuas() {
        System.out.println("Anda memilih penghitung luas.");
        System.out.print("1. Segitiga\n2. Persegi Panjang\n3. Lingkaran\nPilih angkanya : ");
        pilihan = inp.nextInt();
        
    }
    
    void hitung() {
        if(pilihan==1) {
            System.out.println("Luas segitiga : " + segitiga());
        }
        else if(pilihan==2) {
            System.out.println("Luas persegi panjang : " + persegi());
        }
        else if(pilihan==3) {
            System.out.println("Luas lingkaran : " + lingkaran());
        }
    }
    
    int segitiga() {
        System.out.print("Masukkan tinggi segitiga\nt : ");
        a = inp.nextInt();
        System.out.print("Masukkan panjang alas\na : ");
        b = inp.nextInt();
       return (a*b)/2; 
    }
    
    int lingkaran() {
        System.out.print("Masukkan jari-jari lingkaran : ");
        a = inp.nextInt();
        // masih belum
        return a;
    }
    
    int persegi() {
        
        System.out.print("Masukkan tinggi\nt : ");
        a = inp.nextInt();
        System.out.print("Masukkan panjang alas\na : ");
        b = inp.nextInt();  
        return a*b;
    }
    
    
}
