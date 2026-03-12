public class Persegi extends BangunDatar {
    // Atribut
    private double sisi;
    private static int countPersegi;

    // Method
    // Konstruktor
    public Persegi() {
        super(null, null, 4);
        this.sisi = 0;
        countPersegi++;
    }

    public Persegi(double sisi, String warna, String border) {
        super(warna, border, 4);
        this.sisi = sisi;
        countPersegi++;
    }

    // Selektor
    public double getSisi() {
        return sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return sisi * 4;
    }

    public double getDiagonal() {
        return Math.sqrt(sisi * sisi + sisi * sisi);
    }

    public static int getCounterPersegi() {
        return Persegi.countPersegi;
    }

    // Mutator
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Tampilkan
    public static void printCountPersegi() {
        System.out.println("Jumlah persegi: " + getCounterPersegi());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Panjang Sisi: " + sisi);
        System.out.println("Luas Persegi: " + getLuas());
        System.out.println("Keliling Persegi: " + getKeliling());
        System.out.println("Diagonal Persegi: " + getDiagonal());

    }
}
