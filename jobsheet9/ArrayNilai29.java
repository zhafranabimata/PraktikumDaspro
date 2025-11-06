package jobsheet9;
import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiakhir = new int[10];

        for (int i = 0; i < nilaiakhir.length ; i++){
            System.out.print("Masukkan Nilai akhir ke- "+i+" : ");
            nilaiakhir[i] = sc.nextInt();

        }
        for (int i = 0; i < nilaiakhir.length ; i++) {
            if( nilaiakhir[i] > 70) {
                System.out.println("Nilai akhir ke- "+i+ " LULUS");
            }    
            else {
                System.out.println("Nilai akhir ke- "+i+ " TIDAK LULUS");
            } 
            
        }
    }
}
