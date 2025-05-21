package com.belajar.FADLI;

public class tagihan {
    public static void main(String[] args) {
        function hitungTagihanPDAM(){

            let namaPelanggan = prompt("Masukkan nama pelanggan:");
            let alamatPelanggan = prompt("Masukkan alamat pelanggan:");
            let jenisTarif = prompt("Masukan jenis tarif (R1/R2/R3):");
            let jumlahPemakaian = parseint(prompt("Masukkan jumlah pemakaian(m3):"));

            let hargaTarifR1 = 2500;
            let hargaTarifR2 = 5000;
            let hargaTarifR3 = 7500;

            let tagihan;
            if (jenisTarif == "R1"){
                tagihan = jumlahPemakaian * hargaTarifR1;
            }   else if (jenisTarif == "R2"){
                tagihan = jumlahPemakaian * hargaTarifR2;

            }   else if (jenisTarif == "R3"){
                tagihan = jumlahPemakaian * hargaTarifR3;
                                                                
            }   else{
                alert("Jenis tarif tidak valid!");
                return;
            }

        }    
        

        hitungTagihanPDAM();
    
    }

}
