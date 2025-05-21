package com.belajar.FADLI;

public class Mobilku {
    String warna;
    int tahun_produksi;
    int nomorMesin;
    int nomorRangka;

    void isi(String warna, int tahun_produksi, int nomorMesin, int nomorRangka) {
        this.warna = warna;
        this.tahun_produksi = tahun_produksi;
        this.nomorMesin = nomorMesin;
        this.nomorRangka = nomorRangka;

    }

    String ambil_warna() {
        return warna;

    }

    int ambil_tahun_produksi() {
        return tahun_produksi;
    }

    int ambil_nomorMesin() {
        return nomorMesin;
    }

    int ambil_nomorRangka() {
        return nomorRangka;
    }

    public static void main(String[] args) {
        Mobilku mobilNiaga = new Mobilku();

        mobilNiaga.isi("Putih", 2018, 23456, 89567);
        System.out.println("warna : " + mobilNiaga.ambil_warna());
        System.out.println("tahun produksi : " + mobilNiaga.ambil_tahun_produksi());
        System.out.println("nomorMesin : " + mobilNiaga.ambil_nomorMesin());
        System.out.println("nomorRangka: " + mobilNiaga.ambil_nomorRangka());
    }

}
