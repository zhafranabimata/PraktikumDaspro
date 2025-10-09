package jobsheet6;
import java.util.Scanner;

public class CaseMethodInputNilaiMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double nilaiuts, nilaiuas, nilaitugas, nilai1, nilai2, nilaiuts1, nilaiuas2, nilaitugas3, rataRata;
        String nama, status1, status2, huruf1, huruf2, nim, statusSemester;

        System.out.println("INPUT DATA MAHASISWA");
        System.out.print("Nama Mahasiswa :");
        nama = sc.nextLine();
        System.out.print("NIM :");
        nim = sc.nextLine();
        
        System.out.println();
        System.out.println("MATA KULIAH 1: ALGORITMA & PEMROGRAMAN");
        System.out.print("Input Nilai UTS :");
        nilaiuts = sc.nextDouble();
        System.out.print("Input Nilai UAS :");
        nilaiuas = sc.nextDouble();
        System.out.print("Input Nilai Tugas:");
        nilaitugas = sc.nextDouble();

        System.out.println("\nMATA KULIAH 2: STRUKTUR DATA");
        System.out.print("Input Nilai UTS :");
        nilaiuts1 = sc.nextDouble();
        System.out.print("Input Nilai UAS :");
        nilaiuas2 = sc.nextDouble();
        System.out.print("Input Nilai Tugas:");
        nilaitugas3 = sc.nextDouble();

        nilai1 = (nilaiuts * 0.3) + (nilaiuas * 0.4) + (nilaitugas * 0.3);
        nilai2 = (nilaiuts1 * 0.3) + (nilaiuas2 * 0.4) + (nilaitugas3 * 0.3);

        if (nilai1 >= 80) huruf1 = "A";
        else if (nilai1 >= 73) huruf1 = "B+";
        else if (nilai1 >= 65) huruf1 = "B";
        else if (nilai1 >= 60) huruf1 = "C+";
        else if (nilai1 >= 50) huruf1 = "C";
        else if (nilai1 >= 39) huruf1 = "D";
        else huruf1 = "E";
        
        if (nilai2 >= 80) huruf2 = "A";
        else if (nilai2 >= 73) huruf2 = "B+";
        else if (nilai2 >= 65) huruf2 = "B";
        else if (nilai2 >= 60) huruf2 = "C+";
        else if (nilai2 >= 50) huruf2 = "C";
        else if (nilai2 >= 39) huruf2 = "D";
        else huruf2 = "E";

        if (nilai1 >= 60) {
            status1 = "LULUS";
        } else {
            status1 = "TIDAK LULUS";
        }

        if (nilai2 >= 60) {
            status2 = "LULUS";
        } else {
            status2 = "TIDAK LULUS";
        }
        
        rataRata = (nilai1 + nilai2) / 2;

        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }

        System.out.println("\n=============== HASIL PENILAIAN AKADEMIK ===============");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);

        System.out.println("\nMATA KULIAH              | UTS  | UAS  | TUGAS | NILAI AKHIR | HURUF | STATUS");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("Algoritma & Pemrograman   | %-4.1f | %-4.1f | %-5.1f | %-12.1f | %-5s | %-12s%n", 
                          nilaiuts, nilaiuas, nilaitugas, nilai1, huruf1, status1);
        System.out.printf("Struktur Data             | %-4.1f | %-4.1f | %-5.1f | %-12.1f | %-5s | %-12s%n", 
                          nilaiuts1, nilaiuas2, nilaitugas3, nilai2, huruf2, status2);

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Rata-rata Nilai Akhir : " + rataRata);
        System.out.println("Status Semester       : " + statusSemester);
        
        sc.close();

    }

 }
    