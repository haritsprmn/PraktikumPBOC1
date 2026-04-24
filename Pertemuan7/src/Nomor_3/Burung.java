package Nomor_3;

// Nama File    : Burung.java
// Deskripsi    : kelas turunan Anabul yang mendefinisikan perilaku gerak dan suara burung.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public class Burung extends Anabul {
    private String nama;

    public Burung() {
        super("Burung");
        this.nama = "Burung";
    }

    public String Gerak(){
        return "Burung bergerak dengan terbang.";
    }

    public String Bersuara(){
        return "Burung berbunyi cuit.";
    }
}
