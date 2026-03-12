// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class Dosen
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 5/03/2026

public class Dosen {
    // Attribute
    private String nip;
    private String nama;
    private String prodi;
    private static int countDosen;

    // Konstruktor default
    Dosen() {
        nip = "0";
        nama = "Default";
        prodi = "belum";
        countDosen++;
    }

    // Konstruktor dengan parameter
    Dosen(String a, String b, String c) {
        nip = a;
        nama = b;
        prodi = c;
        countDosen++;
    }

    // Selektor
    String getNip() {
        return nip;
    }

    String getNama() {
        return nama;
    }

    String getProdi() {
        return prodi;
    }

    // Mutator
    void setNip(String x) {
        nip = x;
    }

    void setNama(String x) {
        nama = x;
    }

    void setProdi(String x) {
        prodi = x;
    }

    public void printDosen() {
        System.out.println("NIP: " + nip + "\n" + "Nama: " + nama + "\n" + "Prodi: " + prodi);
    }

    static int getCountDosen() {
        return countDosen;
    }
}