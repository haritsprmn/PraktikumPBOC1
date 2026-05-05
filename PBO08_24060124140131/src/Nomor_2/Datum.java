package Nomor_2;

// Nama File    : Datum.java
// Deskripsi    : kelas generik Datum dengan atribut isi, fungsi getIsi, dan prosedur setIsi.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

public class Datum<T> {
    private T isi;

    public Datum() {
        this.isi = null;
    }

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}
