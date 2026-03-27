// Nama File    : BangunDatar.java
// Deskripsi    : Berisi atribut dan method dalam class bangun datar yang siap di turunkan
// Pembuat      : Harits Permana
// Tanggal      : 27/03/2026

public class Lingkaran extends BangunDatar {
    // Atribute
    private double jari;
    private static int countLingkaran;

    // Konstruktor
    public Lingkaran() {
        super(null, null, 1);
        this.jari = 0;
        countLingkaran++;
    }

    public Lingkaran(String warna, String border, double jari) {
        super(warna, border, 1);
        this.jari = jari;
        countLingkaran++;
    }

    // Selector
    public double getJari() {
        return jari;
    }

    public double getLuas() {
        return Math.PI * (jari * jari);
    }

    public double getKeliling() {
        return Math.PI * (2 * jari);
    }

    public static int getCountLingkaran() {
        return Lingkaran.countLingkaran;
    }

    // Mutator
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Menampilkan
    public static void printCountLingkaran() {
        System.out.println("Jumlah lingkaran: " + Lingkaran.getCountLingkaran());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("jari: " + jari);
        System.out.println("Luas Lingkaran: " + getLuas());
        System.out.println("Keliling Lingkaran: " + getKeliling());
    }
}
