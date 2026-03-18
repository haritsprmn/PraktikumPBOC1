// Nama File    : Tendik.java
// Deskripsi    : Berisi atribut dan method dalam class Tendik yang diturunkan oleh super
// Pembuat      : Harits Permana
// Tanggal      : 16/03/2026

public class Tendik extends Pegawai {
    // Atribut
    private int BUP;
    private String Bidang;
    private static int countTendik;

    // Method
    // Konstruktor
    public Tendik() {
        this("NULL", "NULL", new Tanggal(), new Tanggal(), 0, "NULL");
    }

    public Tendik(String NIP, String Nama, Tanggal TglLahir, Tanggal TMT, double GajiPokok, String Bidang) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok);
        this.BUP = 55;
        this.Bidang = Bidang;
        countTendik++;
    }

    // Selector
    private double getTunjangan() {
        int Tahun = this.getTMT().getSelisihNow("Tahun");
        double persen = Tahun * 0.01;
        return this.getGajiPokok() * persen;
    }

    public Tanggal getTglPensiun() {
        Tanggal TglLahir = this.getTglLahir();
        int thn = TglLahir.getTahun();
        int bln = TglLahir.getBulan();

        int thnPensiun = thn + BUP;
        int blnPensiun = bln + 1;
        if (blnPensiun > 12) {
            blnPensiun = 1;
            thnPensiun += 1;
        }

        return new Tanggal(1, blnPensiun, thnPensiun);
    }

    public String getBidang() {
        return Bidang;
    }

    // Menampilkan
    public void printInfo() {
        int Tahun = this.getTMT().getSelisihNow("Tahun");
        System.out.println("\n\n");
        System.out.println("================= Info Tendik ==================");
        super.printInfo();
        System.out.println("Tunjangan : 1% x " + Tahun + " X " + Rupiah(this.getGajiPokok()) + " = " + Rupiah(this.getTunjangan()));
        System.out.println("Bidang : " + this.getBidang());
        System.out.println("Tanggal Pensiun : " + this.getTglPensiun().printTanggal());
        System.out.println("================= END Info Tendik ==================");
        System.out.println("\n\n");
    }

    public static void printCountTendik() {
        System.out.println("Total Tendik : " + countTendik);
    }
}
