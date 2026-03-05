// Nama File    : Kendaraan.java
// Deskripsi    : Berisi atribut dan method dalam class Kendaraan
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 5/03/2026

public class Kendaraan {
    // Atribut
    private String nopol;
    private String jenis;
    private static int countKendaraan;

    // Konstruktor
    Kendaraan() {
        nopol = "undefined";
        jenis = "undefined";
        countKendaraan++;
    }

    Kendaraan(String x, String y) {
        if (y == "motor" || y == "mobil") {
            nopol = x;
            jenis = y;
            countKendaraan++;
        }
    }

    // Selektor
    String getNopol() {
        if (nopol == null && jenis == null) {
            return "Jenis Tidak Valid";
        } else {
            return nopol;
        }
    }

    String getJenis() {
        if (nopol == null && jenis == null) {
            return "Jenis Tidak Valid";
        } else {
            return jenis;
        }
    }

    // Mutator
    void setNopol(String x) {
        nopol = x;
    }

    void setJenis(String x) {
        if (x == "motor" || x == "mobil") {
            jenis = x;
        } else {
            jenis = null;
        }
    }

    public void printKendaraan() {
        if (nopol == null || jenis == null) {
            System.out.println("Jenis Tidak Valid");
        } else {
            System.out.println("Nopol: " + nopol + "\n" + "Jenis: " + jenis);
        }
    }

    static int getCountKendaraan() {
        return countKendaraan;
    }
}
