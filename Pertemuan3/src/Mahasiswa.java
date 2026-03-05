// Nama File    : Mahasiswa.java
// Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 5/03/2026

import java.util.ArrayList;

public class Mahasiswa {
    // Atribute
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Konstruktor
    Mahasiswa() {
        nim = "0";
        nama = "Default";
        prodi = "Belum";
        listMatkul = new ArrayList<>();
    }

    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatkul = new ArrayList<>();
    }

    // Selektor
    String getNim() {
        return nim;
    }

    String getNama() {
        return nama;
    }

    String getProdi() {
        return prodi;
    }

    Dosen getDosenWali() {
        return dosenWali;
    }

    Kendaraan getKendaraan() {
        return kendaraan;
    }

    int getJumlahSKS() {
        int count = 0;
        for (MataKuliah m : listMatkul) {
            count = count + m.getSks();
        }
        return count;
    }

    // Mutator
    void setNim(String nim) {
        this.nim = nim;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setProdi(String prodi) {
        this.prodi = prodi;
    }

    void setDosenWali(Dosen d) {
        dosenWali = d;
    }

    void setKendaraan(Kendaraan k) {
        kendaraan = k;
    }

    // Menambah mata kuliah
    void addMatkul(MataKuliah m) {
        listMatkul.add(m);
    }

    // Print data mahasiswa
    void printMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMahasiswa() {

        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);

        System.out.println("\nDosen Wali:");
        if (dosenWali != null) {
            dosenWali.printDosen();
        }

        System.out.println("\nKendaraan:");
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }

        System.out.println("\nDaftar Mata Kuliah:");
        for (MataKuliah m : listMatkul) {
            m.printMatkul();
            System.out.println();
        }
    }
}
