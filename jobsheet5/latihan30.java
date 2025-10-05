package PraktikumDaspro.jobsheet5;

import java.util.Scanner;

public class latihan30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kartu, regis;

        System.out.print("Apakah anda membawa kartu? (true/false): ");
        kartu = sc.nextBoolean();
        System.out.print("Apakah anda sudah registrasi? (true/false): ");
        register = sc.nextBoolean();

        if (kartu || regis) {
            System.out.println("Anda diperbolehkan masuk");
        } else {
            System.out.println("Anda tidak diperbolehkan masuk");
        }

        sc.close();
    }
}
