package com.belajar.FADLI;

import java.util.Scanner;

public class BiodataSiswa {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel untuk menyimpan data
        String nama;
        int umur;
        String jenisKelamin;
        String alamat;
        String asalSekolah;
        String hobi;
        String citaCita;

        // Input data
        System.out.println("=============================");
        System.out.println("    PROGRAM BIODATA SISWA    ");
        System.out.println("=============================");
        System.out.println("Silakan isi biodata Anda:");

        System.out.print("Nama Lengkap: ");
        nama = input.nextLine();

        System.out.print("Umur: ");
        umur = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        System.out.print("Jenis Kelamin (L/P): ");
        jenisKelamin = input.nextLine();

        System.out.print("Alamat: ");
        alamat = input.nextLine();

        System.out.print("Asal Sekolah: ");
        asalSekolah = input.nextLine();

        System.out.print("Hobi: ");
        hobi = input.nextLine();

        System.out.print("Cita-cita: ");
        citaCita = input.nextLine();

        // Menampilkan data yang telah diinput
        System.out.println("\n=============================");
        System.out.println("      BIODATA ANDA           ");
        System.out.println("=============================");
        System.out.println("Nama         : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Jenis Kelamin: " + (jenisKelamin.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan"));
        System.out.println("Alamat       : " + alamat);
        System.out.println("Asal Sekolah : " + asalSekolah);
        System.out.println("Hobi         : " + hobi);
        System.out.println("Cita-cita    : " + citaCita);
        System.out.println("=============================");

        // Menutup Scanner
        input.close();
    }
}
