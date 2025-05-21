package com.belajar.FADLI;

public class Penjualan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Toko Kami!");

        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();

        System.out.print("Masukkan nama produk: ");
        String namaProduk = scanner.nextLine();

        System.out.print("Masukkan harga produk: ");
        int hargaProduk = scanner.nextInt();

        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = scanner.nextInt();

        int totalHarga = hargaProduk * jumlahProduk;

        System.out.println("\nStruk Pembelian");
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Produk: Rp " + hargaProduk);
        System.out.println("Jumlah Produk: " + jumlahProduk);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}
