// Nama File    : Titik.java
// Deskripsi    : Berisi atribut dan method dalam class Titik
// Pembuat      : Harits Permana
// Tanggal      : 26/02/2026

public class Titik {
    /****************** ATRIBUT *********************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /****************** METHOD ****************************/
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // overloading
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0)
            return 1;
        if (absis < 0 && ordinat > 0)
            return 2;
        if (absis < 0 && ordinat < 0)
            return 3;
        if (absis > 0 && ordinat < 0)
            return 4;
        return 0;
    }

    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T) {
        double A = absis - T.absis;
        double O = ordinat - T.ordinat;
        return Math.sqrt(A * A + O * O);
    }

    void refleksiX() {
        ordinat = -ordinat;
    }

    void refleksiY() {
        absis = -absis;
    }

    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
