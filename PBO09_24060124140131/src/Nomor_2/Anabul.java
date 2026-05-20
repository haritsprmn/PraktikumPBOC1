// Nama File    : Anabul.java
// Deskripsi    : kelas abstrak induk untuk hewan anabul dengan atribut nama panggilan.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 07/05/2026

package Nomor_2;

public abstract class Anabul {
    private String panggilan;

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String panggilan) {
        this.panggilan = panggilan;
    }

    public abstract String gerak();

    public abstract String bersuara();
}
