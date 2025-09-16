/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author loq
 */
import java.util.ArrayList;
import java.util.Scanner;
import model.model;

public class service {
    private ArrayList<model> coworkerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public service() {
        coworkerList.add(new model("C101", "Ruang meeting", 10));
        coworkerList.add(new model("C102", "Ruang meeting 2", 20));
        coworkerList.add(new model("C103", "Ruang sidang", 15));
    }

    public void create() {
        System.out.print("Masukkan kode ruang: ");
        String kode = scanner.nextLine();

        System.out.print("Masukkan nama ruang: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan kapasitas ruang: ");
        int kapasitas = scanner.nextInt();  
        scanner.nextLine();

        coworkerList.add(new model(kode, nama, kapasitas));
        System.out.println("Data berhasil ditambahkan!");
    }

    public void read() {
        if (coworkerList.isEmpty()) {
            System.out.println("Tidak ada data coworker space.");
        } else {
            System.out.println("\n--- Daftar Coworker Space ---");
            for (int i = 0; i < coworkerList.size(); i++) {
                System.out.println((i + 1) + ". " + coworkerList.get(i));
            }
        }
    }

    public void update() {
        read();
        if (coworkerList.isEmpty()) return;

        System.out.print("Pilih nomor data yang ingin diubah: ");
        int index = scanner.nextInt() - 1; 
        scanner.nextLine();

        if (index < 0 || index >= coworkerList.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        System.out.print("Masukkan kode baru: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama baru: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kapasitas baru: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();

        coworkerList.get(index).setKode(kode);
        coworkerList.get(index).setNama(nama);
        coworkerList.get(index).setKapasitas(kapasitas);

        System.out.println("Data berhasil diubah!");
    }

    public void delete() {
        read();
        if (coworkerList.isEmpty()) return;

        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= coworkerList.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        coworkerList.remove(index);
        System.out.println("Data berhasil dihapus!");
    }

    public void search() {
        System.out.print("Masukkan kode atau nama ruang: ");
        String keyword = scanner.nextLine();

        boolean ada = false;

        for (model ruang : coworkerList) {
            if (ruang.getKode().contains(keyword) || ruang.getNama().contains(keyword)) {
                System.out.println("Ketemu: " + ruang);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Data tidak ditemukan.");
        }
    }
}
