/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import service.service;

/**
 *
 * @author loq
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        service serv = new service();
        int opsi;

        do {
            System.out.println("\n=== Sistem Manajemen Coworker Space ===");
            System.out.println("1. Tambah Space Coworker");
            System.out.println("2. Lihat Daftar Space Coworker");
            System.out.println("3. Ubah Data Space Coworker");
            System.out.println("4. Hapus Space Coworker");
            System.out.println("5. Cari Space Coworker");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            try {
                opsi = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                opsi = 0;
            }

            switch (opsi) {
                case 1: serv.create(); break;
                case 2: serv.read(); break;
                case 3: serv.update(); break;
                case 4: serv.delete(); break;
                case 5: serv.search(); break;
                case 6: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (opsi != 6);

        scanner.close();
    }
}