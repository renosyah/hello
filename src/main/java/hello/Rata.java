package hello;

import java.util.Scanner;

public class Rata {

    // mengitung rata-rata bilangan
    public static void RataRataEmpatBilangan(Scanner scan) {
    
        System.out.print("masukkan range bilangan : ");
        int rangeBilangan = scan.nextInt();
        System.out.print("");
    
        float[] bilangan = new float[rangeBilangan];
        for (int i=0;i<rangeBilangan;i++){
            System.out.print("masukkan bilangan "+(i + 1)+" : ");
            bilangan[i] = scan.nextFloat();
        }
            
        float total = 0.0f ;
        for (float i : bilangan){
           total += i;
        }
    
        System.out.println("\nhasil penjumlahan : " + total);
        float rataRata = (total/rangeBilangan);
        System.out.println("hasil rata-rata : " + rataRata);
    }
}