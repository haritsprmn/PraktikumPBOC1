// Nama File    : BangunDatar.java
// Deskripsi    : Berisi atribut dan method dalam class bangun datar yang siap di turunkan
// Pembuat      : Harits Permana
// Tanggal      : 27/03/2026

public abstract class BangunDatar {
    // Atribut
    private int jmlhSisi;
    private String warna;
    private String border;
    private static int countBangunDatar;

    // Method
    // Konstruktor
    public BangunDatar() {
        this("null", "null", 0);
    }

    public BangunDatar(String warna, String border, int jmlSisi) {
        this.jmlhSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        countBangunDatar++;

    }

    // Selektor
    public int getJmlhSisi() {
        return jmlhSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    // Mutator
    public void setJmlhSisi(int jmlSisi) {
        this.jmlhSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Menampilkan
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlhSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public static void printCountBangunDatar() {
        System.out.println("Jumlah bangun datar: " + countBangunDatar);
    }
}