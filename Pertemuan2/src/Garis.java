// Nama File    : Garis.java
// Deskripsi    : Berisi atribut dan method dalam class Garis
// Pembuat      : Harits Permana
// Tanggal      : 28/02/2026

public class Garis {
    /****************** ATRIBUT *********************/
    Titik Ts;
    Titik Tf;
    static int counterGaris = 0;

    /****************** METHOD ****************************/
    // Konstruktor untuk membuat garis
    Garis() {
        Ts = new Titik(0, 0);
        Tf = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik T1, Titik T2) {
        Ts = T1;
        Tf = T2;
        counterGaris++;
    }

    // Selektor untuk mengambil titik
    Titik getTitikAwal() {
        return Ts;
    }

    Titik getTitikAkhir() {
        return Tf;
    }

    static int getCountGaris() {
        return counterGaris;
    }

    // Mutator untuk mengset titik
    void setTitikAwal(Titik T1) {
        Ts = T1;
    }

    void setTitikAkhir(Titik T2) {
        Tf = T2;
    }

    double getPanjang() {
        double A = Ts.absis - Tf.absis;
        double O = Ts.ordinat - Tf.ordinat;
        return Math.sqrt(A * A + O * O);
    }

    double getGradien() {
        double dx = Tf.absis - Ts.absis;
        double dy = Tf.ordinat - Ts.ordinat;
        if (dx == 0)
            throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal)");
        return dy / dx;
    }

    Titik getTitikTengah() {
        double A = (Ts.absis + Tf.absis) / 2;
        double O = (Ts.ordinat + Tf.ordinat) / 2;
        return new Titik(A, O);
    }

    boolean isSejajar(Garis G1) {
        if (Ts.absis == Tf.absis && G1.Ts.absis == G1.Tf.absis)
            return true;
        return Math.abs(this.getGradien() - G1.getGradien()) < 0.000001;
    }

    boolean isTegakLurus(Garis G1) {
        if (Ts.absis == Tf.absis && G1.Ts.ordinat == G1.Tf.ordinat)
            return true;

        if (Ts.ordinat == Tf.ordinat && G1.Ts.absis == G1.Tf.absis)
            return true;

        return Math.abs(this.getGradien() * G1.getGradien() + 1) < 0.000001;
    }

    void printGaris() {
        System.out.println("Titik awal (" + Ts.absis + "," + Ts.ordinat + ") " + "Titik akhir (" + Tf.absis + ","
                + Tf.ordinat + ")");
    }

    String printPersamaan() {
        if (Ts.absis == Tf.absis)
            return "x = " + Ts.absis;

        double m = getGradien();
        double c = Ts.ordinat - m * Ts.absis;

        if (c > 0) {
            return "y = " + m + "x + " + c;
        } else if (c < 0) {
            return "y = " + m + "x - " + Math.abs(c);
        } else {
            return "y = " + m + "x";
        }
    }
}
