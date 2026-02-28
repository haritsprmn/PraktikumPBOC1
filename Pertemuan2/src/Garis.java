// Nama File    : Garis.java
// Deskripsi    : Berisi atribut dan method dalam class Garis
// Pembuat      : Harits Permana
// Tanggal      : 28/02/2026

public class Garis {
    /****************** ATRIBUT *********************/
    private Titik Ts;
    private Titik Tf;
    private static int counterGaris = 0;

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
        double A = Ts.getAbsis() - Tf.getAbsis();
        double O = Ts.getOrdinat() - Tf.getOrdinat();
        return Math.sqrt(A * A + O * O);
    }

    double getGradien() {
        double dx = Tf.getAbsis() - Ts.getAbsis();
        double dy = Tf.getOrdinat() - Ts.getOrdinat();
        if (dx == 0)
            throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal)");
        return dy / dx;
    }

    Titik getTitikTengah() {
        double A = (Ts.getAbsis() + Tf.getAbsis()) / 2;
        double O = (Ts.getOrdinat() + Tf.getOrdinat()) / 2;
        return new Titik(A, O);
    }

    boolean isSejajar(Garis G1) {
        if (Ts.getAbsis() == Tf.getAbsis() && G1.Ts.getAbsis() == G1.Tf.getAbsis())
            return true;
        return Math.abs(this.getGradien() - G1.getGradien()) < 0.000001;
    }

    boolean isTegakLurus(Garis G1) {
        if (Ts.getAbsis() == Tf.getAbsis() && G1.Ts.getOrdinat() == G1.Tf.getOrdinat())
            return true;

        if (Ts.getOrdinat() == Tf.getOrdinat() && G1.Ts.getAbsis() == G1.Tf.getAbsis())
            return true;

        return Math.abs(this.getGradien() * G1.getGradien() + 1) < 0.000001;
    }

    void printGaris() {
        System.out.println(
                "Titik awal (" + Ts.getAbsis() + "," + Ts.getOrdinat() + ") " + "Titik akhir (" + Tf.getAbsis() + ","
                        + Tf.getOrdinat() + ")");
    }

    String printPersamaan() {
        if (Ts.getAbsis() == Tf.getAbsis())
            return "x = " + Ts.getAbsis();

        double m = getGradien();
        double c = Ts.getOrdinat() - m * Ts.getAbsis();

        if (c > 0) {
            return "y = " + m + "x + " + c;
        } else if (c < 0) {
            return "y = " + m + "x - " + Math.abs(c);
        } else {
            return "y = " + m + "x";
        }
    }
}
