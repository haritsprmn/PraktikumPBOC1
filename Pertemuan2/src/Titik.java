// Nama File    : Titik.java
// Deskripsi    : Berisi atribut dan method dalam class Titik
// Pembuat      : Harits Permana
// Tanggal      : 26/02/2026

public class Titik {
    /****************** ATRIBUT *********************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

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

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
