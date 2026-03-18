// Nama File    : DosenTamu.java
// Deskripsi    : Berisi atribut dan method dalam class DosenTamu yang diturunkan oleh super
// Pembuat      : Harits Permana
// Tanggal      : 16/03/2026

public class DosenTamu extends Dosen {
    // Atribute
    private String NIDK;
    private Tanggal EndKontrak;
    private static int countDosenTamu;

    // Method
    // Konstruktor
    public DosenTamu() {
        super("NULL", "NULL", new Tanggal(0, 0, 0), new Tanggal(0, 0, 0), 0, "NULL");
        this.NIDK = "NULL";
        this.EndKontrak = new Tanggal(0, 0, 0);
        countDosenTamu++;
    }

    public DosenTamu(String NIP, String Nama, Tanggal TglLahir, Tanggal TMT, double GajiPokok, String Fakultas,
            String NIDK, Tanggal EndKontrak) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.EndKontrak = EndKontrak;
        countDosenTamu++;
    }

    // Selektor
    public String getNIDK() {
        return NIDK;
    }

    public Tanggal getEndKontrak() {
        return EndKontrak;
    }

    public double getTunjangan() {
        int Tahun = this.getTMT().getSelisihNow("Tahun");
        double persen = Tahun * 0.02;
        return this.getGajiPokok() * persen;
    }

    public int getSisaKontrakBulan() {
        int hasil = EndKontrak.getSelisihNow("Bulan");
        if (hasil <= 0) {
            return 0;
        }
        return hasil;
    }

    // Mutator
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    // Menampilkan
    public void printInfo() {
        int Tahun = this.getTMT().getSelisihNow("Tahun");
        System.out.println("\n\n");
        System.out.println("================= Info Dosen Tamu ==================");
        super.printInfo();
        System.out.println("NIDK : " + this.getNIDK());
        System.out.println("Tunjangan : 2% x " + Tahun + " X " + Rupiah(this.getGajiPokok()) + " = "
                + Rupiah(this.getTunjangan()));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Sisa Kontrak : " + getSisaKontrakBulan() + " bulan");
        System.out.println("================= END Info Dosen Tamu ==================");
        System.out.println("\n\n");
    }

    public static void printCountDosenTamu() {
        System.out.println("Total Dosen Tamu : " + countDosenTamu);
    }
}
