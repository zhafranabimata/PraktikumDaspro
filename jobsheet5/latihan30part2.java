package PraktikumDaspro.jobsheet5;

import java.util.Scanner;

public class latihan30part2 {
    public static void main(String[] args) {
        String user;
        int nilai;

        Scanner input = new Scanner(System.in);

        System.out.print("Anda sebagai apa? (Dosen/Mahasiswa): ");
        user = input.nextLine();

        System.out.println("==============================");

        if (user.equalsIgnoreCase("dosen")) {
            System.out.println("Anda diberikan akses wifi (dosen)");
        } else if (user.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Input SKS anda: ");
            nilai = input.nextInt();

            if (nilai >= 12) {
                System.out.println("Anda diberikan akses wifi (mahasiswa)");
            } else {
                System.out.println("Akses wifi ditolak");
            }
        } else {
            System.out.println("Akses ditolak");
        } 
     
        input.close(); 
    } 
}  
