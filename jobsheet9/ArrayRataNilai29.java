package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rawr;
        System.out.print("Masukkan Jumlah Mahasiswa :");
        rawr = sc.nextInt();

        int[] nilaiMhs = new int[rawr];
        double total = 0, rata2, banyak = 0, kurang = 0, ratabanyak, ratakurang, lulus=0, gaklulus=0;


        
        for (int i = 0; i < nilaiMhs.length ; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if( nilaiMhs[i]> 70) {
                lulus++;
                banyak += nilaiMhs[i] ;
            }
            else{
                gaklulus++;
                kurang += nilaiMhs[i] ;
            }
        }
        
        rata2 = total/nilaiMhs.length;
        ratabanyak = banyak/lulus;
        ratakurang = kurang/gaklulus;
        System.out.println("RATA-RATA NILAI = "+rata2);
        System.out.println("Rata-Rata nilai Siswa Lulus = " +ratabanyak);
        System.out.println("Rata-Rata nilai Siswa Tidak Lulus = " +ratakurang);
    }
}
