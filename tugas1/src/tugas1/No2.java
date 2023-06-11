package tugas1;

import java.util.*;

public class No2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        //inputan
        System.out.print("Mata Kuliah: ");
        String matkul = masukan.nextLine();
        System.out.print("Masukkan Jumlah Kehadiran: ");
        int hadir = masukan.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = masukan.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = masukan.nextInt();
        
        //penyusuaian nilai sesuai kehadiran
        if (hadir < 3) {
            hadir = 0;
        }else if (hadir < 4) {
            hadir = 60;
        }else if (hadir < 6) {
            hadir = 80;
        } else {
            hadir = 100;
        }
        
        //menghitung semua nilai
       int nilai_akhir_hadir = hadir * 20 / 100;
       int nilai_akhir_uts = uts * 30 / 100;
       int nilai_akhir_uas = uas * 50 / 100;
       int nilai_akhir = nilai_akhir_hadir  + nilai_akhir_uts + nilai_akhir_uas;
       
       //penyusaian grade sesuai nilai akhir
       if (nilai_akhir < 50 ) {
           System.out.println("Nilai Akhir adalah: " + nilai_akhir + " Anda mendapat grade 'E'" );
       }else if (nilai_akhir <= 59) {
           System.out.println("Nilai Akhir adalah: " + nilai_akhir + " Anda mendapat grade 'D'" );
       }else if (nilai_akhir <= 69) {
           System.out.println("Nilai Akhir adalah: " + nilai_akhir + " Anda mendapat grade 'C'" );
       }else if (nilai_akhir <= 84) {
           System.out.println("Nilai Akhir adalah: " + nilai_akhir + " Anda mendapat grade 'B'" );
       }else {
           System.out.println("Nilai Akhir adalah: " + nilai_akhir + " Anda mendapat grade 'A'" );
       }

    }
}
