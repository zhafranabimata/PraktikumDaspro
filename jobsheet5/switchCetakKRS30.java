package PraktikumDaspro.jobsheet5;
import java.util.Scanner;

public class switchCetakKRS30 {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.println("---CETAK KRS SIAKAD---");
            System.out.println("Saat ini Semester Berapa? (1-8)");
            int semester =sc.nextInt();

            switch (semester) {
                case 1:
                    System.out.println("KRS Semester 1 ditampilkan");
                    break;
                case 2:
                    System.out.println("KRS Semester 2 ditampilkan");
                    break;
                case 3:
                    System.out.println("KRS Semester 3 ditampilkan");
                    break;
                case 4:
                    System.out.println("KRS Semester 4 ditampilkan");
                    break;
                case 5:
                    System.out.println("KRS Semester 5 ditampilkan"); 
                    break;
                case 6:
                    System.out.println("KRS Semester 6 ditampilkan");
                    break;
                case 7:
                    System.out.println("KRS Semester 7 ditampilkan");
                    break;
                case 8:
                    System.out.println("KRS Semester 8 ditampilkan");
                    break;
                default:
                    System.out.println("Semester tidak valid");

            }    
            sc.close();
    }      
}
