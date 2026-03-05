// Nama File    : MataKuliah.java
// Deskripsi    : Berisi atribut dan method dalam class MataKuliah
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 5/03/2026

public class MataKuliah {
    // Atribute
    private String idMatkul;
    private String nama;
    private int sks;
    private static int countMatkul;

    // Konstruktor
    MataKuliah() {
        idMatkul = "0";
        nama = "Default";
        sks = 0;
        countMatkul++;
    }

    MataKuliah(String x, String y, int z) {
        idMatkul = x;
        nama = y;
        sks = z;
        countMatkul++;
    }

    // Selektor
    String getIdMatkul() {
        return idMatkul;
    }

    String getNama() {
        return nama;
    }

    int getSks() {
        return sks;
    }

    // Mutator
    void setIdMatkul(String x) {
        idMatkul = x;
    }

    void setNama(String x) {
        nama = x;
    }

    void setSks(int x) {
        sks = x;
    }

    public void printMatkul() {
        System.out.println("ID: " + idMatkul + "\n" + "Nama: " + nama + "\n" + "SKS: " + sks);
    }

    static int getCountMatkul() {
        return countMatkul;
    }
}
