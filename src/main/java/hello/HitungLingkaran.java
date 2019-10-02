package hello;

import java.util.Scanner;

public class HitungLingkaran {
    
    // mengitung luas lingkaran
    // untuk lingkaran yang diaksir
    public static void HitungLuasLingkaran(Scanner scan){
    
        System.out.print("masukkan banyaknya lingkaran : ");
        int rangeLingkaran = scan.nextInt();
        System.out.print("");
    
        Lingkaran[] lingkaran = new Lingkaran[rangeLingkaran];
        for (int i=0;i<rangeLingkaran;i++){
            lingkaran[i] = new Lingkaran();
            lingkaran[i].LinkaranKe = (i + 1);
            System.out.print("masukkan nilai jari-jari Lingkaran "+(i + 1)+" : ");
            lingkaran[i].JariJari = scan.nextInt();
            System.out.print("apakah Lingkaran "+(i + 1)+", diaksir? : ");
            lingkaran[i].Diaksir = scan.nextBoolean();
        }
            
        Boolean bolehHitung = (rangeLingkaran == 3) && (lingkaran[0].JariJari < lingkaran[1].JariJari && lingkaran[1].JariJari < lingkaran[2].JariJari);
        for (Lingkaran i : lingkaran){
            if (i.Diaksir && bolehHitung) {
                float hasil = 22/7 * (i.JariJari^2);
                System.out.println("hasil luas lingkaran "+i.LinkaranKe+" : " + hasil);
            }
        }
    
        
    }

    static class Lingkaran {
        public int LinkaranKe = 0;
        public int JariJari = 0;
        public Boolean Diaksir = false;
    }
}