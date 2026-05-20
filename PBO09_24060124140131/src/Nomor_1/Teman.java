// Nama File    : Teman.java
// Deskripsi    : kelas untuk mengelola koleksi nama teman menggunakan List String.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 07/05/2026

package Nomor_1;

import java.util.ArrayList;
import java.util.List;

public class Teman {
    // Atribut untuk menyimpan jumlah elemen dan daftar nama teman
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor untuk inisialisasi atribut
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<String>();
    }

    // Getter untuk jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // Getter untuk nama pada indeks tertentu
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // Setter untuk nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // Method untuk menambahkan nama ke dalam daftar teman
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = Lnama.size();
    }

    // Method untuk menghapus nama dari daftar teman
    public boolean delNama(String nama) {
        boolean terhapus = Lnama.remove(nama);
        nbelm = Lnama.size();
        return terhapus;
    }

    // Method untuk memeriksa apakah nama tertentu ada dalam daftar teman
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Method untuk mengganti nama lama dengan nama baru
    public boolean gantiNama(String nama, String namaBaru) {
        int indeks = Lnama.indexOf(nama);

        if (indeks == -1) {
            return false;
        }

        Lnama.set(indeks, namaBaru);
        return true;
    }

    // Method untuk menghitung jumlah kemunculan nama tertentu dalam daftar teman
    public int countNama(String nama) {
        int jumlah = 0;

        for (String item : Lnama) {
            if (item.equals(nama)) {
                jumlah++;
            }
        }

        return jumlah;
    }

    // Method untuk menampilkan semua nama teman dalam daftar
    public void showTeman() {
        if (Lnama.isEmpty()) {
            System.out.println("List teman kosong.");
            return;
        }

        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}
