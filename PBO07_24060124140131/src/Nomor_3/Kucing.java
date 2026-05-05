package Nomor_3;

// Nama File    : Kucing.java
// Deskripsi    : kelas turunan Anabul yang mendefinisikan perilaku gerak dan suara kucing.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public class Kucing extends Anabul {
    private String nama;

    public Kucing() {
        super("Kucing");
        this.nama = "Kucing";
    }

    public String Gerak(){
        return "Kucing bergerak dengan melata.";
    }

    public String Bersuara(){
        return "Kucing berbunyi meong.";
    }


}
