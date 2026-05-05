package Nomor_4;

// Nama File    : Data.java
// Deskripsi    : kelas generik Data dengan larik statik 100 elemen, setIsi, getIsi, dan getSize.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

public class Data<T> {
    private static final int MAKS_DATA = 100;
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[MAKS_DATA];
        this.banyak = 0;
    }

    public T getIsi(int posisi) {
        if (!isPosisiValid(posisi)) {
            throw new IllegalArgumentException("Posisi harus berada pada 1 sampai 100.");
        }

        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T isi) {
        if (!isPosisiValid(posisi)) {
            throw new IllegalArgumentException("Posisi harus berada pada 1 sampai 100.");
        }

        int index = posisi - 1;

        if (ruang[index] == null && isi != null) {
            banyak++;
        } else if (ruang[index] != null && isi == null) {
            banyak--;
        }

        ruang[index] = isi;
    }

    public int getSize() {
        return banyak;
    }

    private boolean isPosisiValid(int posisi) {
        return posisi >= 1 && posisi <= MAKS_DATA;
    }
}
