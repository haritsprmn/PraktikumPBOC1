/* Nama File    : IResize.java
 * Deskripsi    : Membuat interface IResize untuk mengubah ukuran bangun datar
 * Pembuat      : Harits Permana
 * Tanggal      : Kamis, 19 Maret 2026
 */

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
