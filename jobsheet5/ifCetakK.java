package PraktikumDaspro.jobsheet5;
import java.util.Scanner;
 
public class ifCetakK {

    public static void main(String[] args) {
        boolean uktLunas;
        Scanner sc= new Scanner(System.in);

        System.out.println("---CETAK KRS SIAKAD---");
        System.out.println("APAKAH UKT LUNAS ? (true/false):");
        uktLunas =sc.nextBoolean();
        
        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan Cetak dan tanda tangan PA");

        }else{
                System.out.println("Silahkan Melunasi UKT terlebih dahulu -w-");

        }

        sc.close();
    }
}