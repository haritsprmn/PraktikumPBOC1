/*  Nama File   : AngkaSialException.java 
    Deskripsi   : Eksepsi buatan sendiri, menolak masukan angak 13
    Pembuat     : Harits Permana
    Tanggal     : 16 - 04 - 2026
*/

// package Pertemuan6;

public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("jangan memasukan angka 13 karena angka sial!!");
    }
}
