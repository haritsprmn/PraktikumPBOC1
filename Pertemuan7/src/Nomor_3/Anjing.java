package Nomor_3;

// Nama File    : Anjing.java
// Deskripsi    : kelas turunan Anabul yang mendefinisikan perilaku gerak dan suara anjing.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public class Anjing extends Anabul {
    private String nama;

    public Anjing() {
        super("Anjing");
        this.nama = "Anjing";
    }
    
    public String Gerak(){
        return "Anjing bergerak dengan melata.";
    }

    public String Bersuara(){
        return "Anjing berbunyi guk-guk.";
    }
}
