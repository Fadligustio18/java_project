package com.belajar.FADLI;

public class Mobil {
    String warna;
    int tahunProduksi;
    int nomor_mesin;
    int nomor_rangka;

    public static void main(String[] args) {
        Mobil mobilNiaga = new Mobil();

        mobilNiaga.isi();
        mobilNiaga.tampil();

    }

    void isi() {
        warna = "merah";
        tahunProduksi = 2020;
        nomor_mesin = 12345;
        nomor_rangka = 8967;
    }

    void tampil() {
        System.out.println("warna : " + warna);
        System.out.println("tahunProduksi : " + tahunProduksi);
        System.out.println("nomor_mesin : " + nomor_mesin);
        System.out.println("nomr_rangka : " + nomor_rangka);

    }
}
