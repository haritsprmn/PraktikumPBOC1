// Nama File    : Pegawai.java
// Deskripsi    : Berisi atribut dan method dalam class pegawai yang siap di turunkan
// Pembuat      : Harits Permana
// Tanggal      : 16/03/2026

import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {
    // Atribut
    private String NIP;
    private String Nama;
    private Tanggal TglLahir;
    private Tanggal TMT;
    private double GajiPokok;
    private static int countPegawai;

    // Method
    // Konstruktor
    public Pegawai() {
        this("NULL", "NULL", new Tanggal(0, 0, 0), new Tanggal(0, 0, 0), 0);
    }

    public Pegawai(String NIP, String Nama, Tanggal TglLahir, Tanggal TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TglLahir = TglLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
        countPegawai++;
    }

    // Selektor
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public Tanggal getTglLahir() {
        return TglLahir;
    }

    public Tanggal getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return GajiPokok;
    }

    public static int getCountPegawai() {
        return countPegawai;
    }

    public String getMasaKerja() {
        int totalBulan = TMT.getSelisihNow("Bulan");
        int tahun = TMT.getSelisihNow("Tahun");

        int bulan = totalBulan % 12;

        String format = "";

        if (tahun > 0) {
            format += tahun + " tahun ";
        }
        if (bulan > 0) {
            format += bulan + " bulan ";
        }

        if (format.isEmpty()) {
            format = "TMT tidak valid";
        }

        return format.trim();
    }

    // Mutator
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setTglLahir(Tanggal TglLahir) {
        this.TglLahir = TglLahir;
    }

    public void setTMT(Tanggal TMT) {
        this.TMT = TMT;
    }

    public void setGajiPokok(double GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

    // Menampilkan
    public void printInfo() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Tanggal Lahir : " + TglLahir.printTanggal());
        System.out.println("TMT : " + TMT.printTanggal());
        System.out.println("Masa Kerja : " + this.getMasaKerja());
        System.out.println("Gaji Pokok : " + Rupiah(this.getGajiPokok()));
    }

    public static void printCountPegawai() {
        System.out.println("Total pegawai: " + countPegawai);
    }

    // Fungsi Bantu
    public String Rupiah(double angka) {
        Locale indonesia = Locale.of("id", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(indonesia);
        return format.format(angka);
    }
}
