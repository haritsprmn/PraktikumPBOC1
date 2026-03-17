
// Nama File    : Tanggal.java
// Deskripsi    : Berisi atribut dan method dalam class tanggal untuk mempermudah oprasi
// Pembuat      : Harits Permana
// Tanggal      : 16/03/2026

public class Tanggal {
    // Atribute
    private int Hari;
    private int Bulan;
    private int Tahun;
    private static Tanggal today = new Tanggal(10,3,2025);

    // Method
    // Konstruktor
    public Tanggal() {
        Hari = 00;
        Bulan = 00;
        Tahun = 0000;
    }

    public Tanggal(int hari, int bulan, int tahun) {
        Hari = hari;
        Bulan = bulan;
        Tahun = tahun;
    }

    // Selector
    public int getHari() {
        return Hari;
    }

    public int getBulan() {
        return Bulan;
    }

    public int getTahun() {
        return Tahun;
    }

    public static Tanggal getTanggalSekarang() {
        return new Tanggal(
                today.getHari(),
                today.getBulan(),
                today.getTahun());
    }

    // Mutator
    public void setHari(int h) {
        Hari = h;
    }

    public void setBulan(int b) {
        Bulan = b;
    }

    public void setTahun(int t) {
        Tahun = t;
    }

    // Fungsi Bantu
    public int getSelisihNow(String Satuan) {
        // Selektor tanggal sekarang
        int thnSekarang = today.getTahun();
        int blnSekarang = today.getBulan();
        int hariSekarang = today.getHari();

        // Selector this
        int thnThis = this.getTahun();
        int blnThis = this.getBulan();
        int hariThis = this.getHari();

        // Hitung selisih
        int thn = thnSekarang - thnThis;
        int bln = blnSekarang - blnThis;
        int hari = hariSekarang - hariThis;

        // Validasi jika hasil selisih hari minus
        if (hari < 0) {
            bln -= 1;
            int[] hariPerBulan = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            // cek tahun kabisat
            if ((thnThis % 4 == 0 && thnThis % 100 != 0) || (thnThis % 400 == 0)) {
                hariPerBulan[1] = 29;
            }
            int bulanSebelumnya = (blnThis + 10) % 12;
            hari += hariPerBulan[bulanSebelumnya];
        }

        // Vaidasi jika selisih bulan minus
        if (bln < 0) {
            thn -= 1;
            bln += 12;
        }

        switch (Satuan) {
            case "Tahun":
                return thn;
            case "Bulan":
                return thn * 12 + bln;
            case "Hari":
                return thn * 365 + bln * 30 + hari;
            default:
                return -1;
        }
    }

    // Menampilkan
    public String printTanggal() {
        String[] NamaBulan = {"Januari","Febuari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        return Hari + " " + NamaBulan[Bulan - 1] + " " + Tahun;
    }
}
