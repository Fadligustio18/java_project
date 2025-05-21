package com.belajar.FADLI;

import java.util.Scanner;

public class LuasLapanganBasket {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang lapangan basket (dalam meter): ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar lapangan basket (dalam meter): ");
        double lebar = scanner.nextDouble();

        double luas = hitungLuas(panjang, lebar);

        System.out.printf("Luas lapangan basket adalah %.2f meter persegi.%n", luas);
    }

    /**
     * Menghitung luas lapangan basket.
     *
     * @param panjang Panjang lapangan basket.
     * @param lebar   Lebar lapangan basket.
     * @return Luas lapangan basket.
     */
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
}
