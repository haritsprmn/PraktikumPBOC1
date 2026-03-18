// Nama File    : DosenTetap.java
// Deskripsi    : Berisi atribut dan method dalam class DosenTetap yang diturunkan oleh super
// Pembuat      : Harits Permana
// Tanggal      : 16/03/2026

public class DosenTetap extends Dosen {
    // Attribute
    private String NIDN;
    private int BUP;
    private static int countDosenTetap;

    // Method
    // Konstruktor
    public DosenTetap() {
        super("NULL", "NULL", new Tanggal(0,0,0), new Tanggal(0,0,0), 0, "NULL");
        this.NIDN = "NULL";
        this.BUP = 65;
        countDosenTetap++;
    }

    public DosenTetap(String NIP, String Nama, Tanggal TglLahir, Tanggal TMT, double GajiPokok, String Fakultas, String NIDN) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
        this.BUP = 65;
        countDosenTetap++;
    }

    // Selektor
    public String getNIDN(){
        return NIDN;
    }
    public int getBUP(){
        return BUP;
    }
    private double getTunjangan() {
        int Tahun = this.getTMT().getSelisihNow("Tahun");
        double persen = Tahun * 0.02;
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

    // Mutator
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    // Menampilkan
    public void printInfo(){
        int Tahun = this.getTMT().getSelisihNow("Tahun");
        System.out.println("\n\n");
        System.out.println("================= Info Dosen Tetap ==================");
        super.printInfo();
        System.out.println("NIDN : " + this.getNIDN());
        System.out.println("Tunjangan : 2% x " + Tahun + " X " + Rupiah(this.getGajiPokok()) + " = " + Rupiah(this.getTunjangan()));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Tanggal Pensiun : " + this.getTglPensiun().printTanggal());
        System.out.println("================= END Info Dosen Tetap ==================");
        System.out.println("\n\n");
    }

    public static void printCountDosenTetap(){
        System.out.println("Total Dosen Tetap : " + countDosenTetap);
    }



}
